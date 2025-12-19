# 🎓 Semantic Versioning Demo Repository

A hands-on demonstration of **Semantic Versioning (SemVer)** through practical examples.

## 🌟 Overview

This repository contains a simple JavaScript library with three branches, each demonstrating a different type of semantic version change:

- 🐛 **PATCH** - Bug fixes (1.2.3 → 1.2.4)
- ✨ **MINOR** - New features (1.2.3 → 1.3.0)
- 💥 **MAJOR** - Breaking changes (1.2.3 → 2.0.0)

## 🚀 Quick Start

### Clone and Explore

```bash
# Navigate to the repository
cd semver-demo-library

# View all branches
git branch -a

# Explore each example
git checkout patch/fix-age-calculation    # PATCH example
git checkout minor/add-email-validation   # MINOR example
git checkout major/refactor-getuser-api   # MAJOR example
```

### Read the Documentation

Each branch contains a detailed PR document explaining the changes:

```bash
# PATCH example
git checkout patch/fix-age-calculation
cat PR_PATCH.md

# MINOR example
git checkout minor/add-email-validation
cat PR_MINOR.md

# MAJOR example
git checkout major/refactor-getuser-api
cat PR_MAJOR.md
```

## 📚 What You'll Learn

### 1. PATCH Version (Bug Fixes)
- When to increment the PATCH version
- How to fix bugs without breaking existing code
- Example: Fixing an off-by-one error

### 2. MINOR Version (New Features)
- When to increment the MINOR version
- How to add features while maintaining backward compatibility
- Example: Adding a new `validateEmail()` function

### 3. MAJOR Version (Breaking Changes)
- When to increment the MAJOR version
- How to identify breaking changes
- How to provide migration guides
- Example: Changing a function signature

## 📂 Repository Structure

```
semver-demo-library/
├── src/
│   └── index.js              # Main library code
├── package.json              # Version number
├── CHANGELOG.md              # Version history
├── README.md                 # Library documentation
├── SEMVER_GUIDE.md          # Comprehensive SemVer guide
├── REPO_README.md           # This file
├── PR_PATCH.md              # PATCH example PR (in branch)
├── PR_MINOR.md              # MINOR example PR (in branch)
└── PR_MAJOR.md              # MAJOR example PR (in branch)
```

## 🎯 Branches

| Branch | Version | Type | Description |
|--------|---------|------|-------------|
| `main` | 1.2.3 | - | Starting point |
| `patch/fix-age-calculation` | 1.2.4 | PATCH | Bug fix example |
| `minor/add-email-validation` | 1.3.0 | MINOR | New feature example |
| `major/refactor-getuser-api` | 2.0.0 | MAJOR | Breaking change example |

## 🔍 Comparing Changes

### View Differences

```bash
# Compare PATCH changes
git diff main..patch/fix-age-calculation

# Compare MINOR changes
git diff main..minor/add-email-validation

# Compare MAJOR changes
git diff main..major/refactor-getuser-api
```

### View Commit History

```bash
git log --oneline --all --graph --decorate
```

## 📖 Detailed Guide

For a comprehensive guide on Semantic Versioning with exercises and examples, see:

```bash
cat SEMVER_GUIDE.md
```

## 🎓 Learning Path

1. **Start Here:** Read `SEMVER_GUIDE.md`
2. **Explore PATCH:** Check out `patch/fix-age-calculation` and read `PR_PATCH.md`
3. **Explore MINOR:** Check out `minor/add-email-validation` and read `PR_MINOR.md`
4. **Explore MAJOR:** Check out `major/refactor-getuser-api` and read `PR_MAJOR.md`
5. **Compare:** Use `git diff` to see the actual changes
6. **Practice:** Try the exercises in `SEMVER_GUIDE.md`

## 💡 Key Concepts

### PATCH (0.0.X)
```
1.2.3 → 1.2.4
```
- Bug fixes only
- No API changes
- Backward-compatible
- Safe to auto-update

### MINOR (0.X.0)
```
1.2.3 → 1.3.0
```
- New features
- Backward-compatible
- No breaking changes
- Safe to update

### MAJOR (X.0.0)
```
1.2.3 → 2.0.0
```
- Breaking changes
- API changes
- May require code updates
- Review before updating

## 🛠️ Practical Examples

### PATCH Example: Bug Fix
```javascript
// Before (v1.2.3) - Bug
function calculateAge(birthYear) {
  return new Date().getFullYear() - birthYear - 1; // Wrong!
}

// After (v1.2.4) - Fixed
function calculateAge(birthYear) {
  return new Date().getFullYear() - birthYear; // Correct!
}
```

### MINOR Example: New Feature
```javascript
// v1.3.0 - New function added
function validateEmail(email) {
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return emailRegex.test(email);
}

// Old code still works!
const user = getUser(123);
```

### MAJOR Example: Breaking Change
```javascript
// Before (v1.2.3)
const user = getUser(123);

// After (v2.0.0) - BREAKS old code!
const user = getUser({ id: 123 });
```

## 📊 Decision Tree

```
Is it a bug fix?
├─ Yes → PATCH (0.0.X)
└─ No
   └─ Is it a new feature?
      ├─ Yes
      │  └─ Does it break existing code?
      │     ├─ No → MINOR (0.X.0)
      │     └─ Yes → MAJOR (X.0.0)
      └─ No
         └─ Does it change the API?
            ├─ No → PATCH (0.0.X)
            └─ Yes → MAJOR (X.0.0)
```

## 🎯 Best Practices Demonstrated

1. ✅ Clear commit messages
2. ✅ Updated CHANGELOG.md for each version
3. ✅ Updated package.json version numbers
4. ✅ Documentation of breaking changes
5. ✅ Migration guides for MAJOR versions
6. ✅ Detailed PR descriptions

## 🔗 Resources

- [Semantic Versioning Spec](https://semver.org)
- [Keep a Changelog](https://keepachangelog.com)
- [Conventional Commits](https://www.conventionalcommits.org)

## 📝 License

MIT - This is a demo repository for educational purposes.

## 🤝 Contributing

This is a demo repository. Feel free to fork and create your own examples!

---

**Ready to master Semantic Versioning?** Start with `SEMVER_GUIDE.md`! 🚀

