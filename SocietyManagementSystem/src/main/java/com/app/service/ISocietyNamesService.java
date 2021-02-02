package com.app.service;

import java.util.List;

import com.app.pojos.SocietyNames;

public interface ISocietyNamesService {
	//list all society 
	List<SocietyNames>getAllSocietyNames();
	//add new society
	SocietyNames addSocietyNamesDetails(SocietyNames transientPOJO);

	//delete society
	String deleteSociety(int sid);
}
