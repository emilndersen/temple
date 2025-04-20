package org.team.templeblog.api.model.user;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserUpdateRoleRequest model
 * Represents a request to update user role.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserUpdateRoleRequest implements Serializable {

    private Long userId;

    private String role;

}