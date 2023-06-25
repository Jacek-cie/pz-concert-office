package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.city.CityService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.SchoolDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.School;
@Service
public class SchoolService extends AbstractService<SchoolDto, School> {
    @Autowired
    private CityService cityService;
    @Override
    public SchoolDto toDto(School entity) {
        SchoolDto dto = new SchoolDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.buildingNumber = entity.getBuildingNumber();
        dto.description = entity.getDescription();
        dto.name = entity.getName();
        dto.phoneNumber = entity.getPhoneNumber();
        dto.street = entity.getStreet();
        dto.idCity = entity.getCity().getId();
        return dto;
    }

    @Override
    public School toEntity(SchoolDto dto) {
        School entity = new School();
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        entity.setBuildingNumber(dto.buildingNumber);
        entity.setDescription(dto.description);
        entity.setName(dto.name);
        entity.setPhoneNumber(dto.phoneNumber);
        entity.setStreet(dto.street);
        entity.setCity(cityService.findEntityById(dto.idCity));
        return entity;
    }
}
