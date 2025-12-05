package com.ujjwal.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller //Stereotype Annotation
public class HomeController {
    @RequestMapping("/")   //@GetMapping, @PostMapping, @PutMapping, @DeleteMapping
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

    // Mapping is done here by dispatcher servlet
    // Spring file also has view resolver which provide the extension
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){

        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }
}
