package br.com.adauto.dota.sniffer.mapper;

import br.com.adauto.dota.sniffer.dto.PlayerResponse;
import br.com.adauto.dota.sniffer.model.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    @Mapping(target = "accountId", source = "profile.accountId")
    @Mapping(target = "soloCompetitiveRank", source = "soloCompetitiveRank")
    @Mapping(target = "competitiveRank", source = "competitiveRank")
    @Mapping(target = "rankTier", source = "rankTier")
    @Mapping(target = "leaderboardRank", source = "leaderboardRank")
    @Mapping(target = "personaname", source = "profile.personaname")
    @Mapping(target = "name", source = "profile.name")
    @Mapping(target = "steamid", source = "profile.steamid")
    @Mapping(target = "avatar", source = "profile.avatar")
    @Mapping(target = "avatarmedium", source = "profile.avatarmedium")
    @Mapping(target = "avatarfull", source = "profile.avatarfull")
    @Mapping(target = "profileurl", source = "profile.profileurl")
    @Mapping(target = "lastLogin", source = "profile.lastLogin")
    @Mapping(target = "loccountrycode", source = "profile.loccountrycode")
    PlayerEntity toEntity(PlayerResponse playerResponse);

    @Mapping(target = "profile.accountId", source = "accountId")
    @Mapping(target = "profile.personaname", source = "personaname")
    @Mapping(target = "profile.name", source = "name")
    @Mapping(target = "profile.steamid", source = "steamid")
    @Mapping(target = "profile.avatar", source = "avatar")
    @Mapping(target = "profile.avatarmedium", source = "avatarmedium")
    @Mapping(target = "profile.avatarfull", source = "avatarfull")
    @Mapping(target = "profile.profileurl", source = "profileurl")
    @Mapping(target = "profile.lastLogin", source = "lastLogin")
    @Mapping(target = "profile.loccountrycode", source = "loccountrycode")
    PlayerResponse toResponse(PlayerEntity playerEntity);
}
