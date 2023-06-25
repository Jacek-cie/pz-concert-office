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
@Table(name = "team")
public class Team extends AbstractEntity {

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)",
            unique = true
    )
    private String name;
    @OneToMany(mappedBy = "team")
    private Collection<TeamEmployee> teamEmployees;
}
