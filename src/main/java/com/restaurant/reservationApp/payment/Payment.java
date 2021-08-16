package com.restaurant.reservationApp.payment;

import com.restaurant.reservationApp.order.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "payments")
public class Payment {
    @Transient
    public static final String SEQUENCE_NAME = "payments_sequence";
    @Id
    private long id;
    private String paymentMethod;
    @DBRef
    private Order order;
    private double totalPrice;
}
