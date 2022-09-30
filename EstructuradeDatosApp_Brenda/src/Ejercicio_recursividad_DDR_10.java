/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_recursividad_DDR_10 {
    
    public static void main(String[] args) {
int numero = 123; //se asignan los valores
System.out.println(sumaDigitos(numero));// se hace el llamado a la operacion
}
public static int sumaDigitos(int numero){
if(numero < 10){ //caso base
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //Cojo el digito y llamo a la funcion para realizar la operacion
}
}
}
