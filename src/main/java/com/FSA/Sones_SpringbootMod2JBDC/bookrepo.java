package com.FSA.Sones_SpringbootMod2JBDC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.FSA.Sones_SpringbootMod2JBDC.models.book;

@Repository
public class bookrepo {
    
    @Autowired
	JdbcTemplate jdbcTemplate;

    public book findById(long id) {
		return jdbcTemplate.queryForObject("select * from book where id=?", new BeanPropertyRowMapper<>(book.class), id);
	}

    static class bookRowMapper implements RowMapper<book> {
        @Override
        public book mapRow(ResultSet rs, int rowNum) throws SQLException {
            book Book = new book();
            Book.setId(rs.getLong("id"));
            Book.setTitle(rs.getString("title"));
            Book.setAuthor(rs.getString("author"));
            return Book;
        }

    }

	public List<book> findAll() {
		return jdbcTemplate.query("select * from book", new bookRowMapper());
	}
}

