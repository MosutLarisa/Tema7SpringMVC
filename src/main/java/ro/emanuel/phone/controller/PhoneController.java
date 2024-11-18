package ro.emanuel.phone.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.phone.dao.PhoneDAO;
import ro.emanuel.phone.pojo.Phone;

@Controller
public class PhoneController {

	@GetMapping("/phone")
	public String singlePhone(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {

		Phone p = PhoneDAO.getById(id);
		
		model.addAttribute("p", p);
		
		return "phone.jsp";
		
	}
	
	@GetMapping("/phones")
	public String allPhones(Model model) throws ClassNotFoundException, SQLException {
		//aduc toate cantecele din db
		ArrayList<Phone> allPhones = PhoneDAO.getAll();
		
		//adaug cantecele in pagina
		model.addAttribute("all", allPhones);
		
		return "phones.jsp";
	}

}
