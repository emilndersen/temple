package org.team.templeblog.api.model.user;

import java.io.Serializable;

import jakarta.persistence.Cacheable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User operation log page request model
 * Represents the request parameters for paginating user operation logs.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
public class UserOptLogPageRequest implements Serializable {

    private String type;

    private Long operatorId;
}