package ecommerce.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import ecommerce.dto.PaymentInfo;
import ecommerce.dto.Purchase;
import ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
