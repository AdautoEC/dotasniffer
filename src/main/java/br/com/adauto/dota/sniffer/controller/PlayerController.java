package br.com.adauto.dota.sniffer.controller;

import br.com.adauto.dota.sniffer.model.PlayerEntity;
import br.com.adauto.dota.sniffer.model.PlayerMatchesEntity;
import br.com.adauto.dota.sniffer.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<PlayerEntity> getAllPlayerSaved() {
        return playerService.getAllPlayerSaved();
    }

    @GetMapping("/{id}")
    public PlayerEntity getPlayerById(@PathVariable Long id) {
        return playerService.getPlayerById(id);
    }

    @GetMapping("/{id}/matches")
    public List<PlayerMatchesEntity> getPlayerMatchesById(
            @PathVariable Long id,
            @RequestParam Integer date
    ) {
        return playerService.getPlayerMatchesById(id, date);
    }
}
