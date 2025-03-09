package br.com.adauto.dota.sniffer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerResponse {
    @JsonProperty("solo_competitive_rank")
    private Integer soloCompetitiveRank = 0;
    @JsonProperty("competitive_rank")
    private Integer competitiveRank = 0;
    @JsonProperty("rank_tier")
    private Integer rankTier = 0;
    @JsonProperty("leaderboard_rank")
    private Integer leaderboardRank = 0;
    private ProfileDto profile;
}
