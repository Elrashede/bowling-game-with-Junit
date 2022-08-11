package com.example.bowling;
import static org.junit.jupiter.api.Assertions.*;

import com.example.bowling.controllers.GameController;
import com.example.bowling.dto.Player;
import com.example.bowling.sevices.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameControllerTest {
    GameController gameController=new GameController();
    Player player;

    @Test
    public void testSetDataAndReturnResults() {
        List<Player>l;
        List<Player>l2=new ArrayList<>();

        Map<String, byte[]> data=new HashMap<>();

        byte []arr=new byte[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        data.put("ahmed", arr);

         l2.add(new Player("ahmed",300,true));

         l=gameController.setDataAndReturnResults(data);
        assertEquals(l.contains(player),l2.contains(player));
        assertEquals(l.size(),l2.size());

    }



}
