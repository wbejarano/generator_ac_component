/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.Random;

/**
 *
 * @author wbejarano
 */
public class WolframAC {
    //MAC = matriz del automata celular

    private int[][] matriz;
    private int filas;
    private int columnas;
    private int neighborLeft;
    private int neighborRight;

    public WolframAC(int p_filas, int p_columnas) {
        // Inicializacion de variables
        this.filas = p_filas;
        this.columnas = p_columnas;

        // Creación de matriz
        matriz = new int[this.filas][this.columnas];
        // Inicialización de mattiz
        this.populate();
    }

    private void populate() {

        Random randomNum = new Random();
        for (int x = 0; x < this.filas; x++) {
            for (int y = 0; y < this.columnas; y++) {
                matriz[x][y] = randomNum.nextInt(2);
            }
        }
    }

    public void evolucionar() {

        for (int x = 0; x < this.filas; x++) {
            for (int y = 0; y < this.columnas; y++) {
                //ac[x][y] = randomNum.nextInt(2);
                if (y == 1) {
                    neighborLeft = x;
                    neighborRight = y + 1;
                } else if (y == x) {
                    neighborLeft = y - 1;
                    neighborRight = 1;
                } else {
                    neighborLeft = y - 1;
                    neighborRight = y + 1;
                }

                
//        ac(i+1, j) = distribuidor(MAC(i , neighborLeft),MAC(i , neighborRight),MAC(i , j));

            }
        }
    }

    private int aplicarRegla(int iz, int de, int cell) {

        Random randomNum = new Random();
        int pattern = 0;
        switch (randomNum.nextInt(5)) {
            case 0:  
                // Regla WA
                pattern = (((iz ^ de) + (de * ~cell)) % 2);
                break;
            case 1:  
                //regla 30
                pattern = ((1 + iz + cell + de + (cell * de)) % 2);
                break;
            case 2:
                //regla 45
                pattern = ((1 + iz + de + (cell * de)) % 2);
            case 3:
                //regla 75
                pattern = ((1 + iz + (cell * de)) % 2);
            case 4:  
                //regla 90
                pattern = ((iz + de) % 2);
                break;
        }
        return pattern;
    }
    
    public void imprimir(){
        
    }
}
