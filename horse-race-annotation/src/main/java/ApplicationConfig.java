import domain.Breed;
import domain.Horse;
import domain.Race;
import domain.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.EmulationService;
import service.RaceService;
import service.impl.EmulationServiceImpl;
import service.impl.RaceServiceImpl;

@Configuration
public class ApplicationConfig {

    @Bean
    public Breed breed1() {
        return Breed.builder().name("Arabian").maxSpeed(70).build();
    }

    @Bean
    public Breed breed2() {
        return Breed.builder().name("Thoroughbred").maxSpeed(69).build();
    }

    @Bean
    public Breed breed3() {
        return Breed.builder().name("Warmblood").maxSpeed(68).build();
    }

    @Bean
    public Horse horse1() {
        return Horse.builder().name("Diablo").age(8).breed(breed1()).build();
    }

    @Bean
    public Horse horse2() {
        return Horse.builder().name("Oki Doki").age(8).breed(breed2()).build();
    }

    @Bean
    public Horse horse3() {
        return Horse.builder().name("Oscar").age(9).breed(breed3()).build();
    }

    @Bean
    public Horse horse4() {
        return Horse.builder().name("Luckystars").age(8).breed(breed1()).build();
    }

    @Bean
    public Horse horse5() {
        return Horse.builder().name("Unity").age(9).breed(breed2()).build();
    }

    @Bean
    public Horse horse6() {
        return Horse.builder().name("Grace").age(8).breed(breed3()).build();
    }

    @Bean
    public Horse horse7() {
        return Horse.builder().name("Nitro").age(7).breed(breed1()).build();
    }

    @Bean
    public Horse horse8() {
        return Horse.builder().name("Yankee").age(9).breed(breed3()).build();
    }

    @Bean
    public Horse horse9() {
        return Horse.builder().name("Aitch").age(8).breed(breed2()).build();
    }

    @Bean
    public Horse horse10() {
        return Horse.builder().name("Isis").age(10).breed(breed1()).build();
    }

    @Bean
    public Rider rider1() {
        return Rider.builder().name("Aleksey Naval'nyy").age(41).horse(horse1()).build();
    }

    @Bean
    public Rider rider2() {
        return Rider.builder().name("Caroline Powell").age(45).horse(horse3()).build();
    }

    @Bean
    public Rider rider3() {
        return Rider.builder().name("Andreas Dibowski").age(52).horse(horse5()).build();
    }

    @Bean
    public Rider rider4() {
        return Rider.builder().name("Steffen Peters").age(53).horse(horse2()).build();
    }

    @Bean
    public Rider rider5() {
        return Rider.builder().name("Ian Millar").age(71).horse(horse4()).build();
    }

    @Bean
    public Rider rider6() {
        return Rider.builder().name("Dorothee Schneider").age(49).horse(horse7()).build();
    }

    @Bean
    public Rider rider7() {
        return Rider.builder().name("Chantal Sutherland").age(42).horse(horse6()).build();
    }

    @Bean
    public Rider rider8() {
        return Rider.builder().name("Carl Bouckaert").age(63).horse(horse8()).build();
    }

    @Bean
    public Rider rider9() {
        return Rider.builder().name("Andrew Nicholson").age(56).horse(horse10()).build();
    }

    @Bean
    public Rider rider10() {
        return Rider.builder().name("Vladimir Putin").age(65).horse(horse9()).build();
    }

    @Bean
    public Race race() {
        return new Race();
    }

    @Bean
    public RaceService raceService() {
        return RaceServiceImpl.builder().build();
    }

    @Bean
    public EmulationService emulationService() {
        return EmulationServiceImpl.builder().build();
    }
}
