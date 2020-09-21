package chocolate.breakfast.VGQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class VgqController {

    @GetMapping("/")
    public String getHome() {
        return "homepage.html";
    }
}
