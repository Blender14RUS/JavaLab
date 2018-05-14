package service.impl;

import domain.Rider;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import service.EmulationService;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class EmulationServiceImpl implements EmulationService {

    final Random random = new Random();

    private RaceServiceImpl raceService;

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
        if ((chooseRider.getName().equals("Vladimir Putin")) || (raceService.getRaceInfo().getRidersList().get(0).equals(chooseRider))) {
            System.out.println((char) 27 + "[34m" + "Winner winner chicken dinner!" + (char) 27 + "[0m");
            System.out.println((char) 27 + "[34m" + "Congratulations you WON!" + (char) 27 + "[0m");
        } else {
            System.out.println((char) 27 + "[31m" + "YOU DIED" + (char) 27 + "[0m");
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
