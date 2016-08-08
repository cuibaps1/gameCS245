/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecs245;

import java.util.Random;

/**
 *
 * @author ozhang
 */
public class Model {
    
    String[] list;
    
    public Model(){
        list = new String[] {"abstract", "cemetery", "nurse", "pharmacy", "climbing"};
    }
    
    private String getRandomWord(String[] list){
        Random rand = new Random();
        int n = rand.nextInt(6);
        String word = list[n];
        return word;
    }
    
    //WORK IN PROGRESS
    private boolean compareLetters(char[] word, char letter ){
        for(int i = 0; i<8; i++ ){
           
        }
        return false;
    }
    
    private char[] convertToChar(String word){
        char[] charArray = word.toCharArray();
        return charArray;
    }
}
