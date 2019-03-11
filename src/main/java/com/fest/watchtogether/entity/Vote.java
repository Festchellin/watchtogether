package com.fest.watchtogether.entity;

import com.fest.watchtogether.util.GenerateUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Vote implements Serializable {
	private Integer id;
	private String uuid = GenerateUtils.randomUUID();
	private Date voteTime;
	private User voter;
	//	[-1：thumb down，0:default，1：thumb up]
	private Integer state = 0;
	private String voteClassname;
}
