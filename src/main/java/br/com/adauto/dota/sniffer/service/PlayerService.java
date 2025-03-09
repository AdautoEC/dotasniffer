package br.com.adauto.dota.sniffer.service;

import br.com.adauto.dota.sniffer.client.OpenDotaClient;
import br.com.adauto.dota.sniffer.dto.PlayerResponse;
import br.com.adauto.dota.sniffer.mapper.PlayerMapper;
import br.com.adauto.dota.sniffer.model.PlayerEntity;
import br.com.adauto.dota.sniffer.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final OpenDotaClient openDotaClient;
    private final PlayerMapper playerMapper;


    public PlayerService(PlayerRepository playerRepository, OpenDotaClient openDotaClient, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.openDotaClient = openDotaClient;
        this.playerMapper = playerMapper;
    }

    public PlayerEntity getPlayerById(Long id){
        PlayerResponse playerResponse = openDotaClient.getPlayerById(id);
        PlayerEntity playerEntity = playerMapper.toEntity(playerResponse);
        if(playerEntity.getProfile().getAccountId() == null) playerEntity.getProfile().setAccountId(id);
        return playerRepository.save(playerEntity);
    }

    public List<PlayerEntity> getAllPlayerSaved(){
        return playerRepository.findAll();
    }
}
