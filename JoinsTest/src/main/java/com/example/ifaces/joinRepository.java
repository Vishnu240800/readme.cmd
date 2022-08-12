package com.example.ifaces;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class joinRepository implements CrudRepository<LoanApplication>{

	private Connection con;
	public joinRepository(Connection con) {
		super();
		this.con = con;
	}
	@Override
	public int add(LoanApplication obj) {
		 int rowadd=0;
		 String cus_sql="insert into gowse_customer values(?,?,?,?)";
		 String loan_sql="insert into gowse_loanapplication values(?,?,?)";
			try(PreparedStatement pstmt = con.prepareStatement(cus_sql);
					PreparedStatement pstmt1=con.prepareStatement(loan_sql)) {
				pstmt.setInt(1,obj.getCustomer().getCustomer_Id());
				pstmt.setString(2,obj.getCustomer().getCustomer_Name());
				pstmt.setLong(3,obj.getCustomer().getPhone_Number());
				pstmt.setDouble(4,obj.getCustomer().getCredit_Score());
				
				rowadd = pstmt.executeUpdate();
				
				pstmt1.setInt(1,obj.getLoan_Application_Number());
				pstmt1.setObject(2, obj.getCustomer().getCustomer_Id());
				pstmt1.setDouble(3,obj.getLoan_Amount());

				rowadd = pstmt1.executeUpdate();
				
				
		}catch (SQLException e) {
		e.printStackTrace();
	}
	return rowadd;
}

	@Override
public List<LoanApplication> findAll() {
		
		List<LoanApplication> customerlist = new ArrayList<LoanApplication>();
		String sql ="select gc.customer_id,gc.customer_name,gc.phone_number,gc.credit_score,gl.application_number,gl.customer,gl.loan_amount from gowse_loanapplication gl,gowse_customer gc where gc.customer_id=gl.customer";
		
		try(PreparedStatement ps = con.prepareStatement(sql)){
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int customerId = rs.getInt("customer_id");
				String customerName = rs.getString("customer_name");
				long phoneNumber = rs.getLong("phone_number");
				double creditScore = rs.getDouble("credit_score");
				int loanAppNo = rs.getInt("application_number");
				double loanamount = rs.getDouble("loan_amount");
				
				Customer cus = new Customer(customerId,customerName,phoneNumber,creditScore);
				
				LoanApplication loan = new LoanApplication(loanAppNo,cus,loanamount);
				customerlist.add(loan);
				
			}
			
		}catch(Exception e) {
		e.printStackTrace();
		}
		return customerlist;
	}
	@Override
	
		public int remove(int id) {
			int rowdeleted=0;
			String sql = "delete from gowse_loanapplication where application_number =?";
					
			try(PreparedStatement ps = con.prepareStatement(sql)){
						
				ps.setInt(1,id);
				rowdeleted= ps.executeUpdate();
						
				}catch(Exception e) {
				e.printStackTrace();
				}
		return rowdeleted;
		}

	@Override
	public Optional<LoanApplication> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(int Id, LoanApplication obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}


