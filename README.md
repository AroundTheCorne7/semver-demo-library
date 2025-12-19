# User Utils Library

A simple JavaScript library for user management utilities.

## Installation

```bash
npm install user-utils-library
```

## Usage

```javascript
const { getUser, formatUserName, calculateAge } = require('user-utils-library');

// Get user by ID
const user = getUser(123);

// Format user name
const formatted = formatUserName('john', 'doe');

// Calculate age from birth year
const age = calculateAge(1990);
```

## API

### `getUser(userId)`
Retrieves a user object by ID.

**Parameters:**
- `userId` (number): The user's ID

**Returns:** User object

### `formatUserName(firstName, lastName)`
Formats a user's name to title case.

**Parameters:**
- `firstName` (string): User's first name
- `lastName` (string): User's last name

**Returns:** Formatted name string

### `calculateAge(birthYear)`
Calculates age based on birth year.

**Parameters:**
- `birthYear` (number): Year of birth

**Returns:** Age in years

## Version History

See [CHANGELOG.md](CHANGELOG.md) for details.

## License

MIT

