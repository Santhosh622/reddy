package com.example.demo.beans;
///dev
////dev1
////dev2
////dev3
///dev4
///dev5
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//
//
//
//
//
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="registration")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="UID")
	private int rid;
	@Column(name="UNAME")
	private String  rname;
	@Column(name="PASSWORD")
	private String  rpass;
	@Column(name="EMAIL")
	private String  remail;
	@Column(name="PHONENUMBER")
	private Long rphone;
	//

}
