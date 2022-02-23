package com.kimmy.mysqlpostgres.service;

import com.kimmy.mysqlpostgres.models.club.Club;
import com.kimmy.mysqlpostgres.models.player.Player;

import java.util.List;

public interface MySqlPostgresService {
    Player addPlayer(Player player);

    List<Player> getPlayers();

    List<Club> getClubs();

    Club addClub(Club club);

    Player getPlayer(int id);
}
