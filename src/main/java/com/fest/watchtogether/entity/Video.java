package com.fest.watchtogether.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Festchellin
 * @version 1.0
 * @className Video
 * @description
 * @date 1/17/2019  2:20 PM
 */
@Data
public class Video implements Serializable {
	private Integer id;
	private String name;
	private String description;
	private User author;
	private Date releaseTime;
	private String url;
}
