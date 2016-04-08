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
    Stack st = new Stack();

    @Override
    
    public String perform(String input) {
       input = normalize(input);

       
            algo(input);
            appendOuputToNextLine(st.toString());
           
     
        
        return output;
    }
    public void algo(String input){  
        o = "";
         
       
        int i = 0;
        int n = input.length();
        String token = null;
        String sub = null;
        String pre = null;  
        while(i<n){
           sub = input.substring(i,n);
                      System.out.println("token = "+ sub);
            token = new String(sub);            
            sub = lookup(sub);
            
            if(sub != null){
                st.push(sub);
                System.out.println("o = " + st.toString());
                i = i + ( sub.length() -1);
                
                i++;
            }
            //i++;
            if(sub == null &&st.size()==0 )
                break;
            if(sub==null || (i == n  &&st.size()!=0)){
              
                appendOuputToNextLine(st.toString());
               System.out.println("output = " + output);
              
               pre = st.firstElement().toString();
               st.pop();
            
               i = n- (n - countS());
               
            }
            
            
        }
        
        
    
    }
    
    int countS(){
       int n = 0;
        
       for(int i = 0 ; i < st.size();i++){
           n += st.get(i).toString().length();
       
       }
        return n;
   }
}
