package org.team.templeblog.api.model.UserAdminPageRequest;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAdminPageRequest implements Serializable {

    private String nickname;

    private String email;

    private String role;

    private String state;

}