package com.wanz.user;

import java.util.List;

public class ListUserResponse {
    private List<User> userList;

    public ListUserResponse() {}

    public ListUserResponse(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getListUser() {
        return userList;
    }

    public void setListUser(List<User> userList) {
        this.userList = userList;
    }
}
