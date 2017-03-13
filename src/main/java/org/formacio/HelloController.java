package org.formacio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(path="/")
	@ResponseBody
	public String saluda() {
		return "Hola";
	}
}
