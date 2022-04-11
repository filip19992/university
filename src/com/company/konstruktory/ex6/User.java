package com.company.konstruktory.ex6;

public class User {
    private String username;
    private String password;
    private String secret;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.secret = "---";
    }

    public User(String username, String password, String secret) {
        this.username = username;
        this.password = password;
        this.secret = secret;
    }

    public boolean authenticateCredentials(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public boolean authenticateSecret(String secret) {
        if(secret.equals("---")) {
            System.out.println("Secret is not set");
            return false;
        } else if(!secret.equals(this.secret)) {
            return false;
        } else return secret.equals(this.password);
    }

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

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
