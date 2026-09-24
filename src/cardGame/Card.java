//Kanemoto
//9.24.26
//the Card object class

package cardGame;

import java.util.Objects;

public class Card {
	
	private String cardSuit;
	private String cardName;
	private int cardValue;
	private String cardPicture;
	
	//contructor
	public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
		super();
		this.cardSuit = cardSuit;
		this.cardName = cardName;
		this.cardValue = cardValue;
		this.cardPicture = cardPicture;
	}

	//setters and getters - accessors and mutators
	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public String getCardPicture() {
		return cardPicture;
	}

	public void setCardPicture(String cardPicture) {
		this.cardPicture = cardPicture;
	}

	@Override
	public String toString() {
		return "Card [cardSuit=" + cardSuit + ", cardName=" + cardName + ", cardValue=" + cardValue + ", cardPicture="
				+ cardPicture + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(cardName, other.cardName) && Objects.equals(cardPicture, other.cardPicture)
				&& Objects.equals(cardSuit, other.cardSuit) && cardValue == other.cardValue;
	} 
	
}//end Card class
