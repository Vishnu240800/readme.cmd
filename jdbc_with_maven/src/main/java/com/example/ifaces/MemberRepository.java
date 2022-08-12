package com.example.ifaces;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class MemberRepository implements CrudRepository<Member> {

	
	private Connection con;
	public MemberRepository(Connection con) {
		
		super();
		this.con=con;
		
	}

		public int add(Member obj) {
			int rowAdded = 0;
			
			String sql = "insert into gowse_member values(?,?,?,?,?,?,?,?)";
					
					try(PreparedStatement pstmt = con.prepareStatement(sql)) {
						
						pstmt.setInt(1, obj.getMemberId());
						pstmt.setString(2,obj.getMemberShipType());
						pstmt.setString(3,obj.getMemberName());
						pstmt.setString(4,obj.getMemberAddress());
						pstmt.setDate(5,obj.getAccountOpenDate());
						pstmt.setDouble(6,obj.getFeesPaid());
						pstmt.setInt(7,obj.getMaxBookAllowed());
						pstmt.setInt(8,obj.getPenaltyAmount());
						
						rowAdded = pstmt.executeUpdate();
						
						
				}catch (SQLException e) {
				e.printStackTrace();
			}
			return rowAdded;
		}
		
		
	public List<Member> findAll() {
		
		 List <Member> memberList = new ArrayList<Member>();
		 
		 String sql = "select * from gowse_member";
		 
		 try (PreparedStatement pstmt = con.prepareStatement(sql)){
			 
			ResultSet rs= pstmt.executeQuery();
			
			while (rs.next())
			{
				int memberId = rs.getInt("MEMBER_ID");
				
				String memberShipType= rs.getString("MEMBERSHIP_TYPE");

				String memberName = rs.getString("MEMBER_NAME");

				String memberAddress = rs.getString("MEMBER_ADDRESS");

				Date accountOpenDate= rs.getDate("ACC_OPEN_DATE");
				
				int  feesPaid = rs.getInt("FEES_PAID");
				
				int maxBookAllowed = rs.getInt("MAX_BOOKS_ALLOWED");

				int  penaltyAmount = rs.getInt("PENALTY_AMOUNT");
				
				
				Member prod = new Member( memberId, memberShipType,memberName,  memberAddress,  accountOpenDate,   feesPaid,  maxBookAllowed,  penaltyAmount);
				
				memberList.add(prod);
			}
					
		 } catch (SQLException e) {
			e.printStackTrace();
		}
		 return memberList;
		}
	
	
	
	public int remove(int id) {
	int rowsDelete =0;
		
		String sql= "delete from gowse_member where member_Id = ?";
		
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowsDelete=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsDelete;
	}
public Optional<Member> findById(int id) {
		
		Optional<Member> obj = Optional.empty();
		
		String sql = "select * from gowse_member where member_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
		
		pstmt.setInt(1, id);
		
		ResultSet result = pstmt.executeQuery();
		
		if(result.next()){
		
			int memberId =result.getInt("member_id");
			String memberShipType = result.getString("membership_type");
			String memberName = result.getString("member_name");
			String memberAddress = result.getString("member_address");
			Date accountOpenDate = result.getDate("acc_open_date");
			int feesPaid = result.getInt("fees_paid");
			int maxBooksAllowed = result.getInt("max_books_allowed");
			int penaltyAmount = result.getInt("penalty_amount");
			
			Member prod = new Member(memberId,memberShipType, memberName, memberAddress, accountOpenDate,  feesPaid, maxBooksAllowed, penaltyAmount);
			
			obj=Optional.of(prod);
		}
		}catch(SQLException e){
		
		e.printStackTrace();
		
		}
		return obj;
	}
	
	public int update1(int id, String obj) {
		
		int rowsUpdated=0;
		String sql = "update gowse_member set member_name=? where member_id=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
		
		pstmt.setString(1, obj);
		pstmt.setInt(2, id);
		
		rowsUpdated = pstmt.executeUpdate();
		
		}catch(SQLException e){
			e.printStackTrace();
		} 
		return rowsUpdated;
	}

	@Override
	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}
}




	
	
	
	
	
