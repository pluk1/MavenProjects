package hw_imagga_colors.controller;

import hw_imagga_colors.dto.BackgroundColor;
import hw_imagga_colors.dto.Info;
import hw_imagga_colors.dto.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class ImagaClientApp {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization",
                "Basic YWNjXzk1NWE3ZGJjODcxN2M2MDpjNDFhMjUzZmU3YmFjYWZkYjc0MmQ5MGQzMjY2Zjc0Nw==");

        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        String url = "https://api.imagga.com/v1/colors";

        UriComponentsBuilder uriBuilderColors = UriComponentsBuilder.fromUriString(url)
                .queryParam("url", "http://data.cyclowiki.org/images/f/fb/Pepelac_ecilop.jpg");

        ResponseEntity<Response> response = restTemplate.exchange(uriBuilderColors.build().encode().toUri(),
                HttpMethod.GET, requestEntity, Response.class);

        Info info = response.getBody().getResults().get(0).getInfo();

        displayColors(info);
        displayImageColors(info);


    }

    private static void displayColors(Info info) {
        System.out.println("Background Colors:");

        info.getBackground_colors().stream().forEach(c -> System.out.println(c.getClosest_palette_color()));

    }

    private static void displayImageColors(Info info) {
        System.out.println("Image Colors:");

        info.getImage_colors().stream().forEach(c -> System.out.println(c.getClosest_palette_color()));

    }
}
