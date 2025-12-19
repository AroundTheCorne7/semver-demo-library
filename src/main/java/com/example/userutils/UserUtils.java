package com.example.userutils;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class UserUtils {
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(123, "John Doe", "john@example.com"));
        users.add(new User(456, "Jane Smith", "jane@example.com"));
    }

    public static User getUser(UserQuery query) {
        if (query == null || (query.getId() == null && query.getEmail() == null)) {
            throw new IllegalArgumentException("Must provide either id or email");
        }

        if (query.getId() != null) {
            return users.stream()
                    .filter(u -> u.getId() == query.getId())
                    .findFirst()
                    .orElse(null);
        }

        if (query.getEmail() != null) {
            return users.stream()
                    .filter(u -> query.getEmail().equals(u.getEmail()))
                    .findFirst()
                    .orElse(null);
        }

        return null;
    }

    public static String formatUserName(String firstName, String lastName) {
        return capitalize(firstName) + " " + capitalize(lastName);
    }

    public static int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear - 1; // BUG: Off by one error\!
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
