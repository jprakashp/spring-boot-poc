package com.onlineshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshop.dto.Product;
import com.onlineshop.service.ProductService;
@Controller

public class ProductController {

	@Autowired
	public ProductService productService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProduct = productService.findAllProduct();
		model.addAttribute("listProducts", listProduct);
		return "index";
	}
	@RequestMapping("/new")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable long id) {
		ModelAndView mvn = new ModelAndView("edit_product");
		Product product = productService.getById(id);
		mvn.addObject("product", product);
		return mvn;
	}
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable long id) {
		 productService.delete(id);
		
		return "redirect:/";
	}
}
