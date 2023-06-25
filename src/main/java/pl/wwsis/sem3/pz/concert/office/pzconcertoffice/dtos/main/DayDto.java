package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main;

import jakarta.persistence.*;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertDay;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertType;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.RouteDay;

import java.util.Calendar;
import java.util.Collection;

public class DayDto extends AbstractDto {

    public Calendar startDate;
    public Long idConcertType;
    //TODO Lista concertDay

    //TODO Lista routeDay

}
