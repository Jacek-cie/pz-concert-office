package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.admin.account.AccountService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.admin.AccountDto;

@Service
public class LoginService {
    @Autowired
    private AccountService accountService;

    public LoginResponse checkLogin(LoginRequest loginRequest){
        AccountDto accountDto =  accountService.findByUsername(loginRequest.username);
        LoginResponse loginResponse = new LoginResponse();
        if(accountDto.password.equals(loginRequest.password)){
            loginResponse.status = "succes";
            loginResponse.user = mapAccountToUser(accountDto);
        }else{
            loginResponse.status = "401";
        }
        return loginResponse;
    }
    private UserPojo mapAccountToUser(AccountDto accountDto){
        UserPojo userPojo = new UserPojo();
        userPojo.id = accountDto.id;
        userPojo.username = accountDto.name;
        userPojo.admin_rights=accountDto.idAccountType;
        return userPojo;
    }
}