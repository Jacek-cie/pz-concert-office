package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.route.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.day.DayService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.route.RouteService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.RouteDayDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.RouteDay;
@Service
public class RouteDayService extends AbstractService<RouteDayDto, RouteDay> {
    @Autowired
    private RouteService routeService;
    @Autowired
    private DayService dayService;
    @Override
    public RouteDayDto toDto(RouteDay entity) {
        RouteDayDto dto = new RouteDayDto();
        dto.id = entity.getId();

        dto.idDay = entity.getDay().getId();
        dto.idRoute = entity.getRoute().getId();

        return dto;
    }

    @Override
    public RouteDay toEntity(RouteDayDto dto) {
        RouteDay entity = new RouteDay();
        entity.setId(dto.id);

        entity.setDay(dayService.findEntityById(dto.idDay));
        entity.setRoute(routeService.findEntityById(dto.idRoute));

        return entity;
    }
}
