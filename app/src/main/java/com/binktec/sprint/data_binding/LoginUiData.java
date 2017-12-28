package com.binktec.sprint.data_binding;

public class LoginUiData {
    String username;
    String password;
    String usernameError;
    String passwordError;
    String authenticateError;
    boolean authInProcess;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public String getAuthenticateError() {
        return authenticateError;
    }

    public void setAuthenticateError(String authenticateError) {
        this.authenticateError = authenticateError;
    }

    public boolean getAuthInProcess() {
        return authInProcess;
    }

    public void setAuthInProcess(boolean authInProcess) {
        this.authInProcess = authInProcess;
    }
}
