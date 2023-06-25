package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main;

import jakarta.persistence.*;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.City;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Concert;

import java.util.Collection;

public class SchoolDto extends AbstractDto {

    public String name;

    public String street;

    public String buildingNumber;

    public String phoneNumber;

    public String description;
    public Long idCity;
    //TODO lista concert i obiekt city

}
