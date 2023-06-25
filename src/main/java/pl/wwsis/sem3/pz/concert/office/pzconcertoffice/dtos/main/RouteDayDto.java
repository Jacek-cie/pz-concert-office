package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Day;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Route;

public class RouteDayDto extends AbstractDto {

    public Long idDay;

    //TODO obiekty zamiast id
    public Long idRoute;



}
