package edu.msg.jthr.backend.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncrypter {
	// private static final Logger LOG = LoggerFactory.getLogger();

	public static String GenerateHashedPassword(final String password, final String salt) {
		String hashedPassword = "";
		byte[] initialBytes;

		try {
			initialBytes = (password + salt).getBytes("UTF-8");
			MessageDigest algorithm;
			algorithm = MessageDigest.getInstance("SHA1");
			algorithm.reset();
			algorithm.update(initialBytes);
			final byte[] hashedBytes = algorithm.digest();
			hashedPassword = new String(hashedBytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return hashedPassword;
	}
}
