package card.qa.data;

public enum Country {
    Russia("Россия"), China("Китай"), USA("США");
    private String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
