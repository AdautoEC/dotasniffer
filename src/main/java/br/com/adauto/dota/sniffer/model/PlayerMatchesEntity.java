package br.com.adauto.dota.sniffer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "player_matches")
public class PlayerMatchesEntity {
    @Id
    private long matchId;
    private int playerSlot;
    private boolean radiantWin;
    private int duration;
    private int gameMode;
    private int lobbyType;
    private int heroId;
    private long startTime;
    private int version;
    private int kills;
    private int deaths;
    private int assists;
    private int skill;
    private int averageRank;
    private int leaverStatus;
    private int partySize;
    private int heroVariant;
}
