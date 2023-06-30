package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByName(String name);
}
