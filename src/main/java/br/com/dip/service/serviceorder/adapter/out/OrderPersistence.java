package br.com.dip.service.serviceorder.adapter.out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import br.com.dip.service.serviceorder.domain.Order;
import br.com.dip.service.serviceorder.domain.Service;
import br.com.dip.service.serviceorder.port.out.ServicerOrderPortOut;

@Component
public class OrderPersistence implements ServicerOrderPortOut {

	@Cacheable(value = "lista-de-ordens") // método cacheado
	@Override
	public List<Order> searchOrder() {
		System.out.println("cache");
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
		System.out.println("limpa cache");
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

	@CacheEvict(value = "lista-de-ordens", allEntries = true) //limpa o cache
	@Override
	public Order createOrder(Order o) {
		return o;
	}
	

}
