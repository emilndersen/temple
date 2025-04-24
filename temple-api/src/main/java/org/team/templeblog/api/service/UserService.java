package org.team.templeblog.api.service;

import org.team.templeblog.dto.api.UserDTO; // Updated to the correct package for UserDTO
import org.team.templeblog.dto.api.LoginDTO; // Updated to the correct package for LoginDTO

public interface UserService {
    UserDTO register(UserDTO dto);
    String login(LoginDTO dto);
    UserDTO getById(Long id);
    UserDTO update(Long id, UserDTO dto);
    void delete(Long id);
}
