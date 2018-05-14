package service;

import domain.Rider;

import java.util.List;

public interface EmulationService {
    void chooseMemberById(int id);
    void start();
    void shufflePlace(List<Rider> ridersList);
}
