package com.fest.watchtogether.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Category implements Serializable {
	private Integer id;
	private String name;
	private Date lastModifyTime = new Date(System.currentTimeMillis());
}
