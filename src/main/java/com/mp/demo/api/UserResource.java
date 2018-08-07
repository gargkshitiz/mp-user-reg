package com.mp.demo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mp.demo.api.util.ApiDocumentation;
import com.mp.demo.exception.ResourceNotFoundException;
import com.mp.demo.model.User;
import com.mp.demo.repo.UserRepository;

import io.swagger.annotations.Api;
/**
 * @author Kshitiz Garg
 */
@RestController
@Api(value = ApiDocumentation.USER)
@RequestMapping(value = ApiDocumentation.API)
public class UserResource {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		// Limit results for demo purpose
		Pageable limit = PageRequest.of(0,10);
		return userRepo.findAll(limit).getContent();
	}

	@GetMapping("/user/{id}")
	public User get(@PathVariable long id) {
		Optional<User> findById = userRepo.findById(id);
		return findById.orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
	}

}