/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author user
 */
public class TubesPBO {

    /**^
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Aplikasi apl = new Aplikasi();
        apl.mainMenu();
    }
    
}
