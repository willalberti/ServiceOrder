package br.com.dip.service.serviceorder.port.in;

import br.com.dip.service.serviceorder.domain.Order;

public interface CreateOrderPortIn {
	Order createOrder(Order o);
}
