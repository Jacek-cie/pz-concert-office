package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.OriginsSetup;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.admin.AccountDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin.Account;

@CrossOrigin(origins = OriginsSetup.URL, maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/account/")
public class AccountController  extends AbstractController<AccountService, AccountDto, Account> {
}
