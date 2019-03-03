package com.wanz.user;

public class GetUserResponse {
    private User user;

    public GetUserResponse() {}

    public GetUserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
