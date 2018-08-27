package tl_26_08_restClient.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import tl_26_08_restClient.model.Post;

import java.util.Arrays;


public class RestClientApp {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        String url ="https://jsonplaceholder.typicode.com/posts";
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<Post[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Post[].class );

//        Arrays.stream(response.getBody()).forEach(System.out::println);
        System.out.println(response.getHeaders());

        ResponseEntity<Post> postResponse = restTemplate.exchange(url+"/1", HttpMethod.GET, requestEntity, Post.class );
        System.out.println(postResponse.getHeaders().getContentType());
        System.out.println(postResponse.getStatusCode());

        //https://fixer.io/

    }
}
