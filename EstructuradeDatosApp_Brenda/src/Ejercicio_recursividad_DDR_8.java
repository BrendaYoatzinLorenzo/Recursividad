/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_recursividad_DDR_8 {
    
    public static void main(String[] args) {
String palabra = "Hola"; //asignar el valor al string
System.out.println(invertirPalabra(palabra, palabra.length()-1)); //se hace el llamado a la operacion
}
public static String invertirPalabra(String palabra, int longitud){
if(longitud==0){//CASO BASE, si es cero devuelve un cero
                //se puede poner longitud<=0 tamvien para incluir negativos
return palabra.charAt(longitud)+"";
}else{ //se hace la operacion, para retornar el resultado
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}
