package com.codegnan.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDTO {
private Long orderId;
private Long userId;
private BigDecimal totalPrice;
private String status;
private List<OrderItemResponseDTO> items;
private UserDto userDto;
public Long getOrderId() {
	return orderId;
}
public void setOrderId(Long orderId) {
	this.orderId = orderId;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public BigDecimal getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(BigDecimal totalPrice) {
	this.totalPrice = totalPrice;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public List<OrderItemResponseDTO> getItems() {
	return items;
}
public void setItems(List<OrderItemResponseDTO> items) {
	this.items = items;
}
public UserDto getUserDto() {
	return userDto;
}
public void setUserDto(UserDto userDto) {
	this.userDto = userDto;
}

}
