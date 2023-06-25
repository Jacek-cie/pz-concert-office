package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.day;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertDay;

@Repository
public interface ConcertDayRepository extends JpaRepository<ConcertDay,Long> {
}
