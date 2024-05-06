package co.develhope.ExerciseCustom1.Repositories;

import co.develhope.ExerciseCustom1.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
