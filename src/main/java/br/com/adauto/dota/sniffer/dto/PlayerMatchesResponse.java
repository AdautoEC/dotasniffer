package br.com.adauto.dota.sniffer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerMatchesResponse {
    @JsonProperty("match_id")
    private long matchId;
    @JsonProperty("player_slot")
    private int playerSlot;
    @JsonProperty("radiant_win")
    private boolean radiantWin;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("game_mode")
    private int gameMode;
    @JsonProperty("lobby_type")
    private int lobbyType;
    @JsonProperty("hero_id")
    private int heroId;
    @JsonProperty("start_time")
    private long startTime;
    @JsonProperty("version")
    private int version;
    @JsonProperty("kills")
    private int kills;
    @JsonProperty("deaths")
    private int deaths;
    @JsonProperty("assists")
    private int assists;
    @JsonProperty("skill")
    private int skill;
    @JsonProperty("average_rank")
    private int averageRank;
    @JsonProperty("leaver_status")
    private int leaverStatus;
    @JsonProperty("party_size")
    private int partySize;
    @JsonProperty("hero_variant")
    private int heroVariant;
}

