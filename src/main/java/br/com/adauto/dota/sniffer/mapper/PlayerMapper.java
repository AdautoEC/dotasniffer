package br.com.adauto.dota.sniffer.mapper;

import br.com.adauto.dota.sniffer.dto.PlayerResponse;
import br.com.adauto.dota.sniffer.model.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = ProfileMapper.class)
public interface PlayerMapper {
    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    PlayerEntity toEntity(PlayerResponse response);
    PlayerResponse toResponse(PlayerEntity entity);
}
