package br.com.adauto.dota.sniffer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileResponse {
    @JsonProperty("account_id")
    private Integer accountId = 0;
    @JsonProperty("personaname")
    private String personaname = "";
    @JsonProperty("name")
    private String name = "";
    @JsonProperty("plus")
    private Boolean plus = false;
    @JsonProperty("cheese")
    private Integer cheese = 0;
    @JsonProperty("steamid")
    private String steamid = "";
    @JsonProperty("avatar")
    private String avatar = "";
    @JsonProperty("avatarmedium")
    private String avatarmedium = "";
    @JsonProperty("avatarfull")
    private String avatarfull = "";
    @JsonProperty("profileurl")
    private String profileurl = "";
    @JsonProperty("last_login")
    private String lastLogin = "";
    @JsonProperty("loccountrycode")
    private String loccountrycode = "";
    @JsonProperty("is_contributor")
    private Boolean isContributor = false;
    @JsonProperty("is_subscriber")
    private Boolean isSubscriber = false;
}
