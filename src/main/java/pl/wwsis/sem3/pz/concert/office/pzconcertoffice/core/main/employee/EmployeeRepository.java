package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
