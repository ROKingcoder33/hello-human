package dev.kingralph.hello_human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	
	@RequestMapping("/")
	public String greeting(@RequestParam(required=false) String fname, @RequestParam(required=false) String lname) {
		String message = null;
		if(fname == null && lname == null) {
			message ="Hello Human!";
		}
		else if(fname == null) {
			message = "Hello " + lname;
		}
		else if(lname == null) {
			message = "Hello " + fname;
		}
		else {
			message = "Hello " + fname + " " + lname;
		}
		return message;
	}
}
