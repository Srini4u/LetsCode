package org.deck;

public class DeckTest {
    public static void main(String[] args){
        Deck deck = new Deck();

        //Shuffle the deck
        System.out.println("Shuffling deck");
        deck.shuffle();

        // Draw 5 cards from the deck
        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck.draw();
            System.out.println("You drew: " + drawnCard);
        }

        System.out.println("Cards remaining in deck: " + deck.remainingCards());

    }
}
