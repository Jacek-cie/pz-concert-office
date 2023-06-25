package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;

import java.util.Collection;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "concert")
public class Concert extends AbstractEntity {
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStart;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name="id_school",
            referencedColumnName="id",
            nullable=false)
    private School school;

    @OneToMany(mappedBy = "concert")
    private Collection<ConcertDay> concertDays;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name="id_concert_type",
            referencedColumnName="id",
            nullable=false)
    private ConcertType concertType;

    @Column(
            name = "number",
            nullable = false
    )
    private Long number;
}
