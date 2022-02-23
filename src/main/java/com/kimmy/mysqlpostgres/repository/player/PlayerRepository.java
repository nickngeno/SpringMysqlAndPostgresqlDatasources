package com.kimmy.mysqlpostgres.repository.player;

import com.kimmy.mysqlpostgres.models.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
}
