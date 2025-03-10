package br.com.adauto.dota.sniffer.mapper;

import br.com.adauto.dota.sniffer.dto.PlayerMatchesResponse;
import br.com.adauto.dota.sniffer.model.PlayerMatchesEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMatchesMapper {
    PlayerMatchesEntity toEntity(PlayerMatchesResponse playerMatchesResponse);
    PlayerMatchesResponse toResponse(PlayerMatchesEntity playerMatchesEntity);
    List<PlayerMatchesEntity> toEntityList(List<PlayerMatchesResponse> responseList);
    List<PlayerMatchesResponse> toResponseList(List<PlayerMatchesEntity> entityList);
}
