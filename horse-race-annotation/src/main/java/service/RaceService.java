package service;

import domain.Race;
import domain.Rider;

import java.util.List;

public interface RaceService {
    void info();

    void addMember(List<Rider> rider);

    Race getRaceInfo();

    void setRaceInfo(Race raceInfo);
}
