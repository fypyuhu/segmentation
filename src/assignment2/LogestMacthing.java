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
public class LogestMacthing extends MatchingAlgorithem {
    
    @Override
    public String perform(String input) {
        
        input = normalize(input);
        
        int n =input.length();
        int i = 0;
        int h = n;
        
        while( h > 0 && i< n && i<h){
               System.out.println(i);
              System.out.println(h);
           
            String sub= input.substring(i, h);
              System.out.println(sub);
           
            if(search(sub)){
                appendOutput(sub);
                
                i=h;
                h = n;
            }else{
                h--;
            }
            
        }
             return output += "\n";
    }
    
}
