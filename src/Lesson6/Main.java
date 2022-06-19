package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    private final static String WeatherUrl = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/295146";
    private final static String API_KEY = "?apikey=ukOyPPKsPKzJnelFhV18GZG0L8Sn7DqC";
    private final static String IS_METRIC = "&metric=true";

    public static void main(String[] args) {
        try {
            URL WEATHER_URL = new URL(WeatherUrl + API_KEY + IS_METRIC);
            HttpURLConnection urlConnection = (HttpURLConnection) WEATHER_URL.openConnection();
            if (urlConnection.getResponseCode() == 200) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    System.out.println(response);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
