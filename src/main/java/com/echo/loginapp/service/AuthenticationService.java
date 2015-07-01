package com.echo.loginapp.service;

import com.echo.loginapp.model.User;

/**
 * Created by UserA on 30/6/2015.
 */
public interface AuthenticationService {
    public Boolean isUserAuthenticated(String username, String password);
}
