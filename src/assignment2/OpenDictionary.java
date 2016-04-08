/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author 12003065165
 */
public class OpenDictionary {
    public JFileChooser fileChooser = new JFileChooser();
    public void open() throws FileNotFoundException{
        if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                DictionaryHolder.dictionary().add(input.nextLine());
            }
        
        }
    }
}
