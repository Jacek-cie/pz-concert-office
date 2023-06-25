package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.RouteDay;

import java.util.Collection;

public class RouteDto extends AbstractDto {

    public String name;

    public String description;

    public Long number;
    //TODO list routeDay

}
