package org.deck;

public class Card {

    private Suit flavor;
    private Rank rank;

    public Card(Suit flavor, Rank rank){
        this.flavor = flavor;
        this.rank = rank;
    }

    public Suit getCardFlavor() {
        return flavor;
    }

    public Rank getCardRank() {
        return rank;
    }

    public void setCardFlavor(Suit flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString(){
        return rank + " of "+ flavor;
    }
}
