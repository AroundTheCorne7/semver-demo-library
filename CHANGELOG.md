# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [2.0.0] - 2024-03-01

### Changed
- **BREAKING:** `getUser(int userId)` now accepts a `UserQuery` object
- Added support for querying by email

### Migration Guide
```java
// Old (v1.x.x)
User user = UserUtils.getUser(123);

// New (v2.0.0)
User user = UserUtils.getUser(UserQuery.byId(123));
// OR
User user = UserUtils.getUser(UserQuery.byEmail("john@example.com"));
```

## [1.2.3] - 2024-01-15

### Added
- Initial release with core functionality
- `getUser()` function to retrieve users by ID
- `formatUserName()` function to format names
- `calculateAge()` function to calculate age from birth year

### Known Issues
- `calculateAge()` has an off-by-one error

