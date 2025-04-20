package org.team.templeblog.api.model.UserAdminPageRequest;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * UserAdminPageRequest model
 * Represents a request for user admin page with filters for nickname, email, role, and state.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserAdminPageRequest implements Serializable {

    private String nickname;

    private String email;

    private String role;

    private String state;

}