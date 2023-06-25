package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.admin;

import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractDto;

public class AccountDto extends AbstractDto {
    public String name;
    public String password;
    public String email;
    public Long idAccountType;
    //TODO moze obiektTypu
}
