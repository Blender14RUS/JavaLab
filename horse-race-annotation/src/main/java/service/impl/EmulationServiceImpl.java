package service.impl;

import domain.Rider;
import lombok.*;
import org.springframework.stereotype.Service;
import service.EmulationService;
import service.RaceService;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class EmulationServiceImpl implements EmulationService {
    final Random random = new Random();
    private RaceService raceService;

    private Rider chooseRider;

    @Override
    public void chooseMemberById(int id) {
        chooseRider = raceService.getRaceInfo().getRidersList().get(id);
    }

    @Override
    public void start() {
        System.out.println("-----START-----");
        for (int i = 0; i < 3 + random.nextInt(3); i++) {
            System.out.println("-----CURRENT POSITIONS-----");
            shufflePlace(raceService.getRaceInfo().getRidersList());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-----FINISH-----");
        shufflePlace(raceService.getRaceInfo().getRidersList());
        if (raceService.getRaceInfo().getRidersList().get(0).equals(chooseRider)) {
            System.out.println((char) 27 + "[34m" + raceService.getRaceInfo().getRidersList().get(0).getName() + (char) 27 + "[0m");
            System.out.println((char) 27 + "[34m" + "Winner winner chicken dinner!" + (char) 27 + "[0m");
            System.out.println((char) 27 + "[34m" + "Congratulations, YOU WON!" + (char) 27 + "[0m");
        } else {
            System.out.println((char) 27 + "[31m" + "YOU LOSE" + (char) 27 + "[0m");
            System.out.println((char) 27 + "[31m" + raceService.getRaceInfo().getRidersList().get(0).getName() + " WIN" + (char) 27 + "[0m");
        }
    }

    @Override
    public void shufflePlace(List<Rider> ridersList) {
        Collections.shuffle(ridersList);
        int place = 1;
        for (Rider rider : ridersList) {
            if (rider.equals(chooseRider))
                System.out.println((char) 27 + "[33m" + place++ + ") " + rider + (char) 27 + "[0m");
            else System.out.println(place++ + ") " + rider);
        }
    }
}
