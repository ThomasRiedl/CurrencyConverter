package model;

import java.util.ArrayList;

public class CurrencyConverter {

    public ArrayList <Currency> currency = new ArrayList<Currency>();

    public CurrencyConverter()
    {
        currency.add(new Currency("Yen", 124));
        currency.add(new Currency("US-Dollar", 1.19));
    }


}