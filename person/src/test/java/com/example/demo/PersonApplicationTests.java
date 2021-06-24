package com.example.demo;

import com.example.demo.utils.PhoneUtils;
import com.google.common.base.Splitter;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class PersonApplicationTests {


	public static void main(String[] args) throws UnsupportedEncodingException {

		LocalDateTime time = LocalDateTime.now();
		time = time.plusDays(1);
		System.out.println(time);

	}

	public static String getOneParameter(String url,String keyWord) {
		String retValue = "";
		try {
			final String charset = "utf-8";
			url = URLDecoder.decode(url, charset);
			if (url.indexOf('?') != -1) {
				final String contents = url.substring(url.indexOf('?') + 1);
				String[] keyValues = contents.split("&");
				for (int i = 0; i < keyValues.length; i++) {
					String key = keyValues[i].substring(0, keyValues[i].indexOf("="));
					String value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
					if (key.equals(keyWord)) {
						if (value != null || !"".equals(value.trim())) {
							retValue = value;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retValue;
	}

}
