/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_recursividad_DDR_2 {
    

    public static void main(String[] args) {

        

        int n=5;

        //Guarda el resultado en una variable

        int resultado=factorialRecursivo(n);
      
        

        //Muestra el resultado

        System.out.println(resultado);

        

    }

    

    public static int factorialRecursivo(int numero){

        

        int res;

        

        if(numero==1){

            //Se termina la recursión

            return 1;

        }else{

            //Se llama asi misma la funcion, con el valor del numero menos 1

            res = numero * factorialRecursivo(numero-1);

        }

        

        //Devolvemos el valor

        return res;

        

    }
}
    

