package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Events;

public interface IEventsDao extends JpaRepository<Events,Integer>{

}
