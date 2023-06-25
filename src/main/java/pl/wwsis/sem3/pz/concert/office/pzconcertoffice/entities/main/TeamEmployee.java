package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractBaseEntity;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team_employee")
public class TeamEmployee extends AbstractBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_team",referencedColumnName="id")
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_employee",referencedColumnName="id")
    private Employee employee;
}
