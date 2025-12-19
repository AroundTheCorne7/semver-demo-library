/**
 * User Utils Library
 * Version: 1.2.3
 */

/**
 * Get user by ID
 * @param {number} userId - The user's ID
 * @returns {Object} User object
 */
function getUser(userId) {
  // Simulated user database
  const users = {
    123: { id: 123, name: 'John Doe', email: 'john@example.com' },
    456: { id: 456, name: 'Jane Smith', email: 'jane@example.com' }
  };
  
  return users[userId] || null;
}

/**
 * Format user name to title case
 * @param {string} firstName - User's first name
 * @param {string} lastName - User's last name
 * @returns {string} Formatted name
 */
function formatUserName(firstName, lastName) {
  const capitalize = (str) => str.charAt(0).toUpperCase() + str.slice(1).toLowerCase();
  return `${capitalize(firstName)} ${capitalize(lastName)}`;
}

/**
 * Calculate age from birth year
 * @param {number} birthYear - Year of birth
 * @returns {number} Age in years
 */
function calculateAge(birthYear) {
  const currentYear = new Date().getFullYear();
  return currentYear - birthYear - 1; // BUG: Off by one error!
}

module.exports = {
  getUser,
  formatUserName,
  calculateAge
};

