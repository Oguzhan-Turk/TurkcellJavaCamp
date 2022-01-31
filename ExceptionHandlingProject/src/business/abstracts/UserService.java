package business.abstracts;

import java.util.List;

import entities.concretes.User;
import exception.BusinessException;

public interface UserService {

	void add(User user) throws BusinessException;

	void update(User user) throws BusinessException;

	void delete(User user);

	List<User> findAll();

}
