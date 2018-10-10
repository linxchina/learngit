package sp.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MvcControler {
    @RequestMapping("/hello.do")
    public String hello()
    {
        System.out.print("OK");
        return "hh";
    }
}
