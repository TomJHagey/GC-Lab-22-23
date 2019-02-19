package co.grandcirus.cofffeeshop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcirus.cofffeeshop.Users;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbc;

	public void create(Users users) {

		String sql = "INSERT INTO users (id, firstName, lastName, email, phoneNumber, password) VALUES (?, ?, ?, ?, ?, ?)";
		jdbc.update(sql, users.getId(), users.getFirstName(), users.getLastName(), users.getEmail(), users.getPhoneNumber(),
				users.getPassword());

	}
}
