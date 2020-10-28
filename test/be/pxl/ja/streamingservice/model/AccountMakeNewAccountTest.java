package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountMakeNewAccountTest {

    @Test
    public void newAccountMakesNewProfileAndAddsToProfilesHashmap() {
        Account newAccount = new Account("maude@email.be", "1234");

        Assertions.assertEquals("Profile1", newAccount.getProfile("Profile1").getName());
    }

}
