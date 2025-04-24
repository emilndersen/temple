package org.team.templeblog.api.model.user;

import java.io.Serializable;

import jakarta.persistence.Cacheable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserRegisterRequest model
 * Represents a request for user registration with username, email, password, and confirm password.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserRegisterRequest implements Serializable {

    private String username;

    private String email;

    private String password;

    private String confirmPassword;
}
