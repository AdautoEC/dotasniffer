package br.com.adauto.dota.sniffer.repository;

import br.com.adauto.dota.sniffer.model.PlayerMatchesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerMatchesRepository extends JpaRepository<PlayerMatchesEntity, Long> { }
