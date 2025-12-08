package com.ujjwal.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
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
    public String add(HttpServletRequest req){

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        return "result.jsp";
    }
}
