package card.qa;

import card.qa.data.Card;
import card.qa.data.VisaCard;

import static card.qa.data.Country.Russia;

public class Main {
    public static void main(String[] arg) {
        Card visaCard = new VisaCard();
        visaCard.setBalance(100);
        visaCard.payInCountry(Russia, 75);
        System.out.println(visaCard.getBalance());
    }
}
