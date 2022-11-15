package br.com.dip.service.serviceorder.application.core.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Service {
	private int id;
	private String type;
	private boolean status;
	private Date startDate;
	private Date finish;
	
}
