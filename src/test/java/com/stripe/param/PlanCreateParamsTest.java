package com.stripe.param;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.InvalidRequestException;
import com.stripe.net.LiveStripeResponseGetter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class PlanCreateParamsTest {

  @Test
  public void testSerializeDecimalString()
      throws UnsupportedEncodingException, InvalidRequestException {
    PlanCreateParams planCreateParams =
        PlanCreateParams.builder().setAmountPrecise(new BigDecimal("0.000000123")).build();

    String encoded = LiveStripeResponseGetter.createQuery(planCreateParams.toMap());
    assertEquals("amount_precise=0.000000123", encoded);
  }
}
