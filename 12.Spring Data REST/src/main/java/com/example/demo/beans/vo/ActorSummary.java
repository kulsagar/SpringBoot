package com.example.demo.beans.vo;

import org.springframework.data.rest.core.config.Projection;

import com.example.demo.beans.Actor;

@Projection(name="actorSummary", types=Actor.class)
public interface ActorSummary {
	String getFirstName();
	String getLastName();
}
