package com.taller.evaluacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller.evaluacion.Entity.Role;
import com.taller.evaluacion.IRepository.IBaseRepository;
import com.taller.evaluacion.IRepository.IRoleRepository;
import com.taller.evaluacion.IService.IRoleService;

@Service
public class RoleService extends ABaseService<Role> implements IRoleService {

	@Autowired
	private IRoleRepository repository;

	@Override
	protected IBaseRepository<Role, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
