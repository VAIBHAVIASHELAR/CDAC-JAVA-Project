package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.NoticeBoard;

public interface INoticeBoardDao extends JpaRepository<NoticeBoard,Integer>{

}
