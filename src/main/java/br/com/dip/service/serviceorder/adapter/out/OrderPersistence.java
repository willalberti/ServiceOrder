package br.com.dip.service.serviceorder.adapter.out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.dip.service.serviceorder.domain.Order;
import br.com.dip.service.serviceorder.domain.Service;
import br.com.dip.service.serviceorder.port.out.SearchOrderPortOut;

@Component
public class OrderPersistence implements SearchOrderPortOut {

	@Override
	public List<Order> searchOrder() {
		
		List<Order> lstOrder = new ArrayList<Order>();
		Order o = new Order();
		o.setId(1);
		o.setNumber(2);
		o.setStatus(true);
		
		Service s = new Service();
		s.setId(1);	
		s.setStatus(false);
		s.setType("ServiceType");
		
		List<Service> lstService = new ArrayList<Service>();
		lstService.add(s);
		o.setLstService(lstService);
		
		lstOrder.add(o);

		
		return lstOrder;
	}

	@Override
	public Order getOrder(int idOrder) {
		
		Order o = new Order();
		o.setId(1);
		o.setNumber(2);
		o.setStatus(true);
		
		Service s = new Service();
		s.setId(1);	
		s.setStatus(false);
		s.setType("ServiceType");
		
		List<Service> lstService = new ArrayList<Service>();
		lstService.add(s);
		o.setLstService(lstService);
		
		return o;
	}
	

}
