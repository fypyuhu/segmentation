/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

/**
 *
 * @author 12003065165
 */
public class DictionaryHolder {
    private static Dictionary dictionary= null;
    
    public static Dictionary dictionary(){
        if(DictionaryHolder.dictionary == null){
            return DictionaryHolder.dictionary = new Dictionary();
        }
        
        return DictionaryHolder.dictionary;
        
    
    }
    
}
