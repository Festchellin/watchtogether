package com.fest.watchtogether.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fest.watchtogether.entity.User;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
	//	jwt 秘码
	private static final String SECRET = "JKKLJOoasdlfj";
	//	token过期时间 7 天
	private static final int CALENDAR_FIELD = Calendar.DATE;
	private static final int CALENDAR_FIELD_INTERVAL = 7;
	
	private JWTUtils() {
	
	}
	
	public static String generateUserToken(User user) {
		String userToken;
		Date iatDate = new Date();
		// expire time
		Calendar nowTime = Calendar.getInstance();
		nowTime.add(CALENDAR_FIELD, CALENDAR_FIELD_INTERVAL);
		Date expiresDate = nowTime.getTime();
		Map<String, Object> map = new HashMap<>();
		map.put("alg", "HS256");
		map.put("typ", "JWT");
		userToken = JWT.create().withHeader(map)
				.withClaim("account", user.getAccount())
				.withClaim("adminRole", user.getAdminRole())
				.withIssuedAt(iatDate)
				.withExpiresAt(expiresDate)
				.sign(Algorithm.HMAC256(SECRET));
		return userToken;
	}
	
	public static DecodedJWT verifyToken(String userToken) throws Exception {
		DecodedJWT jwt;
		JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
		jwt = verifier.verify(userToken);
		return jwt;
	}
	
}
