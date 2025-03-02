package com.example.News.Aggregator.API.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@Service
public class NewsService {
    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<Map<String, Object>> getNews(String category) {
        String apiKey = "36f58ab3-f03e-4393-b427-e3edf575ddbd";
        String url = "https://newsapi.ai/api/v1/article/getArticles?category=" + category + "&apiKey=" + apiKey;

        return webClientBuilder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(Map.class)
                .map(response -> (List<Map<String, Object>>) response.get("articles"))
                .block();
    }
}

