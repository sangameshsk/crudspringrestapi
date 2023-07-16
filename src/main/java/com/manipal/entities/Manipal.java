package com.manipal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manipal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Manipal(long pId, String pname, String paddress) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.paddress = paddress;
	}

	public Manipal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manipal [pId=" + pId + ", pname=" + pname + ", paddress=" + paddress + "]";
	}

}
