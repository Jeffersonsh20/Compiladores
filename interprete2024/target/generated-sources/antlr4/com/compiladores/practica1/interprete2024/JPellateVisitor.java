// Generated from com/compiladores/practica1/interprete2024/JPellate.g4 by ANTLR 4.5.1
package com.compiladores.practica1.interprete2024;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JPellateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JPellateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JPellateParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JPellateParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(JPellateParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#v_asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_asignar(JPellateParser.V_asignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#v_asignar_valor_P_NUMERO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_asignar_valor_P_NUMERO(JPellateParser.V_asignar_valor_P_NUMEROContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#v_asignar_valor_P_TEXTO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_asignar_valor_P_TEXTO(JPellateParser.V_asignar_valor_P_TEXTOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_s_P_TEXTO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_s_P_TEXTO(JPellateParser.C_s_P_TEXTOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_s_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_s_variable(JPellateParser.C_s_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_s_combinado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_s_combinado(JPellateParser.C_s_combinadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_e_nuevo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_nuevo(JPellateParser.C_e_nuevoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_e_viejo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_e_viejo(JPellateParser.C_e_viejoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#if_unitario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_unitario(JPellateParser.If_unitarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(JPellateParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#if_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_elseif(JPellateParser.If_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(JPellateParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#sw_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSw_switch(JPellateParser.Sw_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#otro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro(JPellateParser.OtroContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#otro_P_TEXTO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro_P_TEXTO(JPellateParser.Otro_P_TEXTOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#otro_P_NUMERO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro_P_NUMERO(JPellateParser.Otro_P_NUMEROContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(JPellateParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(JPellateParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#rango}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango(JPellateParser.RangoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#rango_P_NUMERO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_P_NUMERO(JPellateParser.Rango_P_NUMEROContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#rango_v_iz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_v_iz(JPellateParser.Rango_v_izContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#rango_v_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_v_de(JPellateParser.Rango_v_deContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#rango_v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRango_v(JPellateParser.Rango_vContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#funciones_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones_p(JPellateParser.Funciones_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#funcion_nr_vacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_nr_vacio(JPellateParser.Funcion_nr_vacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#funcion_nr_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_nr_variables(JPellateParser.Funcion_nr_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#funcion_sr_vacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_sr_vacio(JPellateParser.Funcion_sr_vacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#funcion_sr_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_sr_variables(JPellateParser.Funcion_sr_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#rtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtr(JPellateParser.RtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#vrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVrt(JPellateParser.VrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(JPellateParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_normal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_normal(JPellateParser.C_normalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_normal_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_normal_and(JPellateParser.C_normal_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_normal_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_normal_or(JPellateParser.C_normal_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_P_TEXTO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_P_TEXTO(JPellateParser.C_P_TEXTOContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_P_TEXTO_iz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_P_TEXTO_iz(JPellateParser.C_P_TEXTO_izContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_P_TEXTO_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_P_TEXTO_de(JPellateParser.C_P_TEXTO_deContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_num_iz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_num_iz(JPellateParser.C_num_izContext ctx);
	/**
	 * Visit a parse tree produced by {@link JPellateParser#c_num_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_num_de(JPellateParser.C_num_deContext ctx);
}