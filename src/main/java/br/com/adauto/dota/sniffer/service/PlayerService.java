package br.com.adauto.dota.sniffer.service;

import br.com.adauto.dota.sniffer.client.OpenDotaClient;
import br.com.adauto.dota.sniffer.dto.PlayerMatchesResponse;
import br.com.adauto.dota.sniffer.dto.PlayerResponse;
import br.com.adauto.dota.sniffer.mapper.PlayerMapper;
import br.com.adauto.dota.sniffer.mapper.PlayerMatchesMapper;
import br.com.adauto.dota.sniffer.model.PlayerEntity;
import br.com.adauto.dota.sniffer.model.PlayerMatchesEntity;
import br.com.adauto.dota.sniffer.repository.PlayerMatchesRepository;
import br.com.adauto.dota.sniffer.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMatchesRepository playerMatchesRepository;
    private final OpenDotaClient openDotaClient;
    private final PlayerMapper playerMapper;
    private final PlayerMatchesMapper playerMatchesMapper;


    public PlayerService(PlayerRepository playerRepository, PlayerMatchesRepository playerMatchesRepository, OpenDotaClient openDotaClient, PlayerMapper playerMapper, PlayerMatchesMapper playerMatchesMapper) {
        this.playerRepository = playerRepository;
        this.playerMatchesRepository = playerMatchesRepository;
        this.openDotaClient = openDotaClient;
        this.playerMapper = playerMapper;
        this.playerMatchesMapper = playerMatchesMapper;
    }

    public PlayerEntity getPlayerById(Long id){
        PlayerResponse playerResponse = openDotaClient.getPlayerById(id);
        PlayerEntity playerEntity = playerMapper.toEntity(playerResponse);
        playerEntity.setAccountId(id);
        return playerRepository.save(playerEntity);
    }

    public List<PlayerEntity> getAllPlayerSaved(){
        return playerRepository.findAll();
    }

    public List<PlayerMatchesEntity> getPlayerMatchesById(Long id, Integer date){
        List<PlayerMatchesResponse> playerMatchesResponses = openDotaClient.getPlayerMatchesById(id, date);
        List<PlayerMatchesEntity> playerMatchesEntities = playerMatchesMapper.toEntityList(playerMatchesResponses);
        return playerMatchesRepository.saveAll(playerMatchesEntities);
    }
}
