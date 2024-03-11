package com.taller.evaluacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.evaluacion.Entity.Role;
import com.taller.evaluacion.IService.IRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/role")
public class RoleController extends ABaseController<Role, IRoleService> {

	protected RoleController(IRoleService service) {
		super(service, "Role");
		// TODO Auto-generated constructor stub
	}

}
