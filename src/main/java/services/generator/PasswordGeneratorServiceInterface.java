package services.generator;

import records.generator.PasswordGeneratorResponseRecord;

public interface PasswordGeneratorServiceInterface {
    PasswordGeneratorResponseRecord generatePassword(int length, boolean includeUppercase, boolean includeLowercase,
            boolean includeNumbers, boolean includeSpecial);
}
