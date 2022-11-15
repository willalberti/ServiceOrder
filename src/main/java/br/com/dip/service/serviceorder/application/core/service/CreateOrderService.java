package br.com.dip.service.serviceorder.application.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dip.service.serviceorder.application.core.domain.Order;
import br.com.dip.service.serviceorder.application.port.in.CreateOrderPortIn;
import br.com.dip.service.serviceorder.framework.adapter.out.InsertOrderAdapterOut;

@Component
public class CreateOrderService implements CreateOrderPortIn {
	
	@Autowired
	private InsertOrderAdapterOut insertOrderAdapterOut;
	
	@Override
	public Order createOrder(Order o) throws Exception {
	
		return insertOrderAdapterOut.insertOrder(o);
	}

	
}
