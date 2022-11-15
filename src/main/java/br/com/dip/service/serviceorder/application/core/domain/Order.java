package br.com.dip.service.serviceorder.application.core.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Order {

	private int id;
	private int number;
	private boolean status;
	private Date CreateDate;
	private Date previsionDate;
	private Date finishDate;
	private List<Service> lstService;
	
	
}
