package org.team.templeblog.api.model.user;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.Cacheable;
import lombok.NoArgsConstructor;
// Removed unnecessary import as UserBaseLoginRequest is in the same package

/**
 * UserEmailLoginRequest model
 * Represents a request for user login using email and password.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserEmailLoginRequest extends UserBaseLoginRequest implements Serializable  {

    private String email;

    private String password;

}