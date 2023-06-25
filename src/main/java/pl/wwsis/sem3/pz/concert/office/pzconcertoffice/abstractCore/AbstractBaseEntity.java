package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractBaseEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id",
            nullable=false,unique=true
    )
    private Long id;
}
