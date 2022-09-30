/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_Recursividad_DDR_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=10;
//guardamos el resultado en una variable
int resultado=sumaRecursiva(n);
//Mostramos el resultado
System.out.println(resultado);
}
public static int sumaRecursiva(int numero){
int res;
if(numero==1){
//Se termina la recursion
return 1;
}else{
//Se llama a si misma la función con el parametro numero menos 1
res = numero+sumaRecursiva(numero-1);
}
//Devuelve el resultado
return res;

    }
    
}
