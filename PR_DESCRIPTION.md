# MAJOR Example: Refactor getUser API

💥 **BREAKING CHANGE (MAJOR)** - `1.2.3` → `2.0.0`

Refactored `getUser()` to accept a `UserQuery` object instead of a single userId parameter.

**Before (v1.2.3):**
```java
User user = UserUtils.getUser(123); // OLD API
```

**After (v2.0.0):**
```java
User user = UserUtils.getUser(UserQuery.byId(123)); // NEW API
User user = UserUtils.getUser(UserQuery.byEmail("john@example.com")); // Also works!
```

**Why MAJOR?**
- ❌ **BREAKING CHANGE** - Method signature changed
- ❌ Existing code will not compile
- ⚠️ Users MUST update their code

**Migration:**
```java
// Before
User user = UserUtils.getUser(userId);

// After
import com.example.userutils.UserQuery;
User user = UserUtils.getUser(UserQuery.byId(userId));
```

This is a MAJOR because it makes incompatible API changes.

