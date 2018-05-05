package servlet;

import java.util.HashMap;
import java.util.Map;

public enum UserDataService {
    Instance;
    private Map<Integer, String> dataMap = new HashMap<>();

    public void saveUserById(int id, String data){
        dataMap.put(id, data);
    }
    public String getUserById(int id){
        return dataMap.get(id);
    }
}