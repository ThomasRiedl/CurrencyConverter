package model;

public class Currency {

    String name;
    double currency;

    public String getName() {
        return name;
    }

    public double getCurrency() {
        return currency;
    }

    public Currency(String name,double currency)
    {
        this.name = name;
        this.currency = currency;
    }
}