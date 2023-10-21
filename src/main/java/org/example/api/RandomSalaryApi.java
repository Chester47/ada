package org.example.api;

import lombok.SneakyThrows;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RandomSalaryApi {
    @SneakyThrows
    public String getRandomSalary(int min, int max, int count) {
        HttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder("http://www.randomnumberapi.com/api/v1.0/random");
        uriBuilder.setParameter("min", String.valueOf(min));
        uriBuilder.setParameter("max", String.valueOf(max));
        uriBuilder.setParameter("count", String.valueOf(count));

        HttpGet httpGet = new HttpGet(uriBuilder.build());

        String response1 = EntityUtils.toString(httpClient.execute(httpGet).getEntity());
        return response1;
    }
}