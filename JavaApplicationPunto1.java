/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpunto1;

import java.util.Scanner;

/**
 *
 * @author LeNoVo
 */
public class JavaApplicationPunto1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Ingrese el número por favor");
        int numero = myObj.nextInt();//Ingrese por favor el número
        if (numero >= 1 && numero <= 100) {
            int resultado = numero % 2;
            if (resultado != 0) {
                System.out.println("Quipux");
            } else if (resultado == 0 && numero >= 2 && numero <= 5) {
                System.out.println("No Quipux");
            } else if (resultado == 0 && numero >= 6 && numero <= 20) {
                System.out.println("Quipux");
            } else if (resultado == 0 && numero > 20) {
                System.out.println("No Quipux");
            }
        } else {
            System.out.println("Su número está fuera de nuestro rango");
        }
    }
}
