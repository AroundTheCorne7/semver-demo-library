# MINOR Example: Add email validation feature

✨ **New Feature (MINOR)** - `1.2.3` → `1.3.0`

Added a new `validateEmail()` method to validate email address formats.

**New Method:**
```java
public static boolean validateEmail(String email) {
    if (email == null || email.trim().isEmpty()) {
        return false;
    }
    String emailRegex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
    return email.matches(emailRegex);
}
```

**Usage:**
```java
boolean valid = UserUtils.validateEmail("user@example.com"); // true
boolean invalid = UserUtils.validateEmail("not-an-email"); // false
```

This is a MINOR because it adds new functionality in a backward-compatible manner.

