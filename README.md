# User Utils Library

A simple Java library for user management utilities.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>user-utils-library</artifactId>
    <version>1.2.3</version>
</dependency>
```

## Usage

```java
import com.example.userutils.UserUtils;
import com.example.userutils.User;

// Get user by ID
User user = UserUtils.getUser(123);

// Format user name
String formatted = UserUtils.formatUserName("john", "doe");

// Calculate age from birth year
int age = UserUtils.calculateAge(1990);

// Validate email address
boolean isValid = UserUtils.validateEmail("user@example.com");
```

## API

### `UserUtils.getUser(int userId)`
Retrieves a user object by ID.

**Parameters:**
- `userId` (int): The user's ID

**Returns:** User object or null

### `UserUtils.formatUserName(String firstName, String lastName)`
Formats a user's name to title case.

**Parameters:**
- `firstName` (String): User's first name
- `lastName` (String): User's last name

**Returns:** Formatted name string

### `UserUtils.calculateAge(int birthYear)`
Calculates age based on birth year.

**Parameters:**
- `birthYear` (int): Year of birth

**Returns:** Age in years

### `UserUtils.validateEmail(String email)`
Validates an email address format.

**Parameters:**
- `email` (String): Email address to validate

**Returns:** boolean indicating if email is valid

## Version History

See [CHANGELOG.md](CHANGELOG.md) for details.

## License

MIT

