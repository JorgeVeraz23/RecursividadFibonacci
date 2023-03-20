/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadfibonacci;

/**
 *
 * @author USER
 */
public class RecursividadFibonacci {

    public static void main(String[] args) {
       RecursividadFibonacci obj = new RecursividadFibonacci();
        System.out.println("El fibonacci del numero es: "+obj.fibonacci(5));
    }
    public int fibonacci(int n){
        if (n < 0) {
        throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
    } else if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    }
}
