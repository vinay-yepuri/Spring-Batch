package com.vinay.springbatchexample.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vinay.springbatchexample.model.User;
import com.vinay.springbatchexample.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users : "+users);
		userRepository.saveAll(users);
	}

}
