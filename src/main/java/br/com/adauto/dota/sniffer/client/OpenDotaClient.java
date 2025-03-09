package br.com.adauto.dota.sniffer.client;

import br.com.adauto.dota.sniffer.dto.PlayerResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

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
}
