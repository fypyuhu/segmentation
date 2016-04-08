/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import java.util.Stack;

/**
 *
 * @author 12003065165
 */
public class MaxumuimMatching extends MatchingAlgorithem{

    @Override
    public String perform(String input) {
       do{
            algo(input);
            appendOuputToNextLine(o);
           
       }while(o!="");
        
        return output;
    }
    public void algo(String input){  
        o = "";
         
        input = normalize(input);
       
        int i = 0;
        int n = input.length();
        
        String sub = null;
          
        while(i<n){
           sub = input.substring(i,n);
           
           System.out.println("token = "+ sub);

            sub = lookup(sub);
            if(sub != null){
                appendO(sub);
                System.out.println("o = " + o);
                i = i + sub.length() -1;
            }
            i++;
        }
        
        
    
    }
}
