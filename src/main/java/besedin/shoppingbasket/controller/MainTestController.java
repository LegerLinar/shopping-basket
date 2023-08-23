package besedin.shoppingbasket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainTestController {
    @GetMapping
    public String welcome() {
        return "WebApp is working";
    }
}
