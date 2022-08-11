package com.example.bowling;

import com.example.bowling.controllers.GameController;
import com.example.bowling.dto.Player;
import com.example.bowling.sevices.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class BowlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BowlingApplication.class, args);
        GameController gameController = new GameController();
        List<Player> l = new ArrayList<>();
        List<Player> l2 = new ArrayList<>();

        Map<String, byte[]> data = new HashMap<>();

        byte[] arr = new byte[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        data.put("ahmed", arr);

        l2.add(new Player("ahmed", 300, true));

        l = gameController.setDataAndReturnResults(data);

    }
}
