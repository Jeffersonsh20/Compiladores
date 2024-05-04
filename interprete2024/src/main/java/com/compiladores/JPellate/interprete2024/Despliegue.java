package com.compiladores.JPellate.interprete2024;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import com.compiladores.practica1.interprete2024.JPellateLexer;
import com.compiladores.practica1.interprete2024.JPellateParser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Despliegue extends JFrame {

    private JTextArea textArea;
    private JTable tablaErrores, tablaTokens;

    public Despliegue(String[] args) {
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI(args);
        setVisible(true);
    }

    private void initUI(String[] args) {
        // Menú
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Archivo");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem compileItem = new JMenuItem("Compilar");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(compileItem);

        // Pestañas
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel editorPanel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        editorPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        tabbedPane.addTab("Editor", editorPanel);

        JPanel errorsPanel = new JPanel(new BorderLayout());
        tablaErrores = new JTable(new DefaultTableModel(new Object[]{"ID", "Tipo", "Descripción"}, 0));
        errorsPanel.add(new JScrollPane(tablaErrores), BorderLayout.CENTER);
        tabbedPane.addTab("Errores", errorsPanel);

        JPanel tokensPanel = new JPanel(new BorderLayout());
        tablaTokens = new JTable(new DefaultTableModel(new Object[]{"ID", "Token", "Tipo"}, 0));
        tokensPanel.add(new JScrollPane(tablaTokens), BorderLayout.CENTER);
        tabbedPane.addTab("Tokens", tokensPanel);

        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // Eventos del menú
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());
        compileItem.addActionListener(e -> compileCode(args));
    }

    private void openFile() {
        // Crear un JFileChooser para seleccionar el archivo
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JPT", "jpt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File archivo = chooser.getSelectedFile();
            try {
                // Leer el archivo seleccionado
                FileReader reader = new FileReader(archivo);
                BufferedReader br = new BufferedReader(reader);
                String linea;
                textArea.setText(""); // Limpiar el JTextArea
                // Leer todas las líneas del archivo y añadirlas al JTextArea
                while ((linea = br.readLine()) != null) {
                    textArea.append(linea + "\n");
                }
                br.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void saveFile() {
        // Crear un JFileChooser para seleccionar el archivo donde guardar
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JPT", "jpt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(this);  // Asegúrate de que 'this' apunte a tu instancia JFrame
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File archivo = chooser.getSelectedFile();
            try {
                // Escribir el contenido del JTextArea en el archivo seleccionado
                FileWriter writer = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(textArea.getText());
                bw.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void compileCode(String[] args) {
        // Implementar la lógica de compilar código
    	try {
            // Crea un objeto File que represente el archivo que quieres sobrescribir
            File archivo = new File("/home/compiladores/workspace/interprete2024/test/test.jpt");

            // Lee el contenido actual del archivo y guárdalo en una variable
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String contenidoActual = "";
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                contenidoActual += linea + "\n";
            }
            reader.close();

            // Obtén el contenido actual del JTextArea
            String contenidoNuevo = textArea.getText();

            // Escribe el contenido del JTextArea en el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            writer.write(contenidoNuevo);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    	
    	String program = args.length > 1 ? args[1] : "test/test." + "jpt";

    	try{
    				
    				System.out.println("Interpreting file " + program);

    				JPellateLexer lexer = new JPellateLexer(new ANTLRFileStream(program));
    				CommonTokenStream tokens = new CommonTokenStream(lexer);
    				JPellateParser parser = new JPellateParser(tokens);
    				MyLexerErrorListener lexerErrorListener = new MyLexerErrorListener();
    			    MyParserErrorListener parserErrorListener = new MyParserErrorListener();
    			    lexer.removeErrorListeners(); 
    			    lexer.addErrorListener(lexerErrorListener);
    			    parser.removeErrorListeners(); 
    			    parser.addErrorListener(parserErrorListener);

    				
    				
    				JPellateParser.StartContext tree = parser.start();
    				String[] errors = new String[lexerErrorListener.getErrors().size() + parserErrorListener.getErrors().size()];
	    		    String[] tipo_error = new String[lexerErrorListener.getErrors().size() + parserErrorListener.getErrors().size()];
	    		    int y = 0;
	    		    if (lexerErrorListener.hasErrors()) {
	    		        for (String error : lexerErrorListener.getErrors()) {
	    		        	errors[y] = error;
	    		        	tipo_error[y] = "LEXICO";
	    		        	y++;
	    		        }
	    		        DefaultTableModel modeloLimpieza = (DefaultTableModel) tablaTokens.getModel();
	    		        modeloLimpieza.setRowCount(0);
	    		    	DefaultTableModel modelo = (DefaultTableModel) tablaErrores.getModel();
		         		String[] nuevosEncabezados = {"ID", "TIPO", "DESCRIPCION"};
		         		modelo.setColumnIdentifiers(nuevosEncabezados);
		         		modelo.setRowCount(errors.length);
		         		for (int i = 0; i < errors.length; i++) {
		         		   tablaErrores.setValueAt(i, i, 0); 
		         		   tablaErrores.setValueAt(tipo_error[i], i, 1); 
		         		   tablaErrores.setValueAt(errors[i], i, 2); 
		         		}
	    		    }
	    		    if (parserErrorListener.hasErrors()) {
	    		        for (String error : parserErrorListener.getErrors()) {
	    		        	errors[y] = error;
	    		        	tipo_error[y] = "SINTACTICO";
	    		        	y++;
	    		        }
	    		        
	    		        DefaultTableModel modeloLimpieza = (DefaultTableModel) tablaTokens.getModel();
	    		        modeloLimpieza.setRowCount(0);
	    		        DefaultTableModel modelo = (DefaultTableModel) tablaErrores.getModel();
		         		String[] nuevosEncabezados = {"ID", "TIPO", "DESCRIPCION"};
		         		modelo.setColumnIdentifiers(nuevosEncabezados);
		         		modelo.setRowCount(errors.length);
		         		for (int i = 0; i < errors.length; i++) {
		         		   tablaErrores.setValueAt(i, i, 0); 
		         		   tablaErrores.setValueAt(tipo_error[i], i, 1); 
		         		   tablaErrores.setValueAt(errors[i], i, 2); 
		         		}
	    		    }
    				
    			    if (!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()) {
    			    	
    					String[] nombresTokens = new String[tokens.getTokens().size()];
    			 		int[] tipoTokens = new int[tokens.getTokens().size()];
    			 		int x = 0;
    			 		for (Object token : tokens.getTokens()) {
    			 			if (token instanceof Token) {
    			 				nombresTokens[x] = ((Token) token).getText();
    			 				tipoTokens[x] = ((Token) token).getType();
    			 		        x++;
    			 		    }	
    			 		}
    			 		
    			 		Util utl = new Util();
    			 		String[] validar = utl.quitarRepetidos(nombresTokens,tipoTokens,1);
    			 		String[] tipos = utl.quitarRepetidos(nombresTokens,tipoTokens,2);
    			 		int[] tiposMutacion = new int [tipos.length];
    			 		for (int i = 0; i < tipos.length; i++) {
    			 		   tiposMutacion[i] = Integer.parseInt(tipos[i]);
    			 		   
    			 		}
String[] tiposNombres = utl.validorTokens(tiposMutacion);
		         		
		         		
		         		DefaultTableModel modeloLimpieza = (DefaultTableModel) tablaErrores.getModel();
	    		        modeloLimpieza.setRowCount(0);
		         		DefaultTableModel modelo = (DefaultTableModel) tablaTokens.getModel();
		         		String[] nuevosEncabezados = {"ID", "TOKENS", "TIPO"};
		         		modelo.setColumnIdentifiers(nuevosEncabezados);
		         		modelo.setRowCount(nombresTokens.length);
		         		for (int i = 0; i < validar.length; i++) {
		         		   tablaTokens.setValueAt(i, i, 0); 
		         		   tablaTokens.setValueAt(validar[i], i, 1); 
		         		   tablaTokens.setValueAt(tiposNombres[i], i, 2); 
		         		}

		         		JPellateCustomVisitor visitor1 = new JPellateCustomVisitor();
		         		visitor1.visit(tree);
    					System.out.println("Interpretation finished");
    			    }	
    			}catch (IOException e) {
    				System.out.println("ERROR");
    			}
    		}

    	
    	


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Despliegue(args));
    }
}
