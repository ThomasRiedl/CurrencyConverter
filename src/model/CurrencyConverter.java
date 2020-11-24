package model;

import java.util.ArrayList;

public class CurrencyConverter {

    public ArrayList <Currency> currency = new ArrayList<Currency>();

    public CurrencyConverter()
    {
        currency.add(new Currency("Yen", 124));
        currency.add(new Currency("US-Dollar", 1.19));
    }

    public String getSign(int i)
    {
        return currency.get(i).getName();
    }

    public double euroConvert (String sign, double euro)
    {
        double a = 1.0;
        for(Currency c : currency)
        {
            if(c.getName().equals(sign))
                a = c.getCurrency();
        }
    return euro * a;
    }
}