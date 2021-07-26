package br.com.dip.service.serviceorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dip.service.serviceorder.domain.Order;
import br.com.dip.service.serviceorder.port.in.SearchOrderPortIn;
import br.com.dip.service.serviceorder.port.out.SearchOrderPortOut;

@Service
public class SearchOrderService implements SearchOrderPortIn {

	@Autowired
	private SearchOrderPortOut searchOrderPortOut;

	@Override
	public List<Order> searchOrder() {
		return searchOrderPortOut.searchOrder();
	}

	@Override
	public Order getOrder(int idOrder) {
		
		return searchOrderPortOut.getOrder(2);
	}
	
}
