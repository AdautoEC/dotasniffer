package br.com.adauto.dota.sniffer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {
    private Integer soloCompetitiveRank;
    private Integer competitiveRank;
    private Integer rankTier;
    private Integer leaderboardRank;
    private ProfileDto profile;
}
