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
@Table(name = "route_day")
public class RouteDay extends AbstractBaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_day",referencedColumnName="id")
    private Day day;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_route",referencedColumnName="id")
    private Route route;


}
