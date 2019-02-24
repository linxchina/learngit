package sp.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MvcController {
    @RequestMapping("/hello.do")
    public String hello(){
        System.out.print("csac");
        return "hh";
    }
}
