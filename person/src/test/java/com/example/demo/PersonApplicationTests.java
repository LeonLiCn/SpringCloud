package com.example.demo;

import com.example.demo.utils.PhoneUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class PersonApplicationTests {


	public static void main(String[] args) {
		System.out.println(PhoneUtils.blurPhone("18758009334"));
		System.out.println(PhoneUtils.maskIdCard("142724199302151617"));

	}

}
