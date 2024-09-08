package services.checker;

import records.checker.PasswordCheckerRequestRecord;
import records.checker.PasswordCheckerResponseRecord;

public interface PasswordCheckerServiceInterface {
    public PasswordCheckerResponseRecord checkPassword(PasswordCheckerRequestRecord passwordCheckerRequestRecord);
}
