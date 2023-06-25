package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@MappedSuperclass
public abstract class AbstractEntity extends AbstractBaseEntity{

    @Column(
            name = "version",
            nullable = false,
            columnDefinition = "integer default 1"
    )
    private Integer version ;


}
