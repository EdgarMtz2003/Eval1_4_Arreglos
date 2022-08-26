/*
estilo de programacion
duncion e identificacion->empiezan en minusculas
funciones-> indican una accion->verbos
Clases->empiezan mayusculas
 */

/**
 *
 * @author moviles
 */
public class Eval1_4_Arreglos {
    public static void main(String[]args){
    //TDA-> Tipo abstracto de datos (objetos y clases)
    //areglo en java->objetos->tda
    
    //tipo de dato 
    //arreglo de entero para capturar edades
    int[] arregloEdades, arreglosSalario, arregloCali;
    //solo arregloPromedio es arreglo
    double arregloPromedio[], porcentaje;
    //los arreglos son objetos
    arregloEdades = new int[50];
    
    System.out.println(arregloEdades);
    for (int i=0; i<arregloEdades.length; i++){
        arregloEdades[i]= (int) (Math.random()*100);           
        }
    for (int i = 0; i <arregloEdades.length; i++) {
            System.out.println("i"+i+"1 = "+arregloEdades[i]);
        }
    }
}
