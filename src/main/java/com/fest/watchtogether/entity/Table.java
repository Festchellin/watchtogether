package com.fest.watchtogether.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Table implements Serializable {
	private Integer id;
	private String tbName;
	private String tbComment;
	private String navigateLink;
	private Integer type;
}
