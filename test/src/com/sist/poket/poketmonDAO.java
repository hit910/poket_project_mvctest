package com.sist.poket;

import java.io.Reader;
import java.sql.*;
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class poketmonDAO {
	private static SqlSessionFactory ssf;
	
	static{
		try {
			Reader reader=Resources.getResourceAsReader("Config.xml");
			ssf=new SqlSessionFactoryBuilder().build(reader);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static List<poketmonVO> bookList() {
		SqlSession session = ssf.openSession();
		List<poketmonVO> list = session.selectList("bookList");
		session.close();
		return list;
	}
	
	public static poketmonVO detailData(int no) {
		SqlSession session = ssf.openSession();
		poketmonVO vo = session.selectOne("detailBook", no);
		session.close();
		return vo;
	}
	
	
	
	
//	public ArrayList<poketmonVO> bookList() {
//		ArrayList<poketmonVO> list = new ArrayList<>();
//		try {
//			getConnection();
//			String sql = "SELECT * FROM p_table ORDER BY no ASC ";
//	         
//			ps = conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()){
//				poketmonVO vo = new poketmonVO();
//				vo.setNo(rs.getInt(1));
//				vo.setName(rs.getString(2));
//				vo.setRev1(rs.getString(3));
//				vo.setRev2(rs.getString(4));
//				vo.setRev3(rs.getString(5));
//				vo.setType1(rs.getString(6));
//				vo.setType2(rs.getString(7));
//				vo.setS_type1(rs.getString(8));
//				vo.setS_type2(rs.getString(9));
//				vo.setL_type1(rs.getString(10));
//				vo.setL_type2(rs.getString(11));
//				list.add(vo);	
//			}
//		} catch (Exception ex) {
//			System.out.println("bookList()" + ex.getMessage());
//		}finally {
//			disConnection();
//		}
//		return list;
//	}
	
//	public ArrayList<poketmonVO> bookList(String name) {
//		ArrayList<poketmonVO> list = new ArrayList<>();
//		try {
//			getConnection();
//			String sql = "SELECT * FROM p_table WHERE name like '%" + name +"%' ORDER BY no ASC ";
//         
//	        ps=conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()){
//				poketmonVO vo = new poketmonVO();
//				vo.setNo(rs.getInt(1));
//				vo.setName(rs.getString(2));
//				vo.setRev1(rs.getString(3));
//				vo.setRev2(rs.getString(4));
//				vo.setRev3(rs.getString(5));
//				vo.setType1(rs.getString(6));
//				vo.setType2(rs.getString(7));
//				vo.setS_type1(rs.getString(8));
//				vo.setS_type2(rs.getString(9));
//				vo.setL_type1(rs.getString(10));
//				vo.setL_type2(rs.getString(11));
//				list.add(vo);	
//			}
//		} catch (Exception ex) {
//			System.out.println("bookList()" + ex.getMessage());
//		}finally {
//			disConnection();
//		}
//		return list;
//	}
//	
//	public ArrayList<poketmonVO> bookList2(String type) {
//		ArrayList<poketmonVO> list = new ArrayList<>();
//		try {
//			getConnection();
//			String sql = "SELECT * FROM p_table WHERE type1 like '%" + type +"%' "
//					+ "OR type2 like '%" + type +"%' "
//					+ "ORDER BY no ASC ";
//         
//	        ps=conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()){
//				poketmonVO vo = new poketmonVO();
//				vo.setNo(rs.getInt(1));
//				vo.setName(rs.getString(2));
//				vo.setRev1(rs.getString(3));
//				vo.setRev2(rs.getString(4));
//				vo.setRev3(rs.getString(5));
//				vo.setType1(rs.getString(6));
//				vo.setType2(rs.getString(7));
//				vo.setS_type1(rs.getString(8));
//				vo.setS_type2(rs.getString(9));
//				vo.setL_type1(rs.getString(10));
//				vo.setL_type2(rs.getString(11));
//				list.add(vo);	
//			}
//		} catch (Exception ex) {
//			System.out.println("bookList()" + ex.getMessage());
//		}finally {
//			disConnection();
//		}
//		return list;
//	}
//	
//	public ArrayList<poketmonVO> bookList(int no) {
//		ArrayList<poketmonVO> list = new ArrayList<>();
//		try {
//			getConnection();
//			String sql = "SELECT * FROM p_table WHERE no=" + no +" ORDER BY no ASC ";
//			System.out.println(sql);
//	        ps=conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()){
//				poketmonVO vo = new poketmonVO();
//				vo.setNo(rs.getInt(1));
//				vo.setName(rs.getString(2));
//				vo.setRev1(rs.getString(3));
//				vo.setRev2(rs.getString(4));
//				vo.setRev3(rs.getString(5));
//				vo.setType1(rs.getString(6));
//				vo.setType2(rs.getString(7));
//				vo.setS_type1(rs.getString(8));
//				vo.setS_type2(rs.getString(9));
//				vo.setL_type1(rs.getString(10));
//				vo.setL_type2(rs.getString(11));
//				list.add(vo);	
//			}
//		} catch (Exception ex) {
//			System.out.println("bookList()" + ex.getMessage());
//		}finally {
//			disConnection();
//		}
//		return list;
//	}
//	
//	public poketmonVO detailData(int no) {
//			poketmonVO vo = new poketmonVO();
//		try {
//			getConnection();
//			String sql="SELECT no,name,rev1,rev2,rev3,type1,type2,s_type1,s_type2,l_type1,l_type2 FROM p_table WHERE no=?";
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1, no);
//			ResultSet rs = ps.executeQuery();
//			rs.next();
//			
//			vo.setNo(rs.getInt(1));
//			vo.setName(rs.getString(2));
//			vo.setRev1(rs.getString(3));
//			vo.setRev2(rs.getString(4));
//			vo.setRev3(rs.getString(5));
//			vo.setType1(rs.getString(6));
//			vo.setType2(rs.getString(7));
//			vo.setS_type1(rs.getString(8));
//			vo.setS_type2(rs.getString(9));
//			vo.setL_type1(rs.getString(10));
//			vo.setL_type2(rs.getString(11));
//			
//			rs.close();
//			
//		} catch (Exception ex) {
//			System.out.println("detailData()" + ex.getMessage());
//		} finally {
//			disConnection();
//		}
//		return vo;
//	}
	
}
