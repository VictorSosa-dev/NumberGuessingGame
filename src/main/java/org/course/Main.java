package org.course;

public class Main {

    private static Lector lector = new Lector();
    private static Menu menu = new Menu();

    public static void main(String[] args) {

        System.out.println("Number Guessing Game");

        System.out.println("Bienvenido al juego de adivinar el número");
        int opcion = 0;

        do {
            menu.showMenu();
            opcion = lector.readInt();
            switch (opcion) {
                case 1:
                    NumeroAleatorio juego = new NumeroAleatorio();
                    juego.Juego();
                    break;
                case 2:
                    System.out.println("Saliendo del Juego.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while(opcion != 2);

    }

}