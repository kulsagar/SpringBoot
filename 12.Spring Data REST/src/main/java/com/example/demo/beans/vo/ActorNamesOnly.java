package com.example.demo.beans.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.example.demo.beans.Actor;

@Projection(name="actorFullName", types=Actor.class)
public interface ActorNamesOnly {
	
	@Value("#{target.firstName+' '+target.lastName}")
	String getFullName();
}
