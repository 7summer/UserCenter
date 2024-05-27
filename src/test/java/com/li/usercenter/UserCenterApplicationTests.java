package com.li.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class UserCenterApplicationTests {

	@Test
	public void testDigestUtils() {
		String password = "21421";
		final String MOD = "quake";

		String newPassword1 = DigestUtils.md5DigestAsHex((password + MOD).getBytes());

		System.out.println(newPassword1);
	}

	@Test
	public void testSelect() {

	}

}
