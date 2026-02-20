package com.codegnan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.dto.PaymentRequestDTO;
import com.codegnan.dto.PaymentResponseDTO;
import com.codegnan.service.PaymentService;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/payments")
@Slf4j
@AllArgsConstructor
public class PaymentController {
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	private PaymentService paymentService;
	

	public PaymentController(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}


	@PostMapping
	public PaymentResponseDTO makePayment(@RequestBody PaymentRequestDTO request) {

		log.info("PaymentController :: makePayment() called for OrderId: {}", request.getOrderId());
		log.debug("Incoming payment amount: {}", request.getAmount());

		PaymentResponseDTO response = paymentService.processPayment(request);

		log.info("PaymentController :: makePayment() completed successfully");

		return response;
	}
}