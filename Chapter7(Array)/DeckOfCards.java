/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapater7Problems;

/**
 *
 * @author Ali Khan
 */
public class DeckOfCards {
    public static void main(String[] args){
        
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamond", "Club"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        for(int i=0; i<deck.length; i++){
            deck[i] = i;
        }
        
        for(int i=0; i<deck.length; i++){
            int index =(int) (Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        
        for(int i=0; i<4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card "+deck[i]+" is: "+ rank +" of "+suit);
        }
        
        
        
        
        
    }
    
}
