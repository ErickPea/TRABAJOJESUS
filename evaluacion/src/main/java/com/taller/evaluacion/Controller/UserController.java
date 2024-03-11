package com.taller.evaluacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.evaluacion.Entity.User;
import com.taller.evaluacion.IService.IUserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/user")
public class UserController extends ABaseController<User, IUserService> {

	protected UserController(IUserService service) {
		super(service, "User");
		// TODO Auto-generated constructor stub
	}

}
