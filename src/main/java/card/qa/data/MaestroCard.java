package card.qa.data;

import java.io.Serializable;

import static card.qa.data.Country.Russia;
import static card.qa.data.PaymentSystem.MAESTRO;

public class MaestroCard extends Card implements ICard, Serializable {
    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForThisCard(Country country) {
        return Russia == country;
    }
}
