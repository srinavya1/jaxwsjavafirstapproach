package com.trainings.ws.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.trainings.ws.soap.dto.PaymentProcessorRequest;
import com.trainings.ws.soap.dto.PaymentProcessorResponse;
@WebService(name="PaymentProcessor")
public interface PaymentProcessor {

	public @WebResult(name="Response") PaymentProcessorResponse 
	processPayment(@WebParam(name="PaymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
