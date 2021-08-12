package br.com.dip.service.serviceorder.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Service  implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String type;
	private boolean status;
	private Date startDate;
	private Date finish;
	
}
