package com.subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static com.common.JDBCTemplate.*;

public class SubjectDAO {
	
	public ArrayList<SubjectVO> getSubjectList(SubjectVO vo){
		StringBuffer sql = new StringBuffer();
		sql.append("select no, s_num, s_name from subject ");
		if(vo!=null) {
			sql.append("where s_name like ? ");
		}
		sql.append("order by no");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVO svo = null;
		ArrayList<SubjectVO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			if(vo!=null) {
				pstmt.setString(1, "%"+vo.getS_name()+"%");
			}
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				svo = new SubjectVO();
				svo.setNo(rs.getInt("no"));
				svo.setS_num(rs.getString("s_num"));
				svo.setS_name(rs.getString("s_name"));
				
				list.add(svo);
			}
			
		} catch(SQLException e) {
			System.out.println("조회에 문제가 있어 잠시후 다시 진행해 주세요.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("error = [ "+e+" ]");
		} finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		
		return list;
	}
	
	public boolean subejctInsert(SubjectVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into subject values(subject_seq.nextval, ?, ?)");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean success = false;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getS_num());
			pstmt.setString(2, vo.getS_name());
			
			int i = pstmt.executeUpdate();
			if(i == 1) {
				success = true;
				commit(con);
			}
		} catch(SQLException e) {
			System.out.println("입력에 문제가 있어 잠시 후에 다시 진행해 주세요.");
			rollback(con);
		} catch(Exception e) {
			System.out.println("error = [ "+e+" ]");
		} finally {
			close(pstmt);
			close(con);
		}
		return success;
	}
	
}
