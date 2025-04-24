package org.team.templeblog.api.model.user; 

import java.io.Serializable;

import jakarta.persistence.Cacheable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserUpdateInfoRequest model
 * Represents a request to update user information such as email, nickname, and signature.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserUpdateInfoRequest implements Serializable {

    private String email;

    private String nickname;

    private String signature;

}