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
import com.example.userutils.UserQuery;

// Get user by ID
User user = UserUtils.getUser(UserQuery.byId(123));

// Get user by email
User userByEmail = UserUtils.getUser(UserQuery.byEmail("john@example.com"));

// Format user name
String formatted = UserUtils.formatUserName("john", "doe");

// Calculate age from birth year
int age = UserUtils.calculateAge(1990);
```

## API

### `UserUtils.getUser(UserQuery query)`
Retrieves a user object by ID or email.

**Parameters:**
- `query` (UserQuery): Query options
  - Use `UserQuery.byId(int)` to query by ID
  - Use `UserQuery.byEmail(String)` to query by email

**Returns:** User object or null

**Throws:** IllegalArgumentException if neither id nor email provided

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

## Version History

See [CHANGELOG.md](CHANGELOG.md) for details.

## License

MIT

