# PATCH Example: Fix age calculation bug

🐛 **Bug Fix (PATCH)** - `1.2.3` → `1.2.4`

Fixed an off-by-one error in the `calculateAge()` method.

**Before:**
```java
return currentYear - birthYear - 1; // BUG!
```

**After:**
```java
return currentYear - birthYear; // Fixed!
```

This is a PATCH because it's a backward-compatible bug fix with no API changes.

