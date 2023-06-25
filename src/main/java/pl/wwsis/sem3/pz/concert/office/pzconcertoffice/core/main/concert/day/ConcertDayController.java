package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.day;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.ConcertDayDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertDay;

@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/concertDay/")
public class ConcertDayController extends AbstractController<ConcertDayService, ConcertDayDto, ConcertDay> {
}
