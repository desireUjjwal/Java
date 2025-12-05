package com.ujjwal.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //Stereotype Annotation
public class HomeController {
    @RequestMapping("/")   //@GetMapping, @PostMapping, @PutMapping, @DeleteMapping
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }

    // Mapping is done here by dispatcher servlet
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session){

        int result = num + num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }
}
