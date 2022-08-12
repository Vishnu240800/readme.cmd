package com.example.demo.services;
import java.util.*;
import java.sql.*;
import com.example.entity.*;

public class ProductService {
	
	private Connection con;
	public ProductService(Connection con)
	{
		super();
		this.con=con;
	}
	
	public int updatePriceByName(String productName,double newprice)
	{
		int rowsUpdated=0;
		
		String sql= "UPDATE gowshick_product SET price = ?  WHERE product_name = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setDouble(1, newprice);
			pstmt.setString(2,productName);
			
			rowsUpdated = pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return rowsUpdated;
	}

	
	public int deleteById(int id)
	{
		int rowsDelete =0;
		
		String sql= "delete from gowshick_product where product_Id = ?";
		
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowsDelete=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsDelete;
	}
	
	public Optional<Product> findById(int id)
	{
		Optional<Product> obj=Optional.empty();
		String sql="select * from gowshick_product where  product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1,id);
		
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				int productId=rs.getInt("product_id");
				String productName=rs.getString("product_name");
				double price=rs.getDouble("price");
				
				Product prod = new Product(productId, productName, price);
				obj=Optional.of(prod);
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		return obj;
	}
	public int addProduct(Product product)
	{
		int rowAdded =0;
		
		String sql= "insert into gowshick_product values(?,?,?)";
		
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1,product.getProductId());

			pstmt.setString(2,product.getProductName());

			pstmt.setDouble(3,product.getPrice());
			
			rowAdded = pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return rowAdded;
	}
	
	public List<Product> findAll()
	{
	 List <Product> productList = new ArrayList<Product>();
	 
	 String sql = "select * from gowshick_product";
	 
	 try (PreparedStatement pstmt = con.prepareStatement(sql)){
		 
		ResultSet rs= pstmt.executeQuery();
		
		while (rs.next())
		{
			int productId = rs.getInt("product_ID");

			String productName = rs.getString("product_name");

			double price = rs.getDouble("price");
			
			Product prod = new Product(productId, productName, price);
			
			productList.add(prod);
		}
				
	 } catch (SQLException e) {
		e.printStackTrace();
	}
	 return productList;
	}
	public void usingTxn(Product prd1, Product prd2)
	{
		String sql="insert into sush_product values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			con.setAutoCommit(false);
			
			pstmt.setInt(1,prd1.getProductId());
			pstmt.setString(2, prd1.getProductName());
			pstmt.setDouble(3, prd1.getPrice());
			
			int rowAdded1=pstmt.executeUpdate();
			pstmt.setInt(1, prd2.getProductId());
			pstmt.setString(2, prd2.getProductName());
			pstmt.setDouble(3, prd2.getPrice());
			int rowAdded2=pstmt.executeUpdate();
			if(prd2.getPrice()>prd1.getPrice())
			{	
			con.commit();
			}
			else
			{
				con.rollback();
			}
			System.out.println("Row Added:="+rowAdded1+","+rowAdded2);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
		
		
		public void usingTxnWithCatchBlock(Product prd1,Invoice invoice)
		{
			String addProductsql="insert into sush_product values(?,?,?)";
			String addInvoicesql="insert into sush_invoice(?,?,?,?)";
			try(PreparedStatement prodStmt=con.prepareStatement(addProductsql);
					PreparedStatement invoStmt=con.prepareStatement(addInvoicesql))
			{
				con.setAutoCommit(false);
				
				prodStmt.setInt(1,prd1.getProductId());
				prodStmt.setString(2, prd1.getProductName());
				prodStmt.setDouble(3, prd1.getPrice());
				
				int productAddCount=prodStmt.executeUpdate();
				 invoStmt.setInt(1, invoice.getInvoiceNumber());
				 invoStmt.setString(2, invoice.getCustomerName());
				 invoStmt.setDouble(3,invoice.getQuantity());
				 invoStmt.setInt(4,invoice.getProductRef());
				con.commit();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
}