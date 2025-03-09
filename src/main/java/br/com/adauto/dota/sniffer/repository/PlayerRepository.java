package br.com.adauto.dota.sniffer.repository;

import br.com.adauto.dota.sniffer.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> { }
