package org.team.templeblog.api.model.user;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserUpdatePwdRequest model
 * Represents a request to update user password.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdatePwdRequest implements Serializable {

    private String oldPassword;

    private String newPassword;

}