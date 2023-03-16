package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1-Passo
@RestController
@RequestMapping("/hello")

public class HelloController {

    @GetMapping
    public String oláMundo() {
        return "Hello World";


    }
}
