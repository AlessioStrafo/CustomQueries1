package co.develhope.ExerciseCustom1.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "description")
    private String description;
    @Column(nullable = false, name = "fromAirport")
    private String fromAirpoirt;
    @Column(nullable = false, name = "toAirport")
    private String toAirport;


    @Enumerated(EnumType.STRING)
    private FlightStatus status = FlightStatus.ON_TIME;
    @Enumerated(EnumType.STRING)
    private FlightStatus status2 = FlightStatus.DELAYED;
    @Enumerated(EnumType.STRING)
    private FlightStatus status3 = FlightStatus.CANCELLED;
}
