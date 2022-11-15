package br.com.dip.service.serviceorder.framework.adapter.out;

import org.springframework.stereotype.Component;

import br.com.dip.service.serviceorder.application.core.domain.Order;
import br.com.dip.service.serviceorder.application.port.out.InsertOrderPortOut;

@Component
public class InsertOrderAdapterOut implements InsertOrderPortOut {

	@Override
	public Order insertOrder(Order o) throws Exception {
		
		return o;
	}

}
