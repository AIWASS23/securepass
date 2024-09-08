package services.auth;

import records.auth.SignInRequestRecord;
import records.auth.SignInResponseRecord;
import records.auth.SignUpRequestRecord;
import records.auth.SignUpResponseRecord;

public interface AuthServiceInterface {
    SignInResponseRecord signIn(SignInRequestRecord signInRequest);

    SignUpResponseRecord signUp(SignUpRequestRecord signUpRequest);

    void deleteAccount(String tokenSubject);
}
