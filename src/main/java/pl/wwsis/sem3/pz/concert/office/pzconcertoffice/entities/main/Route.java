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
@Table(name = "route")
public class Route extends AbstractEntity {
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)",
            unique = true
    )
    private String name;

    @Column(
            name = "description",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String description;
    @Column(
            name = "number",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private Long number;
    @OneToMany(mappedBy = "route")
    private Collection<RouteDay> routeDays;
}
