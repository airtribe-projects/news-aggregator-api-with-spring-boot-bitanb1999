package com.example.News.Aggregator.API.Controller;

import com.example.News.Aggregator.API.Controller.Repository.UserRepository;
import com.example.News.Aggregator.API.Entities.User;
import com.example.News.Aggregator.API.Entities.UserDTO;
import com.example.News.Aggregator.API.Utils.JwtUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preferences")
public class PreferencesController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<String>> getPreferences(@AuthenticationPrincipal UserDetails userDetails) {
        User user = userRepository.findByUsername(userDetails.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return ResponseEntity.ok(user.getPreferences());
    }

    @PutMapping
    public ResponseEntity<String> updatePreferences(@AuthenticationPrincipal UserDetails userDetails,
                                                    @RequestBody List<String> preferences) {
        User user = userRepository.findByUsername(userDetails.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        user.setPreferences(preferences);
        userRepository.save(user);
        return ResponseEntity.ok("Preferences updated successfully!");
    }
}

