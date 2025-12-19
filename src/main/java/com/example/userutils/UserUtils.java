package com.example.userutils;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class UserUtils {
    private static final Map<Integer, User> users = new HashMap<>();
    
    static {
        users.put(123, new User(123, "John Doe", "john@example.com"));
        users.put(456, new User(456, "Jane Smith", "jane@example.com"));
    }

    public static User getUser(int userId) {
        return users.get(userId);
    }

    public static String formatUserName(String firstName, String lastName) {
        return capitalize(firstName) + " " + capitalize(lastName);
    }

    public static int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear; // Fixed: Removed off-by-one error
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
