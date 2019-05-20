package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	public void greeting(@RequestParam(name ="name", required = false,
										defaultValue = "world") String name, Model model) {
		model.addAttribute("name", name);
	}
}
