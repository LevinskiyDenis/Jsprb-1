package ru.netology.jsprb1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jsprb1.SystemProfile;

@RestController
@RequestMapping("/")

public class ProfileController {

    public SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public SystemProfile getProfile() {
        return profile;
    }
}
