package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account.type.AccountTypeService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.admin.AccountDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin.Account;

@Service
public class AccountService  extends AbstractService<AccountDto, Account> {

    @Autowired
    private AccountTypeService accountTypeService;
    @Override
    public AccountDto toDto(Account entity) {
        AccountDto dto = new AccountDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.name = entity.getName();
        dto.password = entity.getPassword();
        dto.email = entity.getEmail();
        dto.idAccountType = entity.getAccountType().getId();
        return dto;
    }

    @Override
    public Account toEntity(AccountDto dto) {
        Account entity = new Account();
        entity.setId(dto.id);
        entity.setVersion(dto.version );
        entity.setName(dto.name);
        entity.setEmail(dto.email);
        entity.setAccountType(accountTypeService.findEntityById(dto.idAccountType));
        return entity;
    }
}
