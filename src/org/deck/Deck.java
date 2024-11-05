package org.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        //populate the deck with cards using enum
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    //shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //Draw a card from deck
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        } else {
            throw new IllegalStateException("The deck is empty");
        }
    }

    //Get the remaining number of cards from deck
    public int remainingCards(){
        return cards.size();
    }

}
