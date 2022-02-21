package swaglabs.model;

public enum SwaglabasUser {
    STANDARD_USER("standard_user","secret_sauce");

    public final String username;
    public final String password;

    SwaglabasUser(String username, String password) {
        this.username = username;
        this.password = password;

    }
}
