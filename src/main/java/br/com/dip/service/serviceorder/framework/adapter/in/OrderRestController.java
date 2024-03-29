package br.com.dip.service.serviceorder.framework.adapter.in;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dip.service.serviceorder.application.core.domain.Order;
import br.com.dip.service.serviceorder.application.port.in.CreateOrderPortIn;
import br.com.dip.service.serviceorder.application.port.in.SearchOrderPortIn;

@RestController
@RequestMapping("/api/serviceorder/v1")
public class OrderRestController {
	@Autowired
	private SearchOrderPortIn searchOrderPortIn;
	
	@Autowired
	private CreateOrderPortIn createOrderPortIn;
	
	@GetMapping("/order/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable(value="id") int id) {
		try {
			Order o = searchOrderPortIn.getOrder(id);
			if(o!=null ) 
				return new ResponseEntity<Order>(o, HttpStatus.OK);
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
	@GetMapping("/Orders")
	public ResponseEntity<List<Order>> listOrder() {
		try {
			List<Order> lstOrder = searchOrderPortIn.searchOrder();
			if(lstOrder!=null ) 
				return new ResponseEntity<List<Order>>(lstOrder, HttpStatus.OK);
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	@PostMapping("/Order")
	public ResponseEntity<Order> getOrder(@RequestBody @Valid Order order) {
		try {	
			
			Order o = createOrderPortIn.createOrder(order);
			
			return new ResponseEntity<Order>(o, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
		

}
