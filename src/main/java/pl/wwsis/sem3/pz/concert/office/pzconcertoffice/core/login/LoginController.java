package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.OriginsSetup;

@CrossOrigin(origins = OriginsSetup.URL, maxAge = 3600)
@RestController
@RequestMapping(path = "api/v1/login/")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("")
    public LoginResponse checkLogin(@RequestBody LoginRequest loginRequest){
        return loginService.checkLogin(loginRequest);
    }
}
