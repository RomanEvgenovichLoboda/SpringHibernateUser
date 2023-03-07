package com.example.demo;

import Controllers.MyController;
import Controllers.UserController;
import Models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		SpringApplication.run(MyController.class, args);
	}
//	public static UserController userController=new UserController();
//	@GetMapping("/getAll")
//	public ArrayList<User>getAll(){
//		return userController.getList();
//	}
//	@PostMapping("/add")
//	public void add(User user){
//		userController.addUser(user);
//	}
//	@DeleteMapping("/dellete")
//	public void dellete(String log){
//		userController.remuveUser(log);
//	}
//	@GetMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}
//	@PostMapping("/goodbay")
//	public String goodbay(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("GoodBay %s!", name);
//	}

}
