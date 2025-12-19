package com.example.userutils;

public class UserQuery {
    private Integer id;
    private String email;

    private UserQuery() {}

    public Integer getId() { return id; }
    public String getEmail() { return email; }

    public static UserQuery byId(int id) {
        UserQuery query = new UserQuery();
        query.id = id;
        return query;
    }

    public static UserQuery byEmail(String email) {
        UserQuery query = new UserQuery();
        query.email = email;
        return query;
    }
}

