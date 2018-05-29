import domain.Race;
import domain.Rider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.EmulationService;
import service.RaceService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HorseRaceProjectApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Race race = context.getBean("race", Race.class);
        RaceService raceService = context.getBean("raceService", RaceService.class);
        EmulationService emulator = context.getBean("emulationService", EmulationService.class);

        Rider rider1 = context.getBean("rider1", Rider.class);
        Rider rider2 = context.getBean("rider2", Rider.class);
        Rider rider3 = context.getBean("rider3", Rider.class);
        Rider rider4 = context.getBean("rider4", Rider.class);
        Rider rider5 = context.getBean("rider5", Rider.class);
        Rider rider6 = context.getBean("rider6", Rider.class);
        Rider rider7 = context.getBean("rider7", Rider.class);
        Rider rider8 = context.getBean("rider8", Rider.class);
        Rider rider9 = context.getBean("rider9", Rider.class);
        Rider rider10 = context.getBean("rider10", Rider.class);
        Stream<Rider> ridersStream = Stream.of(rider1, rider2, rider3, rider4, rider5, rider6, rider7, rider8, rider9, rider10);
        ArrayList<Rider> ridersList = ridersStream.collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(ridersList);
        raceService.setRaceInfo(race);
        raceService.addMember(ridersList);
        raceService.info();

        System.out.print((char) 27 + "[32m" + "Choose rider: " + (char) 27 + "[0m");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        emulator.setRaceService(raceService);
        emulator.chooseMemberById(i - 1);
        emulator.start();
    }
}
