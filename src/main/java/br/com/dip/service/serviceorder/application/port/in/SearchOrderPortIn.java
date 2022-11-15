package br.com.dip.service.serviceorder.application.port.in;

import java.util.List;

import br.com.dip.service.serviceorder.application.core.domain.Order;


public interface SearchOrderPortIn {
	List<Order> searchOrder() throws Exception;
	Order getOrder(int idOrder) throws Exception; 
}
