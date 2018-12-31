package com.fest.watchtogether.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fest.watchtogether.entity.User;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName JWTUtil
 * @Description
 * @Author Festchellin
 * @Date 12/31/2018  2:48 PM
 * @Version 1.0
 */
public class JWTUtil {
	//	jwt 秘码
	private static final String SECRET = "JKKLJOoasdlfj";
	//	token过期时间 7 天
	private static final int CALENDARFIELD = Calendar.DATE;
	private static final int CALENDARFIELDINTERVAL = 7;
	
	/**
	 * @return java.lang.String
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 根据user的account 和 password 生成token
	 * @Date 3:05 PM 12/31/2018
	 * @Param [user]
	 */
	public static String generateUserToken(User user) {
		String userToken;
		Date iatDate = new Date();
		// expire time
		Calendar nowTime = Calendar.getInstance();
		nowTime.add(CALENDARFIELD, CALENDARFIELDINTERVAL);
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
	
	/**
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 验证token
	 * @Date 3:43 PM 12/31/2018
	 * @Param [userToken]
	 * @throws Exception
	 * @return com.auth0.jwt.interfaces.DecodedJWT
	 */
	public static DecodedJWT verifyToken(String userToken) throws Exception {
		DecodedJWT jwt = null;
		JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
		jwt = verifier.verify(userToken);
		return jwt;
	}
	
	@Test
	public void test() {
		User user = new User();
		user.setAccount("123123123");
		user.setAdminRole(true);
		String userToken = generateUserToken(user);
		System.out.println(userToken);
		try {
			DecodedJWT decodedJWT = verifyToken(userToken);
			Date expiresDate = decodedJWT.getExpiresAt();
			System.out.println(expiresDate.toString());
			Map<String, Claim> claims = decodedJWT.getClaims();
			claims.forEach((s, claim) -> {
				if ("adminRole".equals(s))
					System.out.println(s+":"+claim.asBoolean());
				else if ("exp".equals(s))
					System.out.println(s+":"+claim.asDate().toLocaleString());
				else if ("iat".equals(s))
					System.out.println(s+":"+claim.asDate().toLocaleString());
				else if ("account".equals(s))
					System.out.println(s+":"+claim.asString());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
