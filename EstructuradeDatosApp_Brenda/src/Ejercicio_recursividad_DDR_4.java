/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_recursividad_DDR_4 {
    
    public static void main(String[] args) {
int[] array={1,2,3,4,5};//Creamos un array
int elementoBuscar=3;//Guardamos el resultado en una variable
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);//Se pasa el array a la posicion principal
System.out.println(posElementoEncontrado);//llamamos recursivamente a la funcion
}
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
if(indice==array.length || array[indice]==elementoBuscar){
if(indice==array.length){//mostramos el valor del indice
return -1;
}else{
return indice; //al final se devuelven los valores
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1);
}
}
}

