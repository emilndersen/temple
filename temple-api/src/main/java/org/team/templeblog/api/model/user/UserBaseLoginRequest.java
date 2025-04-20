package org.team.templeblog.api.model.user ;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserBaseLoginRequest model
 * Represents a request for user login with user agent and IP address.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserBaseLoginRequest implements Serializable {

    private String ua;

    private String ip;

}