# Semantic Versioning Demo Repository

This repository demonstrates **Semantic Versioning (SemVer)** through practical examples using a simple JavaScript library.

## 📚 What is Semantic Versioning?

Semantic Versioning uses a three-part version number: `MAJOR.MINOR.PATCH`

- **MAJOR** (X.0.0) - Incompatible API changes (breaking changes)
- **MINOR** (0.X.0) - New functionality, backward-compatible
- **PATCH** (0.0.X) - Bug fixes, backward-compatible

## 🎯 Repository Structure

This repository contains:
- **main branch** - Starting point at version `1.2.3`
- **3 example branches** - Each demonstrating a different type of version bump
- **Pull Request documentation** - Detailed explanations for each change

## 📋 Example Branches

### 1. PATCH Example: `patch/fix-age-calculation`
**Version:** `1.2.3` → `1.2.4`

**What changed:**
- Fixed an off-by-one error in the `calculateAge()` function

**Why PATCH?**
- ✅ Bug fix only
- ✅ No API changes
- ✅ Backward-compatible
- ✅ Existing code continues to work

**View the PR:** See `PR_PATCH.md` in the branch

```bash
git checkout patch/fix-age-calculation
cat PR_PATCH.md
```

---

### 2. MINOR Example: `minor/add-email-validation`
**Version:** `1.2.3` → `1.3.0`

**What changed:**
- Added a new `validateEmail()` function

**Why MINOR?**
- ✅ New feature added
- ✅ Backward-compatible
- ✅ No breaking changes
- ✅ Existing code continues to work
- ✅ Users can adopt the new feature when ready

**View the PR:** See `PR_MINOR.md` in the branch

```bash
git checkout minor/add-email-validation
cat PR_MINOR.md
```

---

### 3. MAJOR Example: `major/refactor-getuser-api`
**Version:** `1.2.3` → `2.0.0`

**What changed:**
- Changed `getUser(userId)` to `getUser(options)`
- Now supports querying by email in addition to ID

**Why MAJOR?**
- ❌ Breaking change
- ❌ Function signature changed
- ❌ Old code will break: `getUser(123)` no longer works
- ⚠️ Users must update their code: `getUser({ id: 123 })`

**View the PR:** See `PR_MAJOR.md` in the branch

```bash
git checkout major/refactor-getuser-api
cat PR_MAJOR.md
```

---

## 🔍 How to Explore This Repository

### View All Branches
```bash
cd semver-demo-library
git branch -a
```

### Compare Changes

**PATCH changes:**
```bash
git diff main..patch/fix-age-calculation
```

**MINOR changes:**
```bash
git diff main..minor/add-email-validation
```

**MAJOR changes:**
```bash
git diff main..major/refactor-getuser-api
```

### View Commit History
```bash
git log --oneline --all --graph
```

---

## 📊 Quick Reference Table

| Branch | Version Change | Type | Breaking? | Description |
|--------|---------------|------|-----------|-------------|
| `patch/fix-age-calculation` | 1.2.3 → 1.2.4 | PATCH | ❌ No | Bug fix in calculateAge() |
| `minor/add-email-validation` | 1.2.3 → 1.3.0 | MINOR | ❌ No | New validateEmail() function |
| `major/refactor-getuser-api` | 1.2.3 → 2.0.0 | MAJOR | ✅ Yes | Changed getUser() signature |

---

## 🎓 Learning Exercises

### Exercise 1: Identify the Version Bump
For each scenario, determine if it should be PATCH, MINOR, or MAJOR:

1. You fix a typo in an error message
2. You add a new optional parameter to a function
3. You remove a deprecated function
4. You improve performance without changing the API
5. You rename a public class

<details>
<summary>Answers</summary>

1. **PATCH** - Bug fix, no API change
2. **MINOR** - New functionality, backward-compatible
3. **MAJOR** - Breaking change (code using that function will break)
4. **PATCH** - Internal improvement, no API change
5. **MAJOR** - Breaking change (code referencing the old name will break)
</details>

### Exercise 2: Review the PRs
1. Check out each branch
2. Read the PR documentation
3. Review the code changes
4. Understand why each version bump was chosen

### Exercise 3: Create Your Own Example
Try creating a new branch with:
- A PATCH change (fix a bug)
- A MINOR change (add a feature)
- A MAJOR change (break something)

---

## 🚀 Simulating a Real Workflow

### Scenario: You're maintaining this library

**Week 1:** A user reports the age calculation bug
```bash
git checkout -b patch/fix-age-calculation
# Fix the bug
# Bump version to 1.2.4
git commit -m "Fix: age calculation bug"
```

**Week 2:** You want to add email validation
```bash
git checkout main
git checkout -b minor/add-email-validation
# Add new feature
# Bump version to 1.3.0
git commit -m "Feature: email validation"
```

**Week 3:** You decide to refactor the API
```bash
git checkout main
git checkout -b major/refactor-getuser-api
# Make breaking changes
# Bump version to 2.0.0
git commit -m "BREAKING: refactor getUser API"
```

---

## 📖 Key Takeaways

1. **PATCH (0.0.X)** - Bug fixes, no API changes
   - Safe to update automatically
   - No code changes needed

2. **MINOR (0.X.0)** - New features, backward-compatible
   - Safe to update
   - New features available but optional

3. **MAJOR (X.0.0)** - Breaking changes
   - Review before updating
   - Code changes may be required
   - Check migration guide

---

## 🔗 Additional Resources

- [Semantic Versioning Specification](https://semver.org)
- [Keep a Changelog](https://keepachangelog.com)
- [Conventional Commits](https://www.conventionalcommits.org)

---

## 💡 Best Practices

1. **Always document breaking changes** in CHANGELOG.md
2. **Provide migration guides** for MAJOR versions
3. **Use clear commit messages** indicating the type of change
4. **Test thoroughly** before releasing
5. **Communicate** version changes to users
6. **Never modify** a released version

---

## 🎯 Next Steps

1. Explore each branch and read the PR documentation
2. Compare the code changes between versions
3. Try the exercises above
4. Apply SemVer to your own projects!

---

**Happy versioning! 🎉**

