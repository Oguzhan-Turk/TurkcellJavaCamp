package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.UserSqlImpl;
import entities.concretes.User;
import exception.BusinessException;

public class UserManager implements UserService {

	UserDao userDao = new UserSqlImpl();

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) throws BusinessException {
		if (isExistsEmail(user.geteMail()) && isValidEmail(user.geteMail()) && isValidPassword(user.getPassword())
				&& checkName(user.getFirstName()) && checkName(user.getLastName())) {
			userDao.add(user);
			System.out.println(user.getFirstName() + " " + user.getLastName() + " added");
		}
	}

	@Override
	public void update(User user) throws BusinessException {
		if (isExistsEmail(user.geteMail()) && isValidEmail(user.geteMail()) && isValidPassword(user.getPassword())
				&& checkName(user.getFirstName()) && checkName(user.getLastName())) {
			userDao.update(user);
			System.out.println("User with Id: " + user.getId() + " is updated");
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted");
	}

	@Override
	public List<User> findAll() {
		List<User> users = userDao.findAll();
		return users;
	}

	private boolean isValidPassword(String password) throws BusinessException {
		if (password.length() < 6) {
			throw new BusinessException("Password must be at least 6 digits!");
		}
		return true;
	}

	private boolean isValidEmail(String email) throws BusinessException {
		if (email.indexOf('@') == -1) {
			throw new BusinessException("Email must contain '@' symbol!");
		}
		return true;
	}

	private boolean isExistsEmail(String email) throws BusinessException {
		for (int i = 0; i < findAll().size(); i++) {
			if (email.equals(findAll().get(i).geteMail())) {
				throw new BusinessException("Email exists!");
			}
		}
		return true;
	}

	private boolean checkName(String name) throws BusinessException {
		if (name.length() < 2) {
			throw new BusinessException("Name must contain at least 2 characters!");
		}
		return true;
	}

}
