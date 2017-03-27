package com.ningxia.wine.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.ningxia.wine.dao.UserDao;
import com.ningxia.wine.entity.TUser;
import com.ningxia.wine.exception.DataBaseException;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public TUser findUsername(String username) throws DataBaseException {
		List<TUser> users=null;
		try {
			String sql = "select * from t_user where username=?";
			Object[] params = { username };
			users = jdbcTemplate.query(sql, params, new RowMapper<TUser>() {
				// rs是每行记录，index是行号
				public TUser mapRow(ResultSet rs, int index) throws SQLException {
					TUser user = new TUser();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setGscode(rs.getString("gscode"));
					user.setGsname(rs.getString("gsname"));
					user.setRoleId(rs.getInt("role_id"));
					user.setRoleName(rs.getString("role_name"));
					user.setBz(rs.getString("bz"));
					return user;
				}

			});
		} catch (Exception e) {
			throw new DataBaseException(e.getMessage());
		}
		return CollectionUtils.isEmpty(users)?null:users.get(0);
	}
	
	public List<String> findAllGsname() throws DataBaseException{
		List<String> gsnames=null;
		try {
			String sql = "select gsname from t_user where gsname is not null group by gsname";
			gsnames = jdbcTemplate.query(sql, new Object[]{}, new RowMapper<String>() {
				// rs是每行记录，index是行号
				public String mapRow(ResultSet rs, int index) throws SQLException {
					return rs.getString("gsname");
				}
			});
		} catch (Exception e) {
			throw new DataBaseException(e.getMessage());
		}
		return gsnames;
	}
}
