package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.City;
@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
