package utils;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Requests {

    private String host = "https://rsisolucoes.atlassian.net/rest/api/2/";
    private String username = "diogo.cordeiro@rsinet.com.br";
    private String password = "diogo657423";
    private String json = "application/json";

    public HttpResponse<JsonNode> GetRequest(String url) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.get(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .basicAuth(username, password)
                .asJson();
        return request;
    }

    public HttpResponse<JsonNode> PostRequest(String url, JsonNode body) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .basicAuth(username, password)
                .body(body)
                .asJson();
        return request;
    }

    public HttpResponse<JsonNode> PutRequest(String url, JsonNode body) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.put(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .basicAuth(username, password)
                .body(body)
                .asJson();
        return request;

    }

    public HttpResponse<JsonNode> DeleteRequest(String url) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.delete(host + url)
                .header("Accept", json)
                .header("Content-Type", json)
                .basicAuth(username, password)
                .asJson();
        return request;

    }
}