package ro.emanuel.order.controller;


import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.order.dao.OrderDAO;
import ro.emanuel.order.pojo.Order;

@Controller
public class OrderController {

	@GetMapping("/order")
	public String singleOrder(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {

		Order o = OrderDAO.getById(id);
		
		model.addAttribute("o", o);
		
		return "order.jsp";
		
	}
	
	@GetMapping("/orders")
	public String allOrders(Model model) throws ClassNotFoundException, SQLException {

		ArrayList<Order> allOrders = OrderDAO.getAll();
				model.addAttribute("all", allOrders);
		
		return "orders.jsp";
	}

}
