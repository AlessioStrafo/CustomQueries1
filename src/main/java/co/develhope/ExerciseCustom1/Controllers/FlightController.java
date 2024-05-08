package co.develhope.ExerciseCustom1.Controllers;

import co.develhope.ExerciseCustom1.Entities.Flight;
import co.develhope.ExerciseCustom1.Entities.FlightStatus;
import co.develhope.ExerciseCustom1.Services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;
    @GetMapping("/create-flights")
    public List<Flight> createFlights() {
        return flightService.createFlights(50);
    }
    @GetMapping("/all-flights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
    @GetMapping("/customQueryFlights")
    public List<Flight> getCustomQueryFlights(@RequestParam("p1") FlightStatus p1, @RequestParam("p2") FlightStatus p2) {
        return flightService.getCustomQueryFlights(p1, p2);
    }
}
