package com.raulzin.projetospring.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	// método para identificar um OrderStatus com um número code (private)
	private OrderStatus(int code) {
		this.code = code;
	}

	// método para retornar o número
	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {

		// percorrer valores do OrderStatus
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}

		throw new IllegalArgumentException("Invalid OrderStatus code");

	}
}
