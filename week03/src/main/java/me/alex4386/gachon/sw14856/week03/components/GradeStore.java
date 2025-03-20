package me.alex4386.gachon.sw14856.week03.components;

import me.alex4386.gachon.sw14856.week03.models.GradeData;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Component
public class GradeStore {
    public HashMap<String, GradeData> dataStore = new HashMap<>();

    public GradeData[] listAll() {
        return dataStore.values().toArray(new GradeData[0]);
    }

    public GradeData get(String key) {
        return dataStore.get(key);
    }

    public GradeData set(String key, GradeData data) {
        return dataStore.put(key, data);
    }

    public boolean exists(String key) {
        return this.get(key) != null;
    }

    public void remove(String key) {
        dataStore.remove(key);
    }

    public double getTotal() {
        double total = 0;
        for (GradeData data : dataStore.values()) {
            total += data.getTotal();
        }
        return total;
    }

    public double getAverage() {
        if (dataStore.size() == 0) return 0;
        return this.getTotal() / dataStore.size();
    }

}
