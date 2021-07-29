package card.qa;

import card.qa.data.Card;
import card.qa.data.MasterCard;
import card.qa.data.UnionPayCard;
import card.qa.data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static card.qa.data.Country.Russia;

public class Main {
    public static void main(String[] arg) {
        invoke(new UnionPayCard());
        List<String> aList = new ArrayList<>();
    }

    public static void invoke(Card card) {

        card.setBalance(100);
        card.payInCountry(Russia, 75);
        System.out.println("Current balance: " +card.getBalance());
    }
}
