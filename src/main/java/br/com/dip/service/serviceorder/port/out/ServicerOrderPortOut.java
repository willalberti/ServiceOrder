package br.com.dip.service.serviceorder.port.out;

import java.util.List;

import br.com.dip.service.serviceorder.domain.Order;

public interface ServicerOrderPortOut {

	List<Order> searchOrder();
	Order getOrder(int idOrder);
	Order createOrder(Order o);
	
}
