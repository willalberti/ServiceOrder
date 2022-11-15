package br.com.dip.service.serviceorder.application.port.in;

import br.com.dip.service.serviceorder.application.core.domain.Order;

public interface CreateOrderPortIn {
	Order createOrder(Order o) throws Exception;
}
