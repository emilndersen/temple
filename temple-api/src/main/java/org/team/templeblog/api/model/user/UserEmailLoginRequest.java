package org.team.templeblog.api.model.user;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// Removed unnecessary import as UserBaseLoginRequest is in the same package

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEmailLoginRequest extends UserBaseLoginRequest implements Serializable  {

    private String email;

    private String password;

}