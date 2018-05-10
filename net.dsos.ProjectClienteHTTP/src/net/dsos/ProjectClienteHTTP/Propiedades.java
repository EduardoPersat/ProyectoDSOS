package net.dsos.ProjectClienteHTTP;

public class Propiedades {

	//se puede conocere si el valor es negativo si no es positivo
	public static boolean esPositivo(Double numero) {
		return numero >= 0;
	}
	
	public static boolean esPositivo(Integer numero) {
		return numero >= 0;
	}
	
	public static boolean esEntero(Object numero) {
		return numero instanceof Integer;
	}
	
	public static boolean esFlotante(Object numero) {
		return numero instanceof Double;
	}
	
	public static boolean esNegativo(Double numero) {
		return numero < 0;
	}
	
	public static boolean esNegativo(Integer numero) {
		return numero < 0;
	}
	
	public static boolean esPar(Double numero) {
		return numero % 2 == 0;
	}
	
	public static boolean esPar(Integer numero) {
		return numero % 2 == 0;
	}
	
	public static boolean esImpar(Double numero) {
		return numero % 2 != 0;
	}
	
	public static boolean esImpar(Integer numero) {
		return numero % 2 != 0;
	}
	
	//=========================================================
	
	public static boolean igualA(Double numero, Double comparado) {
		return numero == comparado;
	}
	
	public static boolean noIgualA(Double numero, Double comparado) {
		return numero != comparado;
	}
	
	public static boolean menorA(Double numero, Double comparado){
		return numero < comparado;
	}
	
	public static boolean mayorA(Double numero, Double comparado) {
		return numero > comparado;
	}
	
	//=================================================================
	public static boolean menorIgualA(Double numero, Double comparado){
		return numero <= comparado;
	}
	
	public static boolean mayorIgualA(Double numero, Double comparado){
		return numero >= comparado;
	}
	
	//se puede saber si el numero no entra en el rango si retorna falso 
	public static boolean entreXY(Double numero, Double limiteInferior, Double limiteSuperior) {
		return numero > limiteInferior && numero < limiteSuperior;
	}
	
	public static boolean fueraDeXY(Double numero, Double limiteInferior, Double limiteSuperior) {
		return numero < limiteInferior || numero > limiteSuperior;
	}
	
}
