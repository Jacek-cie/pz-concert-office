package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.OriginsSetup;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.ConcertDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Concert;

@CrossOrigin(origins = OriginsSetup.URL, maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/concert/")
public class ConcertController extends AbstractController<ConcertService, ConcertDto, Concert> {
}
