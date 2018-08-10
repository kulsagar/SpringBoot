package com.cg.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String text;
	@OneToOne(cascade=CascadeType.ALL)
	private Sender sender;
	public Message(String text, Sender sender) {
		super();
		this.text = text;
		this.sender=sender;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + ", sender=" + sender + "]";
	}
	
}
