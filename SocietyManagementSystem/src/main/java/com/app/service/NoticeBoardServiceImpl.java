
package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.INoticeBoardDao;
import com.app.pojos.NoticeBoard;

@Service
@Transactional
public class NoticeBoardServiceImpl implements INoticeBoardService {

	//dep
	@Autowired
	private INoticeBoardDao dao;
	
	@Override
	public List<NoticeBoard> getAllNoticeBoards() {
		System.out.println("dao impl class "+dao.getClass().getName());
		return dao.findAll();
	}

	@Override
	public NoticeBoard addNoticeBoardDetails(NoticeBoard transientPOJO) {
		// TODO Auto-generated method stub
		return dao.save(transientPOJO);
	}

	@Override
	public String deleteNotice(int nid) {
		dao.deleteById(nid);
		return "society  with id= "+nid+" deleted..." ;
	}

	
}
