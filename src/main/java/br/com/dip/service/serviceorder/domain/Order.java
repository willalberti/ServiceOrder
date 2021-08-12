package br.com.dip.service.serviceorder.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data


public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int number;
	private boolean status;
	private Date CreateDate;
	private Date previsionDate;
	private Date finishDate;
	private List<Service> lstService;
	
	
}
