package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account.type;

import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.admin.AccountTypeDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin.AccountType;

@Service
public class AccountTypeService extends AbstractService<AccountTypeDto, AccountType> {
    @Override
    public AccountTypeDto toDto(AccountType entity) {
        AccountTypeDto dto = new AccountTypeDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.name = entity.getName();
        return dto;
    }

    @Override
    public AccountType toEntity(AccountTypeDto dto) {
        AccountType entity = new AccountType();
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        entity.setName(dto.name);
        return entity;

    }
}
