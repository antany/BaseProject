package baseproject.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Inside Welcome Controller";
    }
}
