package com.example.service;

import com.example.aspect.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

	@Cacheable(name = "DummyCache",record = "[0]",ttl = 2000)
	public String get(Integer id) {
		return "Returning from service";
	}

}
