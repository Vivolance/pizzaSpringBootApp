package ssf.mock.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller (Returning both JSON data as well as HTML renders)
// RestController (Return JSON Data)
@Controller
public class PizzaController {

    // GET http://localhost:8080/helloworld
    // @GetMapping("/helloworld")
    // public String helloWorld() {
    //     return "Hello World";
    // }
    
    @GetMapping("/")
    public String mainPage() {
        return "index";
    }
    
}
