package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.city;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.CityDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.City;

@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/city/")
public class CityController extends AbstractController<CityService, CityDto, City> {
}
