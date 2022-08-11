package com.example.bowling;
import com.example.bowling.dto.Player;
import org.junit.jupiter.api.Test;
import com.example.bowling.sevices.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GameServiceTest {
    @Autowired
    GameService gameService;

    byte [] arr;
    @Test
     public void testScoreResultAllStrike(){
       byte [] arr;
               arr=new byte[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals(gameService.scoreResult(arr),300);

     }

    @Test
    public void testScoreResult(){
        arr=new byte[]{6,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(gameService.scoreResult(arr),15);
    }

    @Test
    public void testHasStrike(){
       arr=new byte[]{10,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertNotEquals(gameService.scoreResult(arr),15);
    }

    @Test
    public void testHasSPare(){
       arr=new byte[]{6,4,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertSame(gameService.scoreResult(arr),13);
    }

    @Test
    public void testHasSpareAndStrike(){
        arr=new byte[]{10,4,10,0,5,5,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertNotEquals(gameService.scoreResult(arr),36);
    }

    @Test
    public void testISPerfectTrue(){
        arr=new byte[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int sco=gameService.scoreResult(arr);
        assertTrue(gameService.isPerfect(sco));
    }

    @Test
    public void testISPerfectFalse(){
       arr=new byte[]{6,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int sco=gameService.scoreResult(arr);
        assertFalse(gameService.isPerfect(sco));
    }


    @Test
   public void testfinalResult(){
        //Given
        Map<String,byte[]>map=new HashMap<>();
        map.put("ahmed",new byte[]{6,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});

        //when
        List<Player>p= gameService.finalResult(map);

        //then
        System.out.println(p);



   }


}
