package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main;

import jakarta.persistence.FetchType;
import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;

import java.util.Collection;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "school")
public class School extends AbstractEntity {

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)",
            unique = true
    )
    private String name;
    @Column(
            name = "street",
            columnDefinition = "VARCHAR(100)"
    )
    private String street;
    @Column(
            name = "buildingNumber",
            columnDefinition = "VARCHAR(10)"
    )
    private String buildingNumber;
    @Column(
            name = "phoneNumber",
            columnDefinition = "VARCHAR(15)"
    )
    private String phoneNumber;
    @Column(
            name = "description",
            columnDefinition = "VARCHAR(255)"
    )
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_city",referencedColumnName="id",nullable=false)
    private City city;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<Concert> concerts;
}
