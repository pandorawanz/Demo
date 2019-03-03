package com.wanz.user;

public class CreateUserResponse {
    private User user;

    public CreateUserResponse() {}

    public CreateUserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
