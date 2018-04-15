package ru.fronto.stat.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.fronto.stat.server.entity.Game;

import java.util.Date;

/**
 * Created by Alex on 08.03.2018.
 */

@RestController
@RequestMapping("/stat")
public class StatController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Game getStat() {
        return createMockGame();
    }

    private Game createMockGame() {
        Game game = new Game();
        game.setCoefficient1(3.60f);
        game.setCoefficient2(2.1f);
        game.setCoefficientX(3.35f);
        game.setGameDate(new Date());
        game.setGoals1(0);
        game.setGoals2(1);
        game.setId(1);
        game.setLeague("Бундеслига");
        game.setRound(26);
        game.setTeam1("Майнц 05");
        game.setTeam2("Шальке 04");

        return game;

    }

}
