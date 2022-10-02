package com.collectionClass;

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {
//        List<String> colors = new ArrayList<>();
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("Red");
//
//        System.out.println("Before sortings " + colors);
//        Collections.sort(colors);
//        System.out.println("After sorting " + colors);

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face: Card.Face.values()){
            for (Card.Suit suit: Card.Suit.values()){
                deckOfCards.add(new Card(suit, face));
            }
        }

        System.out.println("Original deck of cards");
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n" : " ");
        }
        Collections.shuffle(deckOfCards);
        System.out.println("\n\nCards after shuffle");
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n" : " ");
        }

        Collections.sort(deckOfCards);
        System.out.println("Cards after sorting\n\n");
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n" : " ");
        }
    }

    private static void printOutput(List<Card> deckOfCards){
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n" : " ");
        }
    }

}
