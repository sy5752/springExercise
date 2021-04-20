package hello;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@RequestMapping("hello")
@Controller
public class HelloController {

	@RequestMapping(path="hello", method=RequestMethod.GET)
	public String hello() {
		return "hello";
	}
}
