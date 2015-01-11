package test.guice.service;

import com.google.inject.Inject;

import java.math.BigInteger;
import java.security.SecureRandom;

public class MySessionImpl implements Session {

    private String token;

    @Inject
    private MySessionImpl() {
        generateToken();
    }

    private void generateToken() {
        token = new BigInteger(130, new SecureRandom()).toString(32);
    }

    @Override
    public String getToken() {
        return token;
    }
}
