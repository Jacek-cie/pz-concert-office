package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Team;
@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {
}
