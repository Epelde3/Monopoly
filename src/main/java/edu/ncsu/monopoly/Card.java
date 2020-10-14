package edu.ncsu.monopoly;

public abstract class Card {
//Git errepositoriako komentarioaaa
    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;
//asdf
    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
