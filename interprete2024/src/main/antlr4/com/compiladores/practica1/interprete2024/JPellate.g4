grammar JPellate;

start
:
	P_GRUPO P_IDENTIFICADORES  P_LL_A
		inicio*
	P_LL_C		
;

inicio: v_asignar | v_asignar_valor_P_NUMERO | v_asignar_valor_P_TEXTO |
c_s_P_TEXTO |c_s_variable| c_s_combinado| c_e_nuevo| c_e_viejo |
if_unitario | if_else|if_elseif |
sw_switch | ciclo_while | ciclo_for | funciones_p;


v_asignar: P_VAR P_IDENTIFICADORES P_PUN_P_COMA ;
v_asignar_valor_P_NUMERO: P_VAR P_IDENTIFICADORES S_ASI P_NUMERO P_PUN_P_COMA;
v_asignar_valor_P_TEXTO: P_VAR P_IDENTIFICADORES S_ASI P_COMILLAS P_IDENTIFICADORES P_COMILLAS P_PUN_P_COMA;

c_s_P_TEXTO: P_S P_COR_A P_COMILLAS P_IDENTIFICADORES P_COMILLAS P_COR_C P_PUN_P_COMA;
c_s_variable: P_S P_COR_A P_IDENTIFICADORES P_COR_C P_PUN_P_COMA;
c_s_combinado: P_S P_COR_A P_COMILLAS P_IDENTIFICADORES P_COMILLAS S_DO P_IDENTIFICADORES P_COR_C P_PUN_P_COMA;
c_e_nuevo: P_VAR P_IDENTIFICADORES  S_ASI P_E P_COR_A   P_COR_C P_PUN_P_COMA;
c_e_viejo:  P_IDENTIFICADORES  S_ASI P_E P_COR_A   P_COR_C P_PUN_P_COMA;

if_unitario: P_IF P_COR_A condicional P_COR_C P_LL_A inicio* P_LL_C;
if_else:  P_IF P_COR_A condicional P_COR_C P_LL_A inicio* P_LL_C P_ELSE P_LL_A inicio* P_LL_C;
if_elseif: P_IF  P_COR_A condicional P_COR_C P_LL_A inicio* P_LL_C elseif* P_ELSE P_LL_A inicio* P_LL_C;
elseif:P_ELSE_IF P_COR_A condicional P_COR_C P_LL_A inicio* P_LL_C;

sw_switch: 
P_SW P_COR_A P_IDENTIFICADORES P_COR_C P_LL_A otro* P_DEF S_ASI  inicio* P_END P_PUN_P_COMA P_LL_C;
otro: otro_P_TEXTO | otro_P_NUMERO;

otro_P_TEXTO: P_OTRO P_COR_A P_COMILLAS P_IDENTIFICADORES P_COMILLAS P_COR_C  S_ASI inicio* P_END P_PUN_P_COMA;
otro_P_NUMERO: P_OTRO P_COR_A  P_IDENTIFICADORES  P_COR_C  S_ASI inicio* P_END P_PUN_P_COMA;

ciclo_while: P_WHILE P_COR_A condicional P_COR_C P_LL_A inicio* P_LL_C;
ciclo_for: P_FOR P_COR_A rango P_COR_C P_LL_A inicio* P_LL_C;
rango: rango_P_NUMERO | rango_v_iz | rango_v_de | rango_v ; 
rango_P_NUMERO: P_NUMERO S_DO P_NUMERO;
rango_v_iz: P_IDENTIFICADORES S_DO P_NUMERO;
rango_v_de: P_NUMERO S_DO P_IDENTIFICADORES;
rango_v: P_IDENTIFICADORES S_DO P_IDENTIFICADORES;


funciones_p: funcion_nr_vacio |funcion_nr_variables | funcion_sr_vacio |funcion_sr_variables ;

funcion_nr_vacio: P_FC  P_IDENTIFICADORES P_COR_A  P_COR_C P_LL_A inicio* P_LL_C;
funcion_nr_variables: P_FC P_IDENTIFICADORES P_COR_A vrt* P_COR_C P_LL_A inicio* P_LL_C;
funcion_sr_vacio:  P_FC  P_IDENTIFICADORES P_COR_A  P_COR_C P_LL_A inicio* P_REGRESAR rtr P_LL_C;
funcion_sr_variables: P_FC P_IDENTIFICADORES P_COR_A vrt*  P_COR_C P_LL_A inicio* P_REGRESAR rtr P_LL_C;
rtr: P_IDENTIFICADORES | P_NUMERO;

vrt: P_IDENTIFICADORES;



condicional: c_normal|c_normal_and |c_normal_or |c_P_TEXTO |c_P_TEXTO_iz|c_P_TEXTO_de|c_num_iz|c_num_de ; 
c_normal: P_IDENTIFICADORES P_S_DE_COMPA P_IDENTIFICADORES;
c_normal_and: P_A  P_IDENTIFICADORES P_S_DE_COMPA P_IDENTIFICADORES P_C P_AND P_A  P_IDENTIFICADORES P_S_DE_COMPA P_IDENTIFICADORES P_C;
c_normal_or: P_A  P_IDENTIFICADORES P_S_DE_COMPA P_IDENTIFICADORES P_C P_OR P_A  P_IDENTIFICADORES P_S_DE_COMPA P_IDENTIFICADORES P_C;
c_P_TEXTO: P_COMILLAS P_IDENTIFICADORES P_COMILLAS P_S_DE_COMPA P_COMILLAS P_IDENTIFICADORES P_COMILLAS;
c_P_TEXTO_iz:P_COMILLAS P_IDENTIFICADORES P_COMILLAS P_S_DE_COMPA  P_IDENTIFICADORES;
c_P_TEXTO_de: P_IDENTIFICADORES  P_S_DE_COMPA P_COMILLAS P_IDENTIFICADORES P_COMILLAS;
c_num_iz : P_IDENTIFICADORES P_S_DE_COMPA P_NUMERO;
c_num_de: P_NUMERO P_S_DE_COMPA P_IDENTIFICADORES;


P_GRUPO: 'Grupo';
P_VAR: 'Variable';
P_S: 'Salida';
P_E: 'Entrada';
P_IF: 'if';
P_ELSE_IF: 'else if';
P_ELSE: 'else';
P_SW: 'Sw';
P_OTRO: 'Otro';
P_END: 'end';
P_DEF: 'Def';
P_WHILE: 'While';
P_FOR: 'For';
P_FC: 'Funcion';
P_AND: 'AND';
P_OR: 'OR';


P_S_OPERACION: [+\-*/%];
P_S_NEGACION: '!';
P_S_DE_COMPA: '<=' | '>='| '<'| '>'| '=='| '!=';
S_ASI:'=';
S_DO: '$';
P_A: '(';
P_C: ')';
P_COR_A: '[';
P_COR_C: ']';
P_LL_A: '{';
P_LL_C: '}';
P_PUN_P_COMA: ';';
P_COMA: ',';
P_REGRESAR: '->';
P_COMILLAS: '"';


P_IDENTIFICADORES:[a-zA-Z][a-zA-Z0-9]*;
P_TEXTO:[a-zA-Z]+;
P_NUMERO: [-]?[0-9]+('.'[0-9]+)?;

WS
:
	[ \t\r\n]+ -> skip
;