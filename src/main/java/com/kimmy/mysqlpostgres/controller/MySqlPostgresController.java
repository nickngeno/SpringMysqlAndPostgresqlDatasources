package com.kimmy.mysqlpostgres.controller;

import com.kimmy.mysqlpostgres.models.club.Club;
import com.kimmy.mysqlpostgres.models.player.Player;
import com.kimmy.mysqlpostgres.service.MySqlPostgresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MySqlPostgresController {

    @Autowired
    private MySqlPostgresService service;


    @PostMapping("/addplayer")
    public Player addPlayer(@RequestBody  Player player) {
        return service.addPlayer(player);
    }

    @GetMapping("/player")
    public Player getPlayer(@RequestBody  Player player) {
        return service.getPlayer(player.getId());
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return service.getPlayers();
    }

    @PostMapping("/addclub")
    public Club addClub(@RequestBody  Club club) {
        return service.addClub(club);
    }

    @GetMapping("/clubs")
    public List<Club> getClubs() {
        return service.getClubs();
    }
}
