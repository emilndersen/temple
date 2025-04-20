package org.team.templeblog.api.model.user;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User model
 * Represents a user entity in the database with essential user properties
 * such as id, username, email, password, and role.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users") // Table name in the database
// The @Table annotation specifies the name of the table in the database
@Cacheable // Enable caching for this entity
// The @Cacheable annotation indicates that this entity can be cached
// to improve performance and reduce database load
public class User {

    // Primary key of the table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Mandatory and unique username
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    // Mandatory and unique email
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    // Mandatory password with protection
    @Column(nullable = false, length = 100)
    @JsonIgnore
    private String password;

    // User role (e.g., ADMIN, USER)
    @Column(nullable = false)
    private String role;

    // Optional field - user first name
    @Column(length = 100)
    private String firstName;

    // Optional field - user last name
    @Column(length = 100)
    private String lastName;

    /**
     * Mask password to prevent exposure in logs or responses.
     * 
     * @return masked password if available
     */
    public String getMaskedPassword() {
        return password != null ? "****" : null;
    }

    /**
     * Overridden equals method to compare users based on id, username, and email.
     * This ensures correct comparison and avoids unnecessary checks.
     * 
     * @param o the object to compare
     * @return true if users are equal based on id, username, and email
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
               Objects.equals(username, user.username) &&
               Objects.equals(email, user.email);
    }

    /**
     * Overridden hashCode method to generate hash code based on id, username, and email.
     * This ensures consistent hashing for collections.
     * 
     * @return a hash code based on id, username, and email
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }

    /**
     * Overridden toString method to return user information excluding password.
     * This ensures sensitive data is not exposed.
     * 
     * @return a string representation of the user object
     */
    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", email='" + email + '\'' +
               ", role='" + role + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", password='[PROTECTED]'" + // Masked password
               '}';
    }
}
