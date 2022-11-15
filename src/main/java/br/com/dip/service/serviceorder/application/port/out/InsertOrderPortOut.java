package br.com.dip.service.serviceorder.application.port.out;

import br.com.dip.service.serviceorder.application.core.domain.Order;


public interface InsertOrderPortOut {
	
	Order insertOrder(Order o) throws Exception;

}
