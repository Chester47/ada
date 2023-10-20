package org.example.api;

import lombok.SneakyThrows;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RandomWordApi {

    @SneakyThrows
    public String receiveTitle() {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://random-word-api.herokuapp.com/word?number=1");
        String response = EntityUtils.toString(httpClient.execute(httpGet).getEntity());
        return response;


    }
}