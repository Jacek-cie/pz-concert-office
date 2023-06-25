package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.day;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Day;
@Repository
public interface DayRepository extends JpaRepository<Day,Long> {
}
