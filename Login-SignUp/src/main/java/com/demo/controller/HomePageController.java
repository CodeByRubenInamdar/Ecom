package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    // Home page with login and sign up buttons
    @GetMapping("/")
    public String showHomePage() {
        return "home";  // Returns the home.html page
    }

    // Redirect to login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Returns the login.html page
    }

    // Redirect to signup page
    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup";  // Returns the signup.html page
    }
}
