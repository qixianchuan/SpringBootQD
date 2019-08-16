package com.qi.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.Gson;
import com.qi.mybatisplus.entity.Person;
import com.qi.mybatisplus.mapper.PersonMapper;
import ikidou.reflect.TypeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusApplicationTests {

	@Autowired
	private PersonMapper personMapper;
	@Test
	public void contextLoads() {
	}


	//json 正反序列化
	@Test
	public void test(){
		Page<Person> page =  new Page<>(1,2);
		IPage<Person> personIPage = personMapper.selectPage(page, new QueryWrapper<Person>()
				.isNotNull("name"));
		System.out.println("总条数 ------> " + personIPage.getTotal());
		System.out.println("当前页数 ------> " + personIPage.getCurrent());
		System.out.println("当前每页显示数 ------> " + personIPage.getSize());
		print(personIPage.getRecords());
		System.out.println("json 正反序列化 begin");
		Gson gson = new Gson();
		String json = gson.toJson(page);
		Page<Person> page1 = gson.fromJson(json, TypeBuilder.newInstance(Page.class).addTypeParam(Person.class).build());
		print(page1.getRecords());
		System.out.println("json 正反序列化 end");
	}

	private <T> void print(List<T> list) {
		if (!CollectionUtils.isEmpty(list)) {
			list.forEach(System.out::println);
		}
	}

}
