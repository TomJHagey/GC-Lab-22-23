package co.grandcirus.cofffeeshop.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcirus.cofffeeshop.Items;

@Repository
public class ItemDao {

	private JdbcTemplate jdbc;

	public List<Items> getAll() {

		String sql = "SELECT * FROM items";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Items.class));

	}
}