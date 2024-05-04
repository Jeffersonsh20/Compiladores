// Generated from com/compiladores/practica1/interprete2024/JPellate.g4 by ANTLR 4.5.1
package com.compiladores.practica1.interprete2024;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JPellateParser}.
 */
public interface JPellateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JPellateParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JPellateParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JPellateParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(JPellateParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(JPellateParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#v_asignar}.
	 * @param ctx the parse tree
	 */
	void enterV_asignar(JPellateParser.V_asignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#v_asignar}.
	 * @param ctx the parse tree
	 */
	void exitV_asignar(JPellateParser.V_asignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#v_asignar_valor_P_NUMERO}.
	 * @param ctx the parse tree
	 */
	void enterV_asignar_valor_P_NUMERO(JPellateParser.V_asignar_valor_P_NUMEROContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#v_asignar_valor_P_NUMERO}.
	 * @param ctx the parse tree
	 */
	void exitV_asignar_valor_P_NUMERO(JPellateParser.V_asignar_valor_P_NUMEROContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#v_asignar_valor_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void enterV_asignar_valor_P_TEXTO(JPellateParser.V_asignar_valor_P_TEXTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#v_asignar_valor_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void exitV_asignar_valor_P_TEXTO(JPellateParser.V_asignar_valor_P_TEXTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_s_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void enterC_s_P_TEXTO(JPellateParser.C_s_P_TEXTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_s_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void exitC_s_P_TEXTO(JPellateParser.C_s_P_TEXTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_s_variable}.
	 * @param ctx the parse tree
	 */
	void enterC_s_variable(JPellateParser.C_s_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_s_variable}.
	 * @param ctx the parse tree
	 */
	void exitC_s_variable(JPellateParser.C_s_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_s_combinado}.
	 * @param ctx the parse tree
	 */
	void enterC_s_combinado(JPellateParser.C_s_combinadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_s_combinado}.
	 * @param ctx the parse tree
	 */
	void exitC_s_combinado(JPellateParser.C_s_combinadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_e_nuevo}.
	 * @param ctx the parse tree
	 */
	void enterC_e_nuevo(JPellateParser.C_e_nuevoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_e_nuevo}.
	 * @param ctx the parse tree
	 */
	void exitC_e_nuevo(JPellateParser.C_e_nuevoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_e_viejo}.
	 * @param ctx the parse tree
	 */
	void enterC_e_viejo(JPellateParser.C_e_viejoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_e_viejo}.
	 * @param ctx the parse tree
	 */
	void exitC_e_viejo(JPellateParser.C_e_viejoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#if_unitario}.
	 * @param ctx the parse tree
	 */
	void enterIf_unitario(JPellateParser.If_unitarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#if_unitario}.
	 * @param ctx the parse tree
	 */
	void exitIf_unitario(JPellateParser.If_unitarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(JPellateParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(JPellateParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#if_elseif}.
	 * @param ctx the parse tree
	 */
	void enterIf_elseif(JPellateParser.If_elseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#if_elseif}.
	 * @param ctx the parse tree
	 */
	void exitIf_elseif(JPellateParser.If_elseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(JPellateParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(JPellateParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#sw_switch}.
	 * @param ctx the parse tree
	 */
	void enterSw_switch(JPellateParser.Sw_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#sw_switch}.
	 * @param ctx the parse tree
	 */
	void exitSw_switch(JPellateParser.Sw_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#otro}.
	 * @param ctx the parse tree
	 */
	void enterOtro(JPellateParser.OtroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#otro}.
	 * @param ctx the parse tree
	 */
	void exitOtro(JPellateParser.OtroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#otro_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void enterOtro_P_TEXTO(JPellateParser.Otro_P_TEXTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#otro_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void exitOtro_P_TEXTO(JPellateParser.Otro_P_TEXTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#otro_P_NUMERO}.
	 * @param ctx the parse tree
	 */
	void enterOtro_P_NUMERO(JPellateParser.Otro_P_NUMEROContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#otro_P_NUMERO}.
	 * @param ctx the parse tree
	 */
	void exitOtro_P_NUMERO(JPellateParser.Otro_P_NUMEROContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_while(JPellateParser.Ciclo_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_while(JPellateParser.Ciclo_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(JPellateParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(JPellateParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#rango}.
	 * @param ctx the parse tree
	 */
	void enterRango(JPellateParser.RangoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#rango}.
	 * @param ctx the parse tree
	 */
	void exitRango(JPellateParser.RangoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#rango_P_NUMERO}.
	 * @param ctx the parse tree
	 */
	void enterRango_P_NUMERO(JPellateParser.Rango_P_NUMEROContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#rango_P_NUMERO}.
	 * @param ctx the parse tree
	 */
	void exitRango_P_NUMERO(JPellateParser.Rango_P_NUMEROContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#rango_v_iz}.
	 * @param ctx the parse tree
	 */
	void enterRango_v_iz(JPellateParser.Rango_v_izContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#rango_v_iz}.
	 * @param ctx the parse tree
	 */
	void exitRango_v_iz(JPellateParser.Rango_v_izContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#rango_v_de}.
	 * @param ctx the parse tree
	 */
	void enterRango_v_de(JPellateParser.Rango_v_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#rango_v_de}.
	 * @param ctx the parse tree
	 */
	void exitRango_v_de(JPellateParser.Rango_v_deContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#rango_v}.
	 * @param ctx the parse tree
	 */
	void enterRango_v(JPellateParser.Rango_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#rango_v}.
	 * @param ctx the parse tree
	 */
	void exitRango_v(JPellateParser.Rango_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#funciones_p}.
	 * @param ctx the parse tree
	 */
	void enterFunciones_p(JPellateParser.Funciones_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#funciones_p}.
	 * @param ctx the parse tree
	 */
	void exitFunciones_p(JPellateParser.Funciones_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#funcion_nr_vacio}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_nr_vacio(JPellateParser.Funcion_nr_vacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#funcion_nr_vacio}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_nr_vacio(JPellateParser.Funcion_nr_vacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#funcion_nr_variables}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_nr_variables(JPellateParser.Funcion_nr_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#funcion_nr_variables}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_nr_variables(JPellateParser.Funcion_nr_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#funcion_sr_vacio}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_sr_vacio(JPellateParser.Funcion_sr_vacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#funcion_sr_vacio}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_sr_vacio(JPellateParser.Funcion_sr_vacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#funcion_sr_variables}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_sr_variables(JPellateParser.Funcion_sr_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#funcion_sr_variables}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_sr_variables(JPellateParser.Funcion_sr_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#rtr}.
	 * @param ctx the parse tree
	 */
	void enterRtr(JPellateParser.RtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#rtr}.
	 * @param ctx the parse tree
	 */
	void exitRtr(JPellateParser.RtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#vrt}.
	 * @param ctx the parse tree
	 */
	void enterVrt(JPellateParser.VrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#vrt}.
	 * @param ctx the parse tree
	 */
	void exitVrt(JPellateParser.VrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(JPellateParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(JPellateParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_normal}.
	 * @param ctx the parse tree
	 */
	void enterC_normal(JPellateParser.C_normalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_normal}.
	 * @param ctx the parse tree
	 */
	void exitC_normal(JPellateParser.C_normalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_normal_and}.
	 * @param ctx the parse tree
	 */
	void enterC_normal_and(JPellateParser.C_normal_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_normal_and}.
	 * @param ctx the parse tree
	 */
	void exitC_normal_and(JPellateParser.C_normal_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_normal_or}.
	 * @param ctx the parse tree
	 */
	void enterC_normal_or(JPellateParser.C_normal_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_normal_or}.
	 * @param ctx the parse tree
	 */
	void exitC_normal_or(JPellateParser.C_normal_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void enterC_P_TEXTO(JPellateParser.C_P_TEXTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_P_TEXTO}.
	 * @param ctx the parse tree
	 */
	void exitC_P_TEXTO(JPellateParser.C_P_TEXTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_P_TEXTO_iz}.
	 * @param ctx the parse tree
	 */
	void enterC_P_TEXTO_iz(JPellateParser.C_P_TEXTO_izContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_P_TEXTO_iz}.
	 * @param ctx the parse tree
	 */
	void exitC_P_TEXTO_iz(JPellateParser.C_P_TEXTO_izContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_P_TEXTO_de}.
	 * @param ctx the parse tree
	 */
	void enterC_P_TEXTO_de(JPellateParser.C_P_TEXTO_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_P_TEXTO_de}.
	 * @param ctx the parse tree
	 */
	void exitC_P_TEXTO_de(JPellateParser.C_P_TEXTO_deContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_num_iz}.
	 * @param ctx the parse tree
	 */
	void enterC_num_iz(JPellateParser.C_num_izContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_num_iz}.
	 * @param ctx the parse tree
	 */
	void exitC_num_iz(JPellateParser.C_num_izContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPellateParser#c_num_de}.
	 * @param ctx the parse tree
	 */
	void enterC_num_de(JPellateParser.C_num_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPellateParser#c_num_de}.
	 * @param ctx the parse tree
	 */
	void exitC_num_de(JPellateParser.C_num_deContext ctx);
}