package dev.umang.paymentservicedec24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneratePaymentLinkRequestDto {
    public Long orderId;
}
