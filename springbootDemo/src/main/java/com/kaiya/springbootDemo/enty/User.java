package com.kaiya.springbootDemo.enty;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = true, unique = true)
	private String nickName;
	@Column(nullable = false)
	private String regTime;
	@Column(nullable = false)
	private String gender;
}
