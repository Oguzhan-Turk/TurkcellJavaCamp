package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import static db.OnMemoryDatabase.USERS;

public class UserSqlImpl implements UserDao {

	@Override
	public void add(User user) {
		USERS.add(user);

	}

	@Override
	public void update(User user) {
		for (int i = 0; i < USERS.size(); i++) {
			if (USERS.get(i).getId() == user.getId()) {
				USERS.set(i, user);
			}
		}

	}

	@Override
	public void delete(User user) {
		USERS.remove(user);
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>(USERS);

		return users;
	}

}
