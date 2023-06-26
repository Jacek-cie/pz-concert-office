package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.route.day;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.OriginsSetup;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.RouteDayDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.RouteDay;

@CrossOrigin(origins = OriginsSetup.URL, maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/routeDay/")
public class RouteDayController extends AbstractController<RouteDayService, RouteDayDto, RouteDay> {
}
