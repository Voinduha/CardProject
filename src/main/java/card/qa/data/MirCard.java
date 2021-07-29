package card.qa.data;

public class MirCard extends Card {
    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        if (country == Country.Russia)
            return true;
        else
            return false;
    }
}
