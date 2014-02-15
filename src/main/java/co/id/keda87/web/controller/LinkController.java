package co.id.keda87.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {
    
    @RequestMapping(value = "/belajar/hello")
    public String helloWorldPage() {
        return "hello";
    }

}
