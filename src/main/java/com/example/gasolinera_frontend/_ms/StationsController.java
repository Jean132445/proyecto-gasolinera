package com.example.gasolinera_frontend._ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StationsController {

    private List<GasStation> stations = new ArrayList<GasStation>();

    public StationsController() {
        stations.add(new GasStation("Shell", "1234 Main St", "123-456-7890"));
        stations.add(new GasStation("Chevron", "5678 Elm St", "234-567-8901"));
        stations.add(new GasStation("Exxon", "9101 Oak St", "345-678-9012"));
    }

    @GetMapping("/stations")
    public List<GasStation> getStations() {
        return stations;
    }

    @GetMapping("/stations/{index}")
    public GasStation getStation(@PathVariable int index) {
        return stations.get(index);
    }

    @PostMapping("/stations")
    public void addStation(@RequestBody GasStation station) {
        stations.add(station);
    }
}


