package com.mma.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mma.db.InvoiceRepository;
import com.mma.db.LineItemRepository;
import com.mma.logic.Invoice;
import com.mma.logic.JsonResponse;
import com.mma.logic.LineItem;

@RestController
@RequestMapping("/lineitems")
public class LineItemController {
	
	@Autowired
	private LineItemRepository lineItemRepo;
	
	@GetMapping("/")
	public JsonResponse getAll(){
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(lineItemRepo.findAll());
	
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	
		
	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			Optional<LineItem> li = lineItemRepo.findById(id);
			if(li.isPresent()) {
				jr = JsonResponse.getInstance(li);
			} else {
				jr = JsonResponse.getInstance("No product found for id: " + id);
			}
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@PostMapping("/")
	public JsonResponse add(@RequestBody LineItem li) {
		JsonResponse jr = null;
		//NOTE: may need to enhance exception handling in future for more exceptions
		try {
			jr = JsonResponse.getInstance(lineItemRepo.save(li));
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody LineItem li) {
		JsonResponse jr = null;
		//NOTE: may need to enhance exception handling in future for more exceptions
		try {
			if(lineItemRepo.existsById(li.getId())) {
				jr = JsonResponse.getInstance(lineItemRepo.save(li));
		} else {
			jr = JsonResponse.getInstance("Line Item id: " + li.getId() + "does not exist");
		}
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@DeleteMapping("/")
	public JsonResponse delete(@RequestBody LineItem li) {
		JsonResponse jr = null;
		//NOTE: may need to enhance exception handling in future for more exceptions
		try {
			if(lineItemRepo.existsById(li.getId())) {
				lineItemRepo.delete(li);
				jr = JsonResponse.getInstance("Product Deleted.");
		} else {
			jr = JsonResponse.getInstance("Line Item id: " + li.getId() + "does not exist nad you are attempting to delete it");
			}
		}
		catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
}