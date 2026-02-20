package com.codegnan.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShippingRequestDTO {

	private Long orderId;
	private String shippingMethod;
	private String carrier;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
}