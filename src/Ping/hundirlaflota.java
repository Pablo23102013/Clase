package Ping;
import java.util.Random;

public class hundirlaflota {

    private static int[][] tablero = new int[10][10];

    private static void inicializarTablero() {
        //Inicializar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;

            }
        }
    }

    private static void visualizarTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print(".");
                } else if (tablero[i][j] == 2) {
                    System.out.print("2");
                } else if (tablero[i][j] == 3) {
                    System.out.print("3");
                } else if (tablero[i][j] == 4) {
                    System.out.print("4");
                } else if (tablero[i][j] == 5) {
                    System.out.print("5");
                }
            }
            System.out.println(" ");
        }
    }

    private static void colocarBarco(int tamanyo) {
        //Objeto Random
        Random rand = new Random();
        int posicionX, posicionY, posicionamiento;

        boolean repetir = false;

        do{
            repetir = false;
            //Posicion x del tablero Random
            //int posicionX = rand.nextInt((max - min) + 1) + min;
             posicionX = rand.nextInt((9 - 0) + 1) + 0;
            //Posicion y del tablero Random
             posicionY = rand.nextInt((9 - 0) + 1) + 0;
            //Posicion horizontal o vertical del tablero Random
             posicionamiento = rand.nextInt((1 - 0) + 1) + 0;
            if(posicionamiento == 0){
                for (int i = 0; i < tamanyo; i++) {
                    if (posicionX+i < 10){          //AQui me he quedado
                        if (tablero[posicionX+i][posicionY] !=0){
                            repetir = true;
                            break;
                        }
                    }else{
                        repetir = true;
                        break;
                    }
                }
                if(!repetir){
                    for (int i = 0; i < tamanyo; i++) {
                        tablero[posicionX+i][posicionY] = tamanyo;
                    }
                }
            }else{
                for (int i = 0; i < tamanyo; i++) {
                    if (posicionY+i < 10){          //AQui me he quedado
                        if (tablero[posicionX][posicionY+i] !=0){
                            repetir = true;
                            break;
                        }
                    }else{
                        repetir = true;
                        break;
                    }
                }
                if(!repetir){
                    for (int i = 0; i < tamanyo; i++) {
                        tablero[posicionX][posicionY+i] = tamanyo;
                    }
                }
            }
        }while(repetir);


    }


    /**
     * Programa principal, no modificar
     */
    public static void main(String[] args) {

        inicializarTablero();

        colocarBarco(5);
        colocarBarco(4);
        colocarBarco(3);
        colocarBarco(2);

        visualizarTablero();



    }
}

