package br.com.adauto.dota.sniffer.mapper;

import br.com.adauto.dota.sniffer.dto.ProfileResponse;
import br.com.adauto.dota.sniffer.model.ProfileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileMapper INSTANCE = Mappers.getMapper(ProfileMapper.class);

    ProfileEntity toEntity(ProfileResponse response);
    ProfileEntity toResponse(ProfileEntity entity);

}
