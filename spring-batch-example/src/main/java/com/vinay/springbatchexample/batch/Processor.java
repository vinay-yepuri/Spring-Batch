package com.vinay.springbatchexample.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.vinay.springbatchexample.model.User;

@Component
public class Processor implements ItemProcessor<User, User> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();

	public Processor() {

		DEPT_NAMES.put("001", "Technology");
		DEPT_NAMES.put("002", "Operations");
		DEPT_NAMES.put("003", "Accounts");
	}

	@Override
	public User process(User user) throws Exception {

		String deptCode = user.getDept();
		String deptName = DEPT_NAMES.get(deptCode);
		user.setDept(deptName);
		System.out.println(String.format("Converted from [%s] to [%s]",deptCode,deptName));
		return user;
	}
}
