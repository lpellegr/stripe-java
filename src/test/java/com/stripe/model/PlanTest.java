package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class PlanTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/plans/gold");
    final Plan plan = ApiResource.GSON.fromJson(data, Plan.class);
    assertNotNull(plan);
    assertNotNull(plan.getId());
    assertEquals("plan", plan.getObject());
    assertNull(plan.getProductObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "product",
    };
    final String data = getFixture("/v1/plans/gold", expansions);
    final Plan plan = ApiResource.GSON.fromJson(data, Plan.class);
    assertNotNull(plan);
    final Product product = plan.getProductObject();
    assertNotNull(product);
    assertNotNull(product.getId());
    assertEquals(plan.getProduct(), product.getId());
  }

  @Test
  public void testDeserializeDecimalString() throws Exception {
    final String data = "{\"amount_precise\": \"0.000000123\"}";
    final Plan plan = ApiResource.GSON.fromJson(data, Plan.class);
    assertNotNull(plan);
    assertNotNull(plan.getAmountPrecise());
    assertTrue(new BigDecimal("0.000000123").equals(plan.getAmountPrecise()));
  }
}
