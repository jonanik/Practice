package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.util.Constant;

public class BDao {

	JdbcTemplate template;

	// 생성자
	public BDao() {
		template = Constant.template;
	}// 생성자

	String sql = null;

	public ArrayList<BDto> list() {
		sql = "select * from mvc_board order by bGroup desc";
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public BDto contentView(String bId) {
		sql = "select * from mvc_board where bId=" + bId;
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public void upHit(final String bId) {
		String sql = "update mvc_board set bHit=bHit+1 where bId=" + bId;
		template.update(sql);
	}

	public void wirte(final String bName, final String bTitle, final String bContent) {
		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)"
						+ "values(mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);
				return pstmt;
			}
		});

	}

	public void delete(final String bId) {
		String sql = "delete from mvc_board where bId=?";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bId);

			}
		});
	}

	public BDto reply_view(String bId) {
		String sql = "select * from mvc_board where bId=" + bId;
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	public void reply(String bId, final String bName, final String bTitle, final String bContent, final String bGroup,
			final String bStep, final String bIndent) {
		String sql = "insert into mvc_board(bId,bName,bTitle,bContent,bGroup,bStep,bIndent"
				+ "(mvc_board_seq.nextval,?,?,?,?,?,?)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep));
				ps.setInt(6, Integer.parseInt(bIndent));

			}
		});
	}
}
