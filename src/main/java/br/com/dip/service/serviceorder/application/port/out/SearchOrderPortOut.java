package br.com.dip.service.serviceorder.application.port.out;

import java.util.List;

import br.com.dip.service.serviceorder.application.core.domain.Order;

public interface SearchOrderPortOut {

	List<Order> searchOrder() throws Exception;
	Order getOrder(int idOrder) throws Exception;
	
}
