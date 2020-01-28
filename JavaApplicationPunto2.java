/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpunto2;

import java.util.Scanner;

public class JavaApplicationPunto2 {

    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Ingrese la hora por favor");
        int hora = myObj.nextInt();//Ingrese la hora
        System.out.println("Ingrese los minutos por favor");
        int minutos = myObj.nextInt();
        if(hora >=1 && hora <12 && minutos>=00 && minutos<60){
            String horaEnLetras="";
            String minutosEnLetras="";
            horaEnLetras = generarPalabra(hora);
            minutosEnLetras = generarMinutos(minutos);
            System.out.println(hora + ":" + minutos);
            System.out.println( horaEnLetras + " y " + minutosEnLetras + " minutos");
        }else{
            System.out.println("Error en los datos que has ingresado");
        } 
    }
    public static String generarPalabra(int Hora){
        String horaEnLetras="";
        switch (Hora) {
            case 1:
                horaEnLetras = "una";
                break;
            case 2:
                horaEnLetras = "dos";
                break;
            case 3:
                horaEnLetras = "tres";
                break;
            case 4:
                horaEnLetras = "cuatro";
                break;
            case 5:
                horaEnLetras = "cinco";
                break;
            case 6:
                horaEnLetras = "seis";
                break;
            case 7:
                horaEnLetras = "siete";
                break;
            case 8:
                horaEnLetras = "ocho";
                break;
            case 9:
                horaEnLetras = "nueve";
                break;
            case 10:
                horaEnLetras = "diez";
                break;
            case 11:
                horaEnLetras = "once";
                break;
        }
        return horaEnLetras;
    }
    
    public static String generarMinutos(int Minutos){
        String minutosEnLetras=null;
        switch (Minutos){
            case 1:
                minutosEnLetras = " un minuto";
                break;
            case 2:
                minutosEnLetras = " dos minutos";
                break;
            case 3:
                minutosEnLetras = " tres minutos";
                break;
            case 4:
                minutosEnLetras = " cuatro minutos";
                break;
            case 5:
                minutosEnLetras = " cinco minutos";
                break;
            case 6:
                minutosEnLetras = " seis minutos";
                break;
            case 7:
                minutosEnLetras = " siete minutos";
                break;
            case 8:
                minutosEnLetras = " ocho minutos";
                break;
            case 9:
                minutosEnLetras = " nueve minutos";
                break;
            case 10:
                minutosEnLetras = " diez minutos";
                break;
            case 11:
                minutosEnLetras = " once minuto";
                break;
            case 12:
                minutosEnLetras = " doc minutos";
                break;
            case 13:
                minutosEnLetras = " trece minutos";
                break;
            case 14:
                minutosEnLetras = " catorce minutos";
                break;
            case 15:
                minutosEnLetras = " quince minutos";
                break;
            case 16:
                minutosEnLetras = " dieciseis minutos";
                break;
            case 17:
                minutosEnLetras = " diecisiete minutos";
                break;
            case 18:
                minutosEnLetras = " dieciocho minutos";
                break;
            case 19:
                minutosEnLetras = " diecinueve minutos";
                break;
            case 20:
                minutosEnLetras = " veinte minutos";
                break;
        }
        if(minutosEnLetras==null){
            minutosEnLetras = generarMinutosDosDigitos(Minutos);
        }
        return minutosEnLetras;
    }
    
    private static String generarMinutosDosDigitos(int Minutos) {
        String minutosEnLetras="";
        String aux = String.valueOf(Minutos);
        int min_aux = Integer.parseInt(aux.substring(1, 2));
        aux="";
        if(Minutos> 20 && Minutos<30){
            aux = generarPalabra(min_aux);
            minutosEnLetras=" veinte " + aux;
        }else if(Minutos>= 30 && Minutos<40){
            aux = generarPalabra(min_aux);
            minutosEnLetras=" treinta "  + aux;
        }else if(Minutos>= 40 && Minutos<50){
            aux = generarPalabra(min_aux);
            minutosEnLetras=" cuarenta " + aux;
        }else{
            aux = generarPalabra(min_aux);
            minutosEnLetras=" cincuenta " + aux;
        }
        return minutosEnLetras;
    }
}
