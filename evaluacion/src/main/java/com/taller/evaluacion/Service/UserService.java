package com.taller.evaluacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller.evaluacion.Entity.User;
import com.taller.evaluacion.IRepository.IBaseRepository;
import com.taller.evaluacion.IRepository.IUserRepository;
import com.taller.evaluacion.IService.IUserService;

@Service
public class UserService extends ABaseService<User> implements IUserService {

	@Autowired
	private IUserRepository repository;

	@Override
	protected IBaseRepository<User, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
