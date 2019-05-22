package com.stuffyDispenser.db;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stuffyDispenser.logic.Stuffy;

@Controller
@RequestMapping("/stuffies")
public class StuffyController {
	
	@Autowired
	private StuffyRepository stuffyRepository;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Stuffy> getAllStuffies(){
		System.out.println("called");
		return stuffyRepository.findAll();
	}
	
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<Stuffy> getStuffy(@PathVariable int id){
		Optional<Stuffy> stuffy = stuffyRepository.findById(id);
		if (stuffy.isPresent()) {
			System.out.println("user found");
		}
		else {
			System.out.println("no user for id" + id);
		}
		return stuffyRepository.findById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody String addUser(@RequestBody Stuffy stuffy) {
		stuffyRepository.save(stuffy);
		return "User saved";
	}

	@GetMapping("/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		userRepository.save(u);
		return "User saved";
	}

	@DeleteMapping("/")
	public @ResponseBody String deleteUser(@RequestBody Stuffy stuffy) {
		stuffyRepository.delete(stuffy);
		return "User deleted";
	}
	
	@PutMapping("/")
	public @ResponseBody String updateUser(@RequestBody Stuffy stuffy) {
		stuffyRepository.save(stuffy);
		return "User updated";
	}

}


