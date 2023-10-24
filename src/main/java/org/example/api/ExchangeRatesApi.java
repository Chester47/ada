package org.example.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ExchangeRatesApi {
    private static final String API_URL = "http://api.exchangeratesapi.io/v1/latest";
    private static final String ACCESS_KEY = "ee19ab8b912630f2f91b794dd6137e7b";
    private ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    public double receiveEurToRubRate() {
        HttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder(API_URL);
        uriBuilder.setParameter("access_key", ACCESS_KEY);
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        String response = EntityUtils.toString(httpClient.execute(httpGet).getEntity());
        JsonNode jsonNode = objectMapper.readTree(response);
        double euroToRubExchangeRate = jsonNode.get("rates").get("RUB").asDouble();
        return euroToRubExchangeRate;
    }

    @SneakyThrows
    public double receiveEurToIrrRate() {
        HttpClient httpClientIrr = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder(API_URL);
        uriBuilder.setParameter("access_key", ACCESS_KEY);
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        String response = EntityUtils.toString(httpClientIrr.execute(httpGet).getEntity());
        JsonNode jsonNode = objectMapper.readTree(response);
        double irrToRubExchangeRate = jsonNode.get("rates").get("IRR").asDouble();
        return irrToRubExchangeRate;
    }
    @SneakyThrows
    public double receiveEurToFkpRate() {
        HttpClient httpClientIrr = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder(API_URL);
        uriBuilder.setParameter("access_key", ACCESS_KEY);
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        String response = EntityUtils.toString(httpClientIrr.execute(httpGet).getEntity());
        JsonNode jsonNode = objectMapper.readTree(response);
        double fkpToRubExchangeRate = jsonNode.get("rates").get("FKP").asDouble();
        return fkpToRubExchangeRate;
    }
}