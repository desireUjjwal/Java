package com.ujjwal.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //Stereotype Annotation
public class HomeController {
    @RequestMapping("/")   //@GetMapping, @PostMapping, @PutMapping, @DeleteMapping
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }
}
