package com.app.service;

import java.util.List;

import com.app.pojos.NoticeBoard;

public interface INoticeBoardService {
//list all noticeboards
	List<NoticeBoard>getAllNoticeBoards();
	
	//create new NoticeBoard
	NoticeBoard addNoticeBoardDetails(NoticeBoard transientPOJO);
	
	//delete
	String deleteNotice(int nid);
}
