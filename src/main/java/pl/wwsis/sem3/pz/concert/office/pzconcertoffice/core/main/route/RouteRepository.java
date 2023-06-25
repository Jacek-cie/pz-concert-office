package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.route;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {
}
