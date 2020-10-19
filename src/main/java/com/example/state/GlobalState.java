package com.example.state;

public enum GlobalState {

	INSTANCE;

	boolean flag=false;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
