package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String name;
    @Column(
            name = "surname",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String surname;
    @OneToMany(mappedBy = "employee")
    private Collection<TeamEmployee> teamEmployees;
}
