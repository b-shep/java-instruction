package com.mma.db;

import org.springframework.data.repository.CrudRepository;

import com.mma.logic.Invoice;


public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
