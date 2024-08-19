package com.example.order_service.exception;

public class OutOfStockException extends RuntimeException{
    public OutOfStockException(String stockIsNotEnough) {
        super(stockIsNotEnough);
    }
}
