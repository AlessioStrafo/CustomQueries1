package co.develhope.ExerciseCustom1.Repositories;

import co.develhope.ExerciseCustom1.Entities.Flight;
import co.develhope.ExerciseCustom1.Entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByStatusIn(List<FlightStatus> statuses);
}
