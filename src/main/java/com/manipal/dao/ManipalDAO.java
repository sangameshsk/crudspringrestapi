package com.manipal.dao;

public class ManipalDAO {

	private long pId;
	private String pname;
	private String paddress;

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	@Override
	public String toString() {
		return "HospitalDAO [pId=" + pId + ", pname=" + pname + ", paddress=" + paddress + "]";
	}

}
