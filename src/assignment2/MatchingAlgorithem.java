/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author 12003065165
 */
public abstract class MatchingAlgorithem implements Algorithem{

    String output = "";
    String o = "";
    
    ArrayList<Token> founded = new <Token>ArrayList();
    
    
    @Override
    public abstract String perform(String input);
    
    public String normalize(String input){
        input = input.toLowerCase();
        input = input.replaceAll(" ", "");
        return input;
    }
    protected void appendOutput(String str){
      
        this.output += str + " | ";
    
    }
    protected void appendOuputToNextLine(String str){
      
        this.output += str +"\n";
    
    }
   
    protected boolean search(String word){
        for(int i = 0 ; i<DictionaryHolder.dictionary().size();i++){
            if(DictionaryHolder.dictionary().get(i).equals(word))
                return true;
        }
               
        return false;

        
    }
    
    private int checkFounded(String token){
        int e = -1;
        for(int i = 0 ; i<founded.size();i++){
            if(founded.get(i).token.equals(token)){
                
               
                e =  founded.get(i).e;
            }
        }
        return e;
    }
    
    protected void printFoundedList(){
        System.out.print("[");
        for(int i = 0 ; i < founded.size();i++){
                    System.out.print(founded.get(i).token+":"+founded.get(i).e+",");

        }
        System.out.print("]");
        
    }
    protected String lookup(String token){
        String sub = null;
        
            int h = 1;
            int n = token.length();
            int p = -1;
            printFoundedList();
            int e = checkFounded(token);
            System.out.println("check  "+ e);
            if(e == -1 )
                    e = 0;
                else{
                    e++;
                }    
             System.out.println("check  "+ e);
            
            while(h <= n ){
                sub = token.substring(0,h);
                
                p = search(sub,e);
                if(p != -1){
                    System.out.println("found "+sub+" at "+ p);
                    founded.add(new Token(token,p));
                    return sub;
                }
                
                h++;
            }
        
        return null;
    }
    
    
    protected int search(String word,int j){
        
        System.out.println("Searching for "+word+" from " + j);
        for(int i = j ;i>=0&& i<DictionaryHolder.dictionary().size();i++){
            if(DictionaryHolder.dictionary().get(i).equals(word))
                return i;
        }
               
        return -1;

        
    }
   
    protected void appendO(String str){
      
        this.o += str + " | ";
    
    }
    
    
}
