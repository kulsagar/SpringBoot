package com.cg.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer>{

}
