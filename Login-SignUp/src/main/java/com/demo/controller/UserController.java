//package com.demo.controller;
//
//import com.demo.entity.User;
//import com.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class UserController {
//
//    @GetMapping("/")
//    public String home() {
//        return "index"; // Home page with login and signup buttons
//    }
//
//    @GetMapping("/signup")
//    public String showSignupForm(Model model) {
//        model.addAttribute("user", new User());
//        return "signup"; // Signup page
//    }
//
//    @PostMapping("/signup")
//    public String signup(@Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "signup"; // Stay on the signup page if there are validation errors
//        }
//        // Simulate saving user data (you can save it in a database)
//        model.addAttribute("message", "Signup successful");
//        return "login"; // Redirect to login page after successful signup
//    }
//
//    @GetMapping("/login")
//    public String showLoginForm() {
//        return "login"; // Login page
//    }
//
//    @PostMapping("/login")
//    public String login(User user, Model model) {
//        // Simulate checking credentials (you can implement actual authentication here)
//        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
//            return "home"; // Redirect to home page after successful login
//        }
//        model.addAttribute("error", "Invalid credentials");
//        return "login"; // Stay on the login page if credentials are invalid
//    }
//}
