package com.fest.watchtogether.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fest.watchtogether.util.GenerateUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Vote implements Serializable {
	private Integer id;
	private String uuid = GenerateUtils.randomUUID();
	@JsonProperty("vote_time")
	private Date voteTime;
	private User voter;
	//	[-1：thumb down，0:default，1：thumb up]
	private Integer state = 0;
	@JsonProperty("vote_classname")
	private String voteClassname;
}
