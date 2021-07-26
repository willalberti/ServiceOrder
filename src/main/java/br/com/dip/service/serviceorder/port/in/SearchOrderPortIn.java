package br.com.dip.service.serviceorder.port.in;

import java.util.List;

import br.com.dip.service.serviceorder.domain.Order;


public interface SearchOrderPortIn {
	List<Order> searchOrder();
	Order getOrder(int idOrder); 
}
