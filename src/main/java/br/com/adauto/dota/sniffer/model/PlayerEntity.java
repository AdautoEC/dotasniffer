package br.com.adauto.dota.sniffer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "players")
public class PlayerEntity {
    @Id
    private Long accountId;
    private Integer soloCompetitiveRank;
    private Integer competitiveRank;
    private Integer rankTier;
    private Integer leaderboardRank;
    private String personaname;
    private String name;
    private String steamid;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private String profileurl;
    private String lastLogin;
    private String loccountrycode;
}
