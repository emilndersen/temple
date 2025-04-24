package org.team.templeblog.api.model.user; 
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Cacheable;

/**
 * UserTokenLogoutRequest model
 * Represents a request for user logout with a token.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserTokenLogoutRequest extends UserBaseLoginRequest {

    private String token;

}