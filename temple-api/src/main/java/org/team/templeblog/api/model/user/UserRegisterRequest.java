package org.team.templeblog.api.model.user;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequest implements Serializable {

    private String username;

    private String email;

    private String password;

    private String confirmPassword;
}
