package com.example.demo.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staff")

public class Staff {
	@Column(name = "staff_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer staff_id;
	
	@Column(name = "staff_code")
	private String staff_code;

	@Column(name = "staff_name")
	private String staff_name;
	
	@Column(name = "tel_mobile")
	private String tel_mobile;
	
	@Column(name = "birth_day")
	private Date birth_day;
	
	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;



	public Staff(Integer staff_id, String staff_code, String staff_name, String tel_mobile, Date birth_day,
			String email, String address) {
		this.staff_id = staff_id;
		this.staff_code = staff_code;
		this.staff_name = staff_name;
		this.tel_mobile = tel_mobile;
		this.birth_day = birth_day;
		this.email = email;
		this.address = address;
	}
	protected Staff() {
    }


	public Integer getStaff_id() {
		return staff_id;
	}



	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}



	public String getStaff_code() {
		return staff_code;
	}



	public void setStaff_code(String staff_code) {
		this.staff_code = staff_code;
	}



	public String getStaff_name() {
		return staff_name;
	}



	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}



	public String getTel_mobile() {
		return tel_mobile;
	}



	public void setTel_mobile(String tel_mobile) {
		this.tel_mobile = tel_mobile;
	}



	public Date getBirth_day() {
		return birth_day;
	}



	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", staff_code=" + staff_code + ", staff_name=" + staff_name
				+ ", tel_mobile=" + tel_mobile + ", birth_day=" + birth_day + ", email=" + email + ", address="
				+ address + "]";
	}
	

}
