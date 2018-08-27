package hw_currency_rate_calc;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

import java.util.Map;

public class Currencies {
    private String currency;
    private int price;
    private String success;
    private int timestamp;
    private String base;

   // @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    private Map<String, Double> rates;

    public Currencies() {
    }

    public String getCurrency() {
        return currency;
    }

    public int getPrice() {
        return price;
    }

    public String getSuccess() {
        return success;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "Currencies{" +
                "currency='" + currency + '\'' +
                ", price=" + price +
                ", success='" + success + '\'' +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", date=" + date +
                ", rates=" + rates +
                '}';
    }
}
