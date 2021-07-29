package card.qa.data;

public class UnionPayCard extends Card {
    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        if (country == Country.China)
            return true;
        else
            return false;
    }
}
