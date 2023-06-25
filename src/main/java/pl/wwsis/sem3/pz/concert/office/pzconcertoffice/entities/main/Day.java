package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;

import java.util.Calendar;
import java.util.Collection;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "day")
public class Day extends AbstractEntity {

    @Column(
            name = "number",
            nullable = false
    )
    private Long number;
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    @OneToMany(mappedBy = "day")
    private Collection<ConcertDay> concertDays;
    @OneToMany(mappedBy = "day")
    private Collection<RouteDay> routeDays;
}
