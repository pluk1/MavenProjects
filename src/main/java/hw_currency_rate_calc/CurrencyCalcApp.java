package hw_currency_rate_calc;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class CurrencyCalcApp {

    private static Map<String, Double> rates;


    public static void main(String[] args) throws IOException {

        initRates();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter code of currency FROM");
        String currencyFrom = reader.readLine().toUpperCase();


        while (!rates.containsKey(currencyFrom)) {
            System.out.println("You have entered wrong currency key, try again");
            currencyFrom = reader.readLine().toUpperCase();
        }


        System.out.println("Enter code of currency TO");
        String currencyTo = reader.readLine().toUpperCase();

        while (!rates.containsKey(currencyTo)) {
            System.out.println("You have entered wrong currency key, try again");
            currencyTo = reader.readLine().toUpperCase();
        }


        System.out.println("Enter amount");
        double amount = Double.parseDouble(reader.readLine());

        reader.close();

        double result = convertCurrency(currencyFrom, currencyTo, amount);

        DecimalFormat df2 = new DecimalFormat(".##");


        System.out.println("Result = " + df2.format(result) + " " + currencyTo);


    }

    private static void initRates() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        String url = "http://data.fixer.io/api/latest?access_key=";
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<Currencies> response = restTemplate.exchange(url, HttpMethod.GET,
                requestEntity, Currencies.class);

        rates = response.getBody().getRates();
    }

    private static double convertCurrency(String currencyFrom, String currencyTo, double amount) {

        if (currencyFrom.equals("EUR")) {

            return rates.get(currencyTo) * amount;

        } else {

            return rates.get(currencyTo) / rates.get(currencyFrom) * amount;
        }

    }


}
