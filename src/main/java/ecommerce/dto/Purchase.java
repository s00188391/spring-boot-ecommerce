package ecommerce.dto;

import ecommerce.entity.Address;
import ecommerce.entity.Customer;
import ecommerce.entity.Order;
import ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
