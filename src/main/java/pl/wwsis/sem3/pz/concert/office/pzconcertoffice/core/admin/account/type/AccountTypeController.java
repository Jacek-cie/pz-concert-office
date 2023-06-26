package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account.type;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractController;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.OriginsSetup;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.admin.AccountTypeDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin.AccountType;

@CrossOrigin(origins = OriginsSetup.URL, maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/accountType/")
public class AccountTypeController extends AbstractController<AccountTypeService, AccountTypeDto, AccountType> {
}
