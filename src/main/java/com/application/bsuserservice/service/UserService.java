package com.application.bsuserservice.service;

import com.application.bsuserservice.dto.UserRegistrationRequestDto;
import com.application.bsuserservice.dto.UserResponseDto;
import java.util.Optional;

public interface UserService {
    UserResponseDto save(UserRegistrationRequestDto requestDto);

    Optional<UserResponseDto> findByUsername(String username);
}
