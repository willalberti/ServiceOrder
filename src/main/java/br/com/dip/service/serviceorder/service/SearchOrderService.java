package br.com.dip.service.serviceorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dip.service.serviceorder.domain.Order;
import br.com.dip.service.serviceorder.port.in.CreateOrderPortIn;
import br.com.dip.service.serviceorder.port.in.SearchOrderPortIn;
import br.com.dip.service.serviceorder.port.out.ServicerOrderPortOut;

@Service
public class SearchOrderService implements SearchOrderPortIn,CreateOrderPortIn {

	@Autowired
	private ServicerOrderPortOut serviceOrderPortOut;
	

	@Override
	public List<Order> searchOrder() {
		return serviceOrderPortOut.searchOrder();
	}

	@Override
	public Order getOrder(int idOrder) {
		
		return serviceOrderPortOut.getOrder(2);
	}

	@Override
	public Order createOrder(Order o) {
		
		return serviceOrderPortOut.createOrder(o);
	}
	
}
