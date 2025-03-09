package br.com.adauto.dota.sniffer.controller;

import br.com.adauto.dota.sniffer.model.PlayerEntity;
import br.com.adauto.dota.sniffer.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public PlayerEntity getAllPlayerSaved(@PathVariable Long id) {
        return playerService.getPlayerById(id);
    }
}
