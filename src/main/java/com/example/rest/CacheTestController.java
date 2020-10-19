package com.example.rest;

import com.example.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheTestController {

	@Autowired
	private DummyService dummyService;

	@RequestMapping(value = "/dummyservice/{recordId}",method = RequestMethod.GET)
	public ResponseEntity<String> update(@PathVariable("recordId") Integer recordId) {
		return new ResponseEntity(dummyService.get(recordId), HttpStatus.ACCEPTED);
	}


}
