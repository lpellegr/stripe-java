package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class PaymentMethodCreateParams extends ApiRequestParams {
  /**
   * Billing information associated with the PaymentMethod that may be used or required by
   * particular types of payment methods.
   */
  @SerializedName("billing_details")
  BillingDetails billingDetails;

  /**
   * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards
   * compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay, Amex Express
   * Checkout, or legacy Checkout) into the card hash with format `card: {token: "tok_visa"}`. When
   * creating with a card number, you must meet the requirements for [PCI
   * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly recommend
   * using Stripe.js instead of interacting with this API directly.
   */
  @SerializedName("card")
  Object card;

  /** The `Customer` to whom the original PaymentMethod is attached. */
  @SerializedName("customer")
  String customer;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The PaymentMethod to share. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name
   * matching this value. It contains additional information specific to the PaymentMethod type.
   * Required unless `payment_method` is specified (see the [Shared
   * PaymentMethods](https://stripe.com/docs/payments/payment-methods/connect#shared-payment-methods)
   * guide)
   */
  @SerializedName("type")
  Type type;

  private PaymentMethodCreateParams(
      BillingDetails billingDetails,
      Object card,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String paymentMethod,
      Type type) {
    this.billingDetails = billingDetails;
    this.card = card;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingDetails billingDetails;

    private Object card;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String paymentMethod;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodCreateParams build() {
      return new PaymentMethodCreateParams(
          this.billingDetails,
          this.card,
          this.customer,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentMethod,
          this.type);
    }

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    public Builder setBillingDetails(BillingDetails billingDetails) {
      this.billingDetails = billingDetails;
      return this;
    }

    /**
     * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards
     * compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay, Amex
     * Express Checkout, or legacy Checkout) into the card hash with format `card: {token:
     * "tok_visa"}`. When creating with a card number, you must meet the requirements for [PCI
     * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly
     * recommend using Stripe.js instead of interacting with this API directly.
     */
    public Builder setCard(CardDetails card) {
      this.card = card;
      return this;
    }

    /**
     * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards
     * compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay, Amex
     * Express Checkout, or legacy Checkout) into the card hash with format `card: {token:
     * "tok_visa"}`. When creating with a card number, you must meet the requirements for [PCI
     * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly
     * recommend using Stripe.js instead of interacting with this API directly.
     */
    public Builder setCard(Token card) {
      this.card = card;
      return this;
    }

    /** The `Customer` to whom the original PaymentMethod is attached. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The PaymentMethod to share. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the PaymentMethod
     * type. Required unless `payment_method` is specified (see the [Shared
     * PaymentMethods](https://stripe.com/docs/payments/payment-methods/connect#shared-payment-methods)
     * guide)
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  public static class BillingDetails {
    /** Billing address. */
    @SerializedName("address")
    Address address;

    /** Email address. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Full name. */
    @SerializedName("name")
    String name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    String phone;

    private BillingDetails(
        Address address, String email, Map<String, Object> extraParams, String name, String phone) {
      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public BillingDetails build() {
        return new BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Billing address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** Email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.BillingDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.BillingDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Full name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Billing phone number (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  public static class CardDetails {
    /** The card's CVC. It is highly recommended to always include this value. */
    @SerializedName("cvc")
    String cvc;

    /** Two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /** Four-digit number representing the card's expiration year. */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The card number, as a string without any separators. */
    @SerializedName("number")
    String number;

    private CardDetails(
        String cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, String number) {
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String cvc;

      private Long expMonth;

      private Long expYear;

      private Map<String, Object> extraParams;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public CardDetails build() {
        return new CardDetails(
            this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
      }

      /** The card's CVC. It is highly recommended to always include this value. */
      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      /** Two-digit number representing the card's expiration month. */
      public Builder setExpMonth(Long expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      /** Four-digit number representing the card's expiration year. */
      public Builder setExpYear(Long expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The card number, as a string without any separators. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  public static class Token {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("token")
    String token;

    private Token(Map<String, Object> extraParams, String token) {
      this.extraParams = extraParams;
      this.token = token;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String token;

      /** Finalize and obtain parameter instance from this builder. */
      public Token build() {
        return new Token(this.extraParams, this.token);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setToken(String token) {
        this.token = token;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("card")
    CARD("card"),

    @SerializedName("card_present")
    CARD_PRESENT("card_present");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
