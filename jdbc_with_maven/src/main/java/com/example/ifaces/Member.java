package com.example.ifaces;

import java.sql.Date;
import java.time.LocalDate;

public class Member {
	
	public int memberId;
	public String memberName;
	public String memberAddress;
	public Date accountOpenDate;
	public String memberShipType;
	public int feesPaid;
	public int maxBookAllowed;
	public int penaltyAmount;
	
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public Date getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}
	public int getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(int penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberShipType=" + memberShipType + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accountOpenDate=" + accountOpenDate + ", feesPaid="+ feesPaid + ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	public Member(int memberId,String memberShipType, String memberName, String memberAddress, Date accountOpenDate,
			 int feesPaid, int maxBookAllowed, int penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accountOpenDate = null;
		this.memberShipType = memberShipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	
	
	
	
	

}
