/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

import automatas.WolframAC;

/**
 *
 * @author wbejarano
 */
public class Generador {
    
    private int rows = 100;
    private int columns = 1000;
    private final String path_to_file;
    
    public Generador( String p_path_to_file){
        // inicializar matriz
        WolframAC wolframAc = new WolframAC(this.rows, this.columns);
        wolframAc.evolucionar();
        
        this.path_to_file = p_path_to_file;
        wolframAc.imprimir();
    }

    Generador() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
