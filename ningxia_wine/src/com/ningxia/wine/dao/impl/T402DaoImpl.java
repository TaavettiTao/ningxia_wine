package com.ningxia.wine.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.ningxia.wine.dao.T402Dao;
import com.ningxia.wine.entity.T402;
import com.ningxia.wine.exception.DataBaseException;
import com.ningxia.wine.protocol.req.T402AddReq;
import com.ningxia.wine.protocol.req.T402QueryReq;

@Repository
public class T402DaoImpl implements T402Dao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer save(final T402AddReq req) throws DataBaseException {
		Integer id = null;
		try {
			final String sql = "insert into t_402(season,nd,gscode,gsname,gsoldname,ptzzmj,ptzzmj_xz,jzjstr,ptyjstr,"
					+ "xjptytr,gzptytr,dljstr,sljstr,lhjstr,sbgztr,bjdyszl,bjdggswctz_sf,bjdyfzl,bjdwcflztz,bjdyyzl,"
					+ "bjdwcnyztr,zzglrys,bjdzzlsygzrc,bjdzzlsygrrgze,bjdzzlsygzfy,ptjcczl,hptjccl,bptjccl,bjdxsze,pzjxssr,pzjxssl,yzjxssl,yzjxssr,jzdbjdzxcksl,bjdxzzxcksl,"
					+ "bjdzxckxsje,dnjdcglyrs,dnlysr,kfsr,cysr,yxtr) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			// 目的是获取增加新增的emp的主键
			PreparedStatementCreator creator = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection con)
						throws SQLException {
					PreparedStatement psmt = con.prepareStatement(sql,
							Statement.RETURN_GENERATED_KEYS);
					psmt.setInt(1, req.getSeason());
					psmt.setString(2, req.getNd());
					psmt.setString(3, req.getGscode());
					psmt.setString(4, req.getGsname());
					psmt.setString(5, req.getGsoldname());
					psmt.setDouble(6, req.getPtzzmj());
					psmt.setDouble(7, req.getPtzzmjXz());
					psmt.setDouble(8, req.getJzjstr());
					psmt.setDouble(9, req.getPtyjstr());
					psmt.setDouble(10, req.getXjptytr());
					psmt.setDouble(11, req.getGzptytr());
					psmt.setDouble(12, req.getDljstr());
					psmt.setDouble(13, req.getSljstr());
					psmt.setDouble(14, req.getLhjstr());
					psmt.setDouble(15, req.getSbgztr());
					psmt.setDouble(16, req.getBjdyszl());
					psmt.setDouble(17, req.getBjdggswctzSf());
					psmt.setDouble(18, req.getBjdyfzl());
					psmt.setDouble(19, req.getBjdwcflztz());
					psmt.setDouble(20, req.getBjdyyzl());
					psmt.setDouble(21, req.getBjdwcnyztr());
					psmt.setDouble(22, req.getZzglrys());
					psmt.setDouble(23, req.getBjdzzlsygzrc());
					psmt.setDouble(24, req.getBjdzzlsygrrgze());
					psmt.setDouble(25, req.getBjdzzlsygzfy());
					psmt.setDouble(26, req.getPtjcczl());
					psmt.setDouble(27, req.getHptjccl());
					psmt.setDouble(28, req.getBptjccl());
					psmt.setDouble(29, req.getBjdxsze());
					psmt.setDouble(30, req.getPzjxssr());
					psmt.setInt(31, req.getPzjxssl());
					psmt.setDouble(32, req.getYzjxssl());
					psmt.setDouble(33, req.getYzjxssr());
					psmt.setInt(34, req.getJzdbjdzxcksl());
					psmt.setInt(35, req.getBjdxzzxcksl());
					psmt.setDouble(36, req.getBjdzxckxsje());
					psmt.setInt(37, req.getDnjdcglyrs());
					psmt.setDouble(38, req.getDnlysr());
					psmt.setDouble(39, req.getKfsr());
					psmt.setDouble(40, req.getCysr());
					psmt.setDouble(41, req.getYxtr());
					return psmt;
				}
			};
			KeyHolder holder = new GeneratedKeyHolder();
			jdbcTemplate.update(creator, holder);
			// 获取新增emp主键值
			id = holder.getKey().intValue();
		} catch (Exception e) {
			throw new DataBaseException(e);
		}
		return id;
	}

	public List<T402> query(T402QueryReq req) throws DataBaseException {
		StringBuffer sql = new StringBuffer("select * from t_402 ");
		if (req.getSeason() != null) {
			sql.append(sql.indexOf("where") != -1 ? " season="
					+ req.getSeason() : " where season=" + req.getSeason());
		}

		if (!StringUtils.isEmpty(req.getNd())) {
			sql.append(sql.indexOf("where") != -1 ? " and nd like '"
					+ req.getNd() + "'" : " where nd like '" + req.getNd()
					+ "'");
		}

		if (!StringUtils.isEmpty(req.getGscode())
				&& !"all".equalsIgnoreCase(req.getGscode())) {
			sql.append(sql.indexOf("where") != -1 ? " and gscode like '"
					+ req.getGscode() + "'" : " where gscode like '"
					+ req.getGscode() + "'");
		}

		if (!StringUtils.isEmpty(req.getGsname())) {
			sql.append(sql.indexOf("where") != -1 ? " and gsname like '"
					+ req.getGsname() + "'" : " where gsname like '"
					+ req.getGsname() + "'");
		}

		List<T402> t402s = jdbcTemplate.query(sql.toString(), new Object[] {},
				t402Mapper);
		return t402s;

	}

	public T402 findById(Integer id) throws DataBaseException {
		T402 t402 = null;
		try {
			String sql = "select * from t_402 where id=?";
			Object[] params = { id };
			t402 = jdbcTemplate.queryForObject(sql, params, t402Mapper);
		} catch (Exception e) {
			throw new DataBaseException(e);
		}
		return t402;
	}

	/**
	 * 使用RowMapper接口创建匿名内部类
	 */
	private RowMapper<T402> t402Mapper = new RowMapper<T402>() {

		// rs是每行记录，index是行号
		public T402 mapRow(ResultSet rs, int index) throws SQLException {
			T402 t402 = new T402();
			t402.setId(rs.getInt("id"));
			t402.setSeason(rs.getInt("season"));
			t402.setNd(rs.getString("nd"));
			t402.setGscode(rs.getString("gscode"));
			t402.setGsname(rs.getString("gsname"));
			t402.setGsoldname(rs.getString("gsoldname"));
			t402.setPtzzmj(rs.getDouble("ptzzmj"));
			t402.setPtzzmjXz(rs.getDouble("ptzzmj_xz"));
			t402.setJzjstr(rs.getDouble("jzjstr"));
			t402.setPtyjstr(rs.getDouble("ptyjstr"));
			t402.setXjptytr(rs.getDouble("xjptytr"));
			t402.setGzptytr(rs.getDouble("gzptytr"));
			t402.setDljstr(rs.getDouble("dljstr"));
			t402.setSljstr(rs.getDouble("sljstr"));
			t402.setLhjstr(rs.getDouble("lhjstr"));
			t402.setSbgztr(rs.getDouble("sbgztr"));
			t402.setBjdyszl(rs.getDouble("bjdyszl"));
			t402.setBjdggswctzSf(rs.getDouble("bjdggswctz_sf"));
			t402.setBjdyfzl(rs.getDouble("bjdyfzl"));
			t402.setBjdwcflztz(rs.getDouble("bjdwcflztz"));
			t402.setBjdyyzl(rs.getDouble("bjdyyzl"));
			t402.setBjdwcnyztr(rs.getDouble("bjdwcnyztr"));
			t402.setZzglrys(rs.getInt("zzglrys"));
			t402.setBjdzzlsygzrc(rs.getInt("bjdzzlsygzrc"));
			t402.setBjdzzlsygrrgze(rs.getDouble("bjdzzlsygrrgze"));
			t402.setBjdzzlsygzfy(rs.getDouble("bjdzzlsygzfy"));
			t402.setPtjcczl(rs.getDouble("ptjcczl"));
			t402.setHptjccl(rs.getDouble("hptjccl"));
			t402.setBptjccl(rs.getDouble("bptjccl"));
			t402.setBjdxsze(rs.getDouble("bjdxsze"));
			t402.setPzjxssr(rs.getDouble("pzjxssr"));
			t402.setPzjxssl(rs.getInt("pzjxssl"));
			t402.setYzjxssl(rs.getDouble("yzjxssl"));
			t402.setYzjxssr(rs.getDouble("yzjxssr"));
			t402.setJzdbjdzxcksl(rs.getInt("jzdbjdzxcksl"));
			t402.setBjdxzzxcksl(rs.getInt("bjdxzzxcksl"));
			t402.setBjdzxckxsje(rs.getDouble("bjdzxckxsje"));
			t402.setDnjdcglyrs(rs.getInt("dnjdcglyrs"));
			t402.setDnlysr(rs.getDouble("dnjdcglyrs"));
			t402.setKfsr(rs.getDouble("kfsr"));
			t402.setCysr(rs.getDouble("cysr"));
			t402.setYxtr(rs.getDouble("yxtr"));
			return t402;
		}

	};

}
