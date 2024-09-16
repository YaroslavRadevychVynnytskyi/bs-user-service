package com.application.bsuserservice.controller;

import com.application.bsuserservice.dto.UserRegistrationRequestDto;
import com.application.bsuserservice.dto.UserResponseDto;
import com.application.bsuserservice.service.UserService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserResponseDto> save(@RequestBody UserRegistrationRequestDto requestDto) {
        return ResponseEntity.ok(userService.save(requestDto));
    }

    @PostMapping("/get-by-username")
    public ResponseEntity<Optional<UserResponseDto>> getByUsername(@RequestBody UserRegistrationRequestDto requestDto) {
        return ResponseEntity.ok(userService.findByUsername(requestDto.email()));
    }

    @GetMapping("/secured")
    public ResponseEntity<String> secured() {
        return ResponseEntity.ok("Hello from secured!");
    }
}
