package com.fest.watchtogether.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserLog
 * @Description
 * @Author Festchellin
 * @Date 1/1/2019  3:19 PM
 * @Version 1.0
 */
@Data
public class UserLog implements Serializable {
	private Long id;
	private User user;
	private String userToken;
	private Date loginTime;
}
