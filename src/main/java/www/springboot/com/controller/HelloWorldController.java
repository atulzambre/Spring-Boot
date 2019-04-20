package www.springboot.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String getHelloWorld() {
		return "First attempt to create git repo, docker image, jenkins config and deploy on openshift :)";
	}
}
