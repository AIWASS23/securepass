package mappers;

import entities.Password;
import entities.User;
import records.password.PasswordResponseRecord;
import records.password.PasswordRequestRecord;

public class PasswordMapper {
    public static PasswordResponseRecord entityToResponseRecord(Password password) {
        return new PasswordResponseRecord(password.getId(), password.getLabel(), password.getPassword(),
                password.getLinks());
    }

    public static Password requestRecordToEntity(PasswordRequestRecord passwordRequest, User owner) {
        return new Password(passwordRequest.label(), passwordRequest.password(), owner);
    }
}
