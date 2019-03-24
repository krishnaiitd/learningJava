package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/") 
	public String index() {
		return "Greeting from spring boot";
	}
	
	@TimeTracker
	@RequestMapping(path="/name/{name}")
	public String nullChecker(@PathVariable("name") @NullCheck String name) {
		System.out.println(name);
		return "After null checker";
	}

}
