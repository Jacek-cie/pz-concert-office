package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.route;

import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.RouteDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Route;
@Service
public class RouteService extends AbstractService<RouteDto, Route> {
    @Override
    public RouteDto toDto(Route entity) {
        RouteDto dto = new RouteDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.name = entity.getName();
        dto.description = entity.getDescription();
        dto.number = entity.getNumber();
        return dto;

    }

    @Override
    public Route toEntity(RouteDto dto) {
        Route entity = new Route();
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        entity.setName(dto.name);
        entity.setDescription(dto.description);
        entity.setNumber(dto.number);
        return entity;
    }
}
