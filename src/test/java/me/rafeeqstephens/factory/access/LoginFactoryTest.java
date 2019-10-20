package me.rafeeqstephens.factory.access;

import me.rafeeqstephens.domain.access.Login;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginFactoryTest {


    @Test
    public void getUsername() {
        String name = "Rafeeq";
        Login l = LoginFactory.getUsername(name);
        System.out.println(l);
        Assert.assertNotNull(l.getUsername());
    }

    @Test
    public void getPassword() {
        String name = "password";
        Login l = LoginFactory.getPassword(name);
        System.out.println(l);
        Assert.assertNotNull(l.getPassword());
    }
}
