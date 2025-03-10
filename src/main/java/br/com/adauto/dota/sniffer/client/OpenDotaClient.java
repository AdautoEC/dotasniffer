package br.com.adauto.dota.sniffer.client;

import br.com.adauto.dota.sniffer.dto.PlayerMatchesResponse;
import br.com.adauto.dota.sniffer.dto.PlayerResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class OpenDotaClient {
    private final WebClient webClient;

    public OpenDotaClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://api.opendota.com/api").build();
    }

    public PlayerResponse getPlayerById(Long id) {
        return webClient.get()
                .uri("/players/" + id)
                .retrieve()
                .bodyToMono(PlayerResponse.class)
                .block(); // sync
    }

    public List<PlayerMatchesResponse> getPlayerMatchesById(Long id, Integer date) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/players/" + id + "/matches")
                        .queryParam("date", date)
                        .build()
                )
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<PlayerMatchesResponse>>() {})
                .block(); // sync
    }
}
