import java.util.ArrayList;
import java.util.List;

public class Cards {
    private int cardNumber;
    private String typeOfCard;
    private NonNumericCards nonNumericCards;
    private int value;

    public Cards(int cardNumber, String typeOfCard, int value) {
        this.cardNumber = cardNumber;
        this.typeOfCard = typeOfCard;
        this.value = value;
    }

    public Cards(NonNumericCards nonNumericCards,String typeOfCard,  int value) {
        this.typeOfCard = typeOfCard;
        this.nonNumericCards = nonNumericCards;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public NonNumericCards getNonNumericCards() {
        return nonNumericCards;
    }

    public void setNonNumericCards(NonNumericCards nonNumericCards) {
        this.nonNumericCards = nonNumericCards;
    }


}
