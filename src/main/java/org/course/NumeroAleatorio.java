package org.course;

public class NumeroAleatorio {

    private static final int INTENTOS = 10;
    Lector lector = new Lector();

    private static int numero;
    private int numIntentos;

    NumeroAleatorio() {
        numero = 0;
        numIntentos = 0;
    }

    public void generarNumeroAleatorio() {
        numero = (int) (Math.random() * 100);
        System.out.println("Numero generado: "+numero);
    }

    public boolean comparar(int numJugador){
        if(this.numero == numJugador) {
            System.out.println("Le diste");
            return true;
        } else if(numJugador < this.numero) {
            System.out.println("Muy abajo");
            return false;
        } else {
            System.out.println("Muy arriba");
            return false;
        }

    }

    public void Juego(){
        System.out.println("Generando numero.....");
        generarNumeroAleatorio();
        System.out.println("Se creo el numero ahora adivida el numero ***Suerte***");
        int numJugador = 0;
        while (numIntentos < 10 ) {
            numJugador = lector.readInt();
            numIntentos++;
            if (comparar(numJugador)) break;
        }

    }

}
