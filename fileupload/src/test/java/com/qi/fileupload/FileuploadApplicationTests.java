package com.qi.fileupload;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileuploadApplicationTests {

	@Test
	public void contextLoads() {
		String s = DateUtil.format(new Date(), "yyyyMMddHHmmssZ");
		System.out.println("！！！！！！！！！！！！！！！！！！");
		System.out.println(s);
	}

}
