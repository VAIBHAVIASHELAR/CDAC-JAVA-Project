package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.UserNotFound;
import com.app.dao.ISocietyNamesDao;
import com.app.pojos.SocietyNames;
@Service
@Transactional
public class SocietyNamesServiceImpl implements ISocietyNamesService {
	//dep
	@Autowired
	private ISocietyNamesDao dao;

	@Override
	public List<SocietyNames> getAllSocietyNames() {
		System.out.println("dao impl class "+dao.getClass().getName());
		return dao.findAll();
	}

	@Override
	public SocietyNames addSocietyNamesDetails(SocietyNames transientPOJO) {
		// TODO Auto-generated method stub
		return dao.save(transientPOJO);
	}

	@Override
	public String deleteSociety(int sid) {
		dao.deleteById(sid);
		return "society  with id= "+sid+" deleted..." ;
	}

	


	
}
