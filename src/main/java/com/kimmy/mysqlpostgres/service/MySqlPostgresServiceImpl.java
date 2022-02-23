package com.kimmy.mysqlpostgres.service;

import com.kimmy.mysqlpostgres.models.club.Club;
import com.kimmy.mysqlpostgres.models.player.Player;
import com.kimmy.mysqlpostgres.repository.club.ClubRepository;
import com.kimmy.mysqlpostgres.repository.player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySqlPostgresServiceImpl implements MySqlPostgresService {

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {

        return playerRepository.save(player);
    }

    @Override
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public List<Club> getClubs() {
        return clubRepository.findAll();
    }

    @Override
    public Club addClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public Player getPlayer(int id) {
        return playerRepository.getById(id);
    }

}
