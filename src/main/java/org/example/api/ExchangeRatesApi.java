package org.example.api;

import lombok.SneakyThrows;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.logging.Logger;

public class ExchangeRatesApi {
    private static final String API_URL = "http://api.exchangeratesapi.io/v1/latest";
    private static final String ACCESS_KEY = "823646b7cd61268b0809af509627c01f";
    private ObjectMapper objectMapper = new ObjectMapper();
    @SneakyThrows
    public double receiveEurToRubRate() {
        HttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder(API_URL);
        uriBuilder.setParameter("access_key", ACCESS_KEY);
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        String response = EntityUtils.toString(httpClient.execute(httpGet).getEntity());
        System.out.println(response);
        JsonNode jsonNode = objectMapper.readTree(response);
        double euroToRubExchangeRate = jsonNode.get("rates").get("RUB").asDouble();
        return euroToRubExchangeRate;
    }
}