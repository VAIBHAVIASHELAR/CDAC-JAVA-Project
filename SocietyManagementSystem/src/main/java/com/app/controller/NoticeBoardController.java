package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.NoticeBoard;
import com.app.pojos.SocietyNames;
import com.app.service.INoticeBoardService;

@RestController
@RequestMapping("/noticeboard")
public class NoticeBoardController {
	//dep
	@Autowired
	private INoticeBoardService service;
	
	public NoticeBoardController()
	{
		System.out.println("in constr of "+getClass().getName());
		
	}
	
	@GetMapping
	public ResponseEntity<?>listAllNoticeBoard()
	{
		System.out.println("in list of notice board");
		List<NoticeBoard> noticeboard=service.getAllNoticeBoards();
		if(noticeboard.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(noticeboard,HttpStatus.OK);
	}
	//new notice
	@PostMapping
	public ResponseEntity<?>addNoticeBoardDetails(@RequestBody NoticeBoard n)
	{
		System.out.println("in add NoticeBoard "+n);
		try {
			NoticeBoard notice=service.addNoticeBoardDetails(n);
			return new ResponseEntity<>(notice,HttpStatus.OK);
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{nid}")
	public String deleteSociety(@PathVariable int nid)
	{
		 System.out.println("in del society"+nid);
		 return service.deleteNotice(nid);
	}

}
