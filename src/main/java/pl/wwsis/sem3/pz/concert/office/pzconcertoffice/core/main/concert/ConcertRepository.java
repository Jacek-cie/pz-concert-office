package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Concert;

@Repository
public interface ConcertRepository extends JpaRepository<Concert,Long> {
}
