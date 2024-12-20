package example.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MyController {
	@GetMapping("/")
	fun home1(model: Model): String {
		val title = "example"
		var names = arrayOf<String>("Hi", "Bye")

		model.addAttribute("title", title)
		model.addAttribute("list", names)

		return "index"
	}
}