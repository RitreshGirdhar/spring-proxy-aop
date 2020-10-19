package com.example.rest;

import com.example.service.GlobalStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalStateController {

	@Autowired
	private GlobalStateService globalStateService;

	@RequestMapping(value = "/state/{flag}",method = RequestMethod.PUT)
	public void update(@PathVariable("flag") boolean globalState) {
		globalStateService.updateState(globalState);
	}

}
