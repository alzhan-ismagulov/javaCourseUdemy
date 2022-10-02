package com.collectionClass;

import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card> {
    public enum Suit {ПИКИ, ЧЕРВИ, ТРЕФ, БУБИ}

    public enum Face {Туз, Двойка, Три, Четыре, Пять, Шесть, Семь, Восемь, Девять, Десять, Валет, Дама, Король}

    private final Suit suit;
    private final Face face;

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public int compareTo(Card card) {
        Face[] values = Face.values();
        List<Face> faces = Arrays.asList(values);
        if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
            return -1;
        } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
            return +1;
        } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
            return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
        }
        return 0;
    }

    @Override
    public String toString() {
        return face + " " + suit;
    }
}
