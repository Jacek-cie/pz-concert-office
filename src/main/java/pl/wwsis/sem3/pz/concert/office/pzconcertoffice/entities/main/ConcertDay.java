package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractBaseEntity;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "concert_day")
public class ConcertDay extends AbstractBaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_day",referencedColumnName="id")
    private Day day;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_concert",referencedColumnName="id")
    private Concert concert;


}
