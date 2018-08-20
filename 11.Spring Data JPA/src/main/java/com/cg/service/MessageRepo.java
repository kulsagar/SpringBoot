package com.cg.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.Message;
import com.cg.beans.Sender;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer>{

	@Query(value="Select m.sender from Message m where m.id=?1")
	public Sender getMessageText(int id);
}
