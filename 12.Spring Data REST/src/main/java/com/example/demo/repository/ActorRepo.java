package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.beans.Actor;
import com.example.demo.beans.vo.ActorNamesOnly;
import com.example.demo.beans.vo.ActorSummary;

public interface ActorRepo extends JpaRepository<Actor, Integer> {

	Page<Actor> findByFirstName(@Param("name")String name,Pageable page);
	List<Actor> findByFirstNameOrLastName(@Param("firstName")String firstName,@Param("lastName")String lastName);
	Page<Actor> findByFirstNameStartingWith(@Param("name")String name,Pageable page);
	Page<Actor> findByFirstNameContaining(@Param("name")String name,Pageable page);
}
