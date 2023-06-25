package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.School;
@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {
}
