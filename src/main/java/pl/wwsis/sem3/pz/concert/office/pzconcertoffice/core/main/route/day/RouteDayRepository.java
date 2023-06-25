package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.route.day;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.RouteDay;

@Repository
public interface RouteDayRepository extends JpaRepository<RouteDay,Long> {
}
