package services.password;

import java.util.UUID;
import org.springframework.data.domain.Page;

import records.password.PasswordRequestRecord;
import records.password.PasswordResponseRecord;

public interface PasswordServiceInterface {
    PasswordResponseRecord createPassword(PasswordRequestRecord passwordRequest, String tokenSubject);

    Page<PasswordResponseRecord> listPasswords(int page, int size, String tokenSubject);

    PasswordResponseRecord getPassword(UUID id, String tokenSubject);

    PasswordResponseRecord updatePassword(UUID id, PasswordRequestRecord passwordRequest, String tokenSubject);

    void deletePassword(UUID id, String tokenSubject);
}
