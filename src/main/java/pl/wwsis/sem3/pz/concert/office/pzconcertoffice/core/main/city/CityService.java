package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.city;

import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.CityDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.City;


@Service
public class CityService extends AbstractService<CityDto, City> {
    

    @Override
    public CityDto toDto(City entity) {
        CityDto cityDto = new CityDto();
        cityDto.id = entity.getId();
        cityDto.version = entity.getVersion();
        cityDto.name = entity.getName();
        return cityDto;
    }

    @Override
    public City toEntity(CityDto dto) {
        City city = new City();
        city.setName(dto.name);
        city.setId(dto.id);
        city.setVersion(dto.version);
        return city;
    }
}
