package com.example.bowling.controllers;

import com.example.bowling.dto.Player;
import com.example.bowling.sevices.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/game")
public class GameController {
    GameService gameService=new GameService();

    @PostMapping ("/user")
    public List<Player> setDataAndReturnResults(@RequestBody Map<String, byte[]>map) {

        return gameService.finalResult(map);
    }

}
