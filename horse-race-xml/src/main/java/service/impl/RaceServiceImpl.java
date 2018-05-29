package service.impl;

import domain.Race;
import domain.Rider;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import service.RaceService;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class RaceServiceImpl implements RaceService {
    final Random random = new Random();

    private Race raceInfo;

    @Override
    public void info() {
        raceInfo.setDate(LocalTime.of((11 + random.nextInt(6)), 00, 00));
        System.out.println((char) 27 + "[35m" + "Today's Racecards" + (char) 27 + "[0m");
        System.out.println(raceInfo.getDate().getHour() + ":00 | " + raceInfo.getRidersList().size() + " Runners");
        int i = 1;
        for (Rider rider : raceInfo.getRidersList()) {
            System.out.println(i++ + ") " + rider);
        }
    }

    @Override
    public void addMember(List<Rider> rider) {
        raceInfo.setRidersList(rider.subList(0, 4 + random.nextInt(2)));
    }
}
