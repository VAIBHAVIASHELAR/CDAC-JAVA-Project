package com.app.pojos;

public enum Roles {
	ADMIN , HOUSEOWNER , SECRETARY;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Role : "+name().toLowerCase();
	}

}
