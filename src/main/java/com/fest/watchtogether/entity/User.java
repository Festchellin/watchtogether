package com.fest.watchtogether.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author Festchellin
 * @Date 12/31/2018  1:21 PM
 * @Version 1.0
 */
@Data
public class User implements Serializable {
	private Long id;
	private String account;
	private String name;
	private String password;
	private Boolean adminRole = false;
}
