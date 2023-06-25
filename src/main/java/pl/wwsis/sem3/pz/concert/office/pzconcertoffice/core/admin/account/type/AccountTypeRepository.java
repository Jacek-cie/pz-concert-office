package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType,Long> {
}
