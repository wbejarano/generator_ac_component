/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

import java.io.IOException;
import java.util.Random;
/**
 *
 * @author wbejarano
 */
public class Generadorrr {
    
    int p;
    private int rows = 100;
    private int columns = 1000;
    

    public Generador(){
        // inicializar matriz
        this.InitMatriz(rows, columns);
        
    }
    //Permite indicar el tamaño de la matrí
    public Generador(int p_rows, int p_columns){
        // inicializar matriz
        this.InitMatriz(p_rows, p_columns);
    }
    
    private void InitMatriz (int p_rows, int p_columns){
        Random randomNum = new Random();
        // Creación e inicialización de matriz
        MAC = new int[p_rows][p_columns];
        sfsd generador_aleatorio = new sfsd();
        
        
        for (int x=0; x < p_rows; x++) {
            for (int y=0; y < p_columns; y++){
                MAC[x][y] = randomNum.nextInt(2);
            }
        }
    }
   
    
    //public void 
  
    
//%Se inicia recorrido de la matriz
//%Filas
//for i = 1:r
//    %Columnas
//   for j = 1:c
//            if (j == 1)
//                neighborLeft = c;
//                neighborRight = j + 1;
//            elseif(j == c)
//                neighborLeft = j - 1;
//                neighborRight = 1;
//            else 
//                neighborLeft = j - 1;
//                neighborRight = j + 1;
//            end
//            
//        MAC(i+1, j) = distribuidor(MAC(i , neighborLeft),MAC(i , neighborRight),MAC(i , j));
//
//    end
//end
//
//disp(MAC);
//% iterate for 10000 time steps
//
//%csvwrite('list.csv',MAC)
//%type list.csv
//
//%csvwrite('list.txt',MAC)
//%type list.txt
//    
//  % view the world
//   imagesc(MAC);
//    
//    % keep colors ranging from 0 to 2
//   caxis([0 2]);
//
//    % plot
//    drawnow;
//
//
//    %disp(world);
    
}
