package com.example.service;

import com.example.state.GlobalState;
import org.springframework.stereotype.Service;

@Service
public class GlobalStateService {

	public void updateState(boolean flag){
		GlobalState.INSTANCE.setFlag(flag);
	}

}
