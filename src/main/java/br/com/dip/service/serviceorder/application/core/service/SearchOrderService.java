package br.com.dip.service.serviceorder.application.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dip.service.serviceorder.application.core.domain.Order;
import br.com.dip.service.serviceorder.application.port.in.SearchOrderPortIn;
import br.com.dip.service.serviceorder.application.port.out.SearchOrderPortOut;

@Service
public class SearchOrderService implements SearchOrderPortIn {

	@Autowired
	private SearchOrderPortOut searchOrderPortOut;

	@Override
	public List<Order> searchOrder() throws Exception {
		return searchOrderPortOut.searchOrder();
	}

	@Override
	public Order getOrder(int idOrder) throws Exception {
		
		return searchOrderPortOut.getOrder(2);
	}
	
}
