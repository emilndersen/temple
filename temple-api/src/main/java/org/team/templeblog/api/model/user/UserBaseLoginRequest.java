package org.team.templeblog.api.model.user ;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBaseLoginRequest implements Serializable {

    private String ua;

    private String ip;

}