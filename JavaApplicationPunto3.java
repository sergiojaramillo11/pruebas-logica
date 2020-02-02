/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpunto3;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;


public class JavaApplicationPunto3 {
    
    public static Hashtable<String, String> jugadores_Titulares = new Hashtable<>();
    public static Hashtable<String, String> jugadores_Suplentes = new Hashtable<>();
    public static String nombre_Del_Equipo="";
    public static String nombre_Del_Estadio="";
    public static int cant_Titulos=0;
    
    public static void main(String[] args){
        arranca_Programa();
		boolean banderaAux = false;
        boolean bandera = false;
        while(bandera==false){
        clearScreen();
        Scanner MyObj_Menu = new Scanner(System.in);
        System.err.println("******Menú******");
        System.out.println("1) Ingresar jugadores Titular");
        System.out.println("2) Ingresar jugadores Suplente");
        System.out.println("3) Reporte equipo");
        System.out.println("4) Reporte equipo detallado");
        System.out.println("5) Salir");
        int op_Menu = MyObj_Menu.nextInt();
        switch (op_Menu){
            case 1:
                ingresarJugadorTitular();
                break;
            case 2:
                ingresarJugadorSuplente();
                break;
            case 3:
                System.err.println("Nombre del Equipo : " + nombre_Del_Equipo);
                System.err.println("Nombre del Estadio : " + nombre_Del_Estadio);
                System.err.println("Cantidad de Títulos : " + cant_Titulos);
                System.err.println("Cantidad de Jugadores : " + jugadores_Suplentes.size() + jugadores_Titulares.size());
                break;
            case 4:
                reporte_Detallado();
                break;
            case 5:
                bandera=true;
                break;
            default:
                System.out.println("//////Error en la elección en el menú////////");
        }
        }
    }
    public static void arranca_Programa(){
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo por favor");
        nombre_Del_Equipo = MyObj.nextLine();
        System.out.println("Ingrese el nombre del estadio por favor");
        nombre_Del_Estadio = MyObj.nextLine();
        System.out.println("Ingrese la cantidad de títulos por favor");
        cant_Titulos = MyObj.nextInt();  
    }
    
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } 
    
    public static void ingresarJugadorTitular(){
        System.err.println("-------Proceso, Ingresar jugador Titular-------");
        Scanner MyObj_Jug_Titular = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo por favor");
        String nombre_Del_Jug_Titular = MyObj_Jug_Titular.nextLine();
        String posicion = posicion();
        jugadores_Titulares.put(nombre_Del_Jug_Titular, posicion);
    }
    public static void ingresarJugadorSuplente(){
        System.err.println("------Proceso, Ingresar jugador Suplente-------");
        Scanner MyObj_Jug_Suplente = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo por favor");
        String nombre_Del_Jug_Suplente = MyObj_Jug_Suplente.nextLine();
        String posicion = posicion();
        jugadores_Suplentes.put(nombre_Del_Jug_Suplente, posicion);
    }
    public static String posicion() {
        String posicion = null;
        while (posicion == null) {
            System.out.println("--------Ingrese la posición del jugador--------");
            System.out.println("1) Arquero");
            System.out.println("2) Lateral");
            System.out.println("3) Defensa Central");
            System.out.println("4) Volante de recuperación");
            System.out.println("5) Volante mixto");
            System.out.println("6) Volante ofensivo");
            System.out.println("7) Delantero");
            Scanner MyObj_Posicion = new Scanner(System.in);
            int posicion_Jugador = MyObj_Posicion.nextInt();
            switch (posicion_Jugador) {
                case 1:
                    posicion = "Arquero";
                    break;
                case 2:
                    posicion = "Lateral";
                    break;
                case 3:
                    posicion = "Defensa Central";
                    break;
                case 4:
                    posicion = "Volante de recuperación";
                    break;
                case 5:
                    posicion = "Volante mixto";
                    break;
                case 6:
                    posicion = "Volante ofensivo";
                    break;
                case 7:
                    posicion = "Delantero";
                    break;
                default:
                    System.out.println("Posición errónea");
            }
        };
        return posicion;
    }

    public static void reporte_Detallado() {
        System.err.println("--------Reporte Detallado-----------");
        System.err.println("Nombre del Equipo : " + nombre_Del_Equipo);
        System.err.println("Nombre del Estadio : " + nombre_Del_Estadio);
        System.err.println("Cantidad de Títulos : " + cant_Titulos);
        System.err.println("Titulares " + jugadores_Titulares.toString());
        System.err.println("Suplentes " + jugadores_Suplentes.toString());
    }
}
