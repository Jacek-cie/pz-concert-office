package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main;

import jakarta.persistence.*;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.School;

import java.util.Date;

public class ConcertDto extends AbstractDto {
    public Date timeStart;

    public Date timeEnd;

    public Long idSchool;
    //TODO lista dni
    public Long idConcertType;
}
