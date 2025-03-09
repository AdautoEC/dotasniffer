package br.com.adauto.dota.sniffer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDto {
    private Integer accountId;
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
