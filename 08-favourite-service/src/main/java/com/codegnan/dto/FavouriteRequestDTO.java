package com.codegnan.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavouriteRequestDTO {

    private Integer userId;
    private Long productId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
    
}