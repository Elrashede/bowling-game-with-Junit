package com.example.bowling.sevices;

import com.example.bowling.dto.Player;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GameService {

  public boolean isPerfect(int score){
        if(score==300)
            return true;
        else
            return false;
  }
    public int scoreResult(byte[]rollsScore) {
        int score = 0;
        int cur = 0;
        for (int i = 0; i < 10; i++) {
            //spare
            if (rollsScore[cur] + rollsScore[cur + 1] == 10) {
                score += 10 + rollsScore[cur + 2];
                cur += 2;//finished this frame


                //strike

            } else if (rollsScore[cur] == 10) {
                score += 10 + rollsScore[cur + 1] + rollsScore[cur + 2];
                cur++;

            }
            //usual frame
            else {
                score += rollsScore[cur + 1] + rollsScore[cur + 2];
                cur += 2;
            }

        }
        return score;

    }
    public List<Player> finalResult(Map<String,byte[]>data){
        List<Player>playerList=new ArrayList<>();
        for (Map.Entry<String,byte[]> entry : data.entrySet()){
            int score=scoreResult(entry.getValue());
            playerList.add(new Player(entry.getKey(),score,isPerfect(score)));
        }
        playerList.sort(Comparator.comparing(Player::getScore));
        return playerList;

    }
}
