package com.echo.loginpage;

import com.echo.loginapp.dao.UserDAO;
import com.echo.loginapp.dao.UserDAOinMemory;
import com.echo.loginapp.model.User;
import com.echo.loginapp.service.AuthenticationService;
import com.echo.loginapp.service.implementation.AuthenticationServiceImplementation;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by UserA on 7/1/2015.
 */
public class UserAuthenticationTest {

    AuthenticationService authenticationService = new AuthenticationServiceImplementation();

    @Test
    public void testUserIsAuthenticated() {
        Assert.assertTrue(authenticationService.isUserAuthenticated("Maria", "123456"));
    }
}
