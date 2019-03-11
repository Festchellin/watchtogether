package com.fest.watchtogether.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
	private Long id;
	private String account;
	private String name;
	private String password;
	private Boolean adminRole = false;
}
