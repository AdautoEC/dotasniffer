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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer soloCompetitiveRank;
    private Integer competitiveRank;
    private Integer rankTier;
    private Integer leaderboardRank;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private ProfileEntity profile;
}
