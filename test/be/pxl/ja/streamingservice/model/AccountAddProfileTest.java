package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.exception.TooManyProfilesException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountAddProfileTest {

    @Test
    public void BasicStreamingPlanAddExtraProfile() {
        Account newAccount = new Account("email", "password");
        newAccount.setStreamingPlan(StreamingPlan.BASIC);

        Profile newProfile = new Profile("User");
        assertThrows(TooManyProfilesException.class, () -> {
            newAccount.addProfile(newProfile);
        });
    }
}
