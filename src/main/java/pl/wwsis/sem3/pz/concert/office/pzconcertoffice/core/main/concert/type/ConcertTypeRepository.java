package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertType;
@Repository
public interface ConcertTypeRepository extends JpaRepository<ConcertType,Long> {
}
