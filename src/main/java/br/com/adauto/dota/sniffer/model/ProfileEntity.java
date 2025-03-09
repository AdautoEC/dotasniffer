package br.com.adauto.dota.sniffer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "profiles")
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long accountId;
    private String personaname;
    private String name;
    private Boolean plus;
    private Integer cheese;
    private String steamid;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private String profileurl;
    private String lastLogin;
    private String loccountrycode;
    private Boolean isContributor;
    private Boolean isSubscriber;
}
