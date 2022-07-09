package api.helpers;

import io.restassured.RestAssured;
import io.restassured.internal.http.URIBuilder;
import io.restassured.response.Response;

import java.net.URI;
import java.net.URISyntaxException;

public class BaseApi {
    public static Response get(String path){
        URI uri;
        try {
            uri =  URIBuilder.convertToURI(path);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return RestAssured.get(uri);
    }
}
