/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_recursividad_DDR_9 {
    
    public static void main(String[] args) {
int base = 10;
int exponente = -2; //se asignar valoes
System.out.println(potencia(base, exponente));//se llama a la operacion
}
public static double potencia(int base, int exponente) {
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
}
}
}
