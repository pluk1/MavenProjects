package tl_29_08_imaggaRestClient.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import tl_29_08_imaggaRestClient.dto.colors.Info;
import tl_29_08_imaggaRestClient.dto.colors.ResponseColors;
import tl_29_08_imaggaRestClient.dto.tags.Response;
import tl_29_08_imaggaRestClient.dto.tags.Tag;

import java.util.Arrays;

public class ImaggaClientApp {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization",
                "Basic YWNjXzk1NWE3ZGJjODcxN2M2MDpjNDFhMjUzZmU3YmFjYWZkYjc0MmQ5MGQzMjY2Zjc0Nw==");

        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        String url = "https://api.imagga.com/v1/tagging";

        String urlColors = "https://api.imagga.com/v1/colors";

        //  String endpoint = "?url=http://data.cyclowiki.org/images/f/fb/Pepelac_ecilop.jpg&language=ru";

//        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(url)
//                .queryParam("url", "http://data.cyclowiki.org/images/f/fb/Pepelac_ecilop.jpg")
//                .queryParam("language", "ru");
//
//        ResponseEntity<Response> response = restTemplate.exchange(uriBuilder.build().encode().toUri(),
//                HttpMethod.GET, requestEntity, Response.class);

        //displayTags(response.getBody().getResults()[0].getTags());

        UriComponentsBuilder uriBuilderColors = UriComponentsBuilder.fromUriString(urlColors)
                .queryParam("url", "http://data.cyclowiki.org/images/f/fb/Pepelac_ecilop.jpg");

        ResponseEntity<ResponseColors> responseColors = restTemplate.exchange(uriBuilderColors.build().encode().toUri(),
                HttpMethod.GET, requestEntity, ResponseColors.class);

        System.out.println(responseColors.getBody().getResultsColors().get(0).getImage());
        displayColors(responseColors.getBody().getResultsColors().get(0).getInfo());

    }

    private static void displayTags(Tag[] tags) {
        Arrays.stream(tags).forEach(t -> System.out.println(t.getTag() + " " + t.getConfidence()));
    }

    private static void displayColors(Info info) {
        System.out.println("Background Colors:");
        info.getBackgroundColors().stream().forEach(c -> System.out.println(c.getClosestPaletteColor()));
    }
}
