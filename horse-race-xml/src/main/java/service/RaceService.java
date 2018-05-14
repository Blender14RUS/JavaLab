package service;

import domain.Rider;

import java.util.List;

public interface RaceService {
    void info();

    void addMember(List<Rider> rider);
}
