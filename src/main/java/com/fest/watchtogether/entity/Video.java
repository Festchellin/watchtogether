package com.fest.watchtogether.entity;


import com.fest.watchtogether.entity.flag.Voting;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Video implements Serializable, Voting {
	private Integer id;
	private String name;
	private String description;
	private User author;
	private Date releaseTime;
	private String url;
}
