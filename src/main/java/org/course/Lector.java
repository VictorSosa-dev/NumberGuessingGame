package org.course;

import java.util.Objects;
import java.util.Scanner;

public class Lector {

    Scanner scanner = new Scanner(System.in);


    public int readInt() {
        System.out.println("Ingresa una opcion: ");

        //verificar que sea un numero entero
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No es un numero entero");
            return 0;
        }
    }

    public int opcionJugador(){
        System.out.println("Ingresa un numero: ");
        return Integer.parseInt(scanner.nextLine());
    }



}
