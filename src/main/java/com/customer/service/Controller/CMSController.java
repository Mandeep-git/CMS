package com.customer.service.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CMSController {


    @GetMapping("/loginUser")
    public void loginUser(){

        System.out.println("test");
    }

    @PostMapping("/registerUser")
    public void registerUser(){


    }
    @PutMapping("/updateProfile")
    public void updateProfile(){


    }


}
