package org.team.templeblog.api.model;

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
 */
// This model represents a user entity in the database
// It contains fields such as id, username, email, password and role
// These fields have annotations that indicate their properties in the database

@Entity
@Data
// Constructor with parameters removed, as @AllArgsConstructor already generates it
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    // Primary key of the table
    @Id
    // Auto incremental ID value
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    // username is mandatory and unique
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    // email is mandatory and unique
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    // password is mandatory
    @Column(nullable = false, length = 100)
    @JsonIgnore
    private String password;

    public String getMaskedPassword() {
        return password != null ? "****" : null;
    }

    // User role (for example, ADMIN, USER)
    @Column(nullable = false)
    private String role;

        // Override equals - compare users by id, username and email
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return Objects.equals(id, user.id) &&
                   Objects.equals(username, user.username) &&
                   Objects.equals(email, user.email);
        }
        // Override hashCode - generate hash code based on id, username and email
        @Override
        public int hashCode() {
            return Objects.hash(id, username, email);
        }
        // Override toString - output user information
        @Override
        public String toString() {
            return "User{" +
                   "id=" + id +
                   ", username='" + username + '\'' +
                   ", email='" + email + '\'' +
                   ", role='" + role + '\'' +
                   ", password='[PROTECTED]'" + // Include password in a protected form
                   '}';
        }
}
