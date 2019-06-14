// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class PlanCreateParams extends ApiRequestParams {
  /** Whether the plan is currently available for new subscriptions. Defaults to `true`. */
  @SerializedName("active")
  Boolean active;

  /**
   * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are
   * `sum` for summing up all usage during a period, `last_during_period` for picking the last usage
   * record reported within a period, `last_ever` for picking the last usage record ever (across
   * period bounds) or `max` which picks the usage record with the maximum reported usage during a
   * period. Defaults to `sum`.
   */
  @SerializedName("aggregate_usage")
  AggregateUsage aggregateUsage;

  /**
   * A positive integer in %s (or 0 for a free plan) representing how much to charge on a recurring
   * basis.
   */
  @SerializedName("amount")
  Long amount;

  @SerializedName("amount_precise")
  BigDecimal amountPrecise;

  /**
   * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit`
   * indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity`
   * (for plans with `usage_type=licensed`), or per unit of total usage (for plans with
   * `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a
   * tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
   */
  @SerializedName("billing_scheme")
  BillingScheme billingScheme;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

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
   * An identifier randomly generated by Stripe. Used to identify this plan when subscribing a
   * customer. You can optionally override this ID, but the ID must be unique across all plans in
   * your Stripe account. You can, however, use the same plan ID in both live and test modes.
   */
  @SerializedName("id")
  String id;

  /** Specifies billing frequency. Either `day`, `week`, `month` or `year`. */
  @SerializedName("interval")
  Interval interval;

  /**
   * The number of intervals between subscription billings. For example, `interval=month` and
   * `interval_count=3` bills every 3 months. Maximum of one year interval allowed (1 year, 12
   * months, or 52 weeks).
   */
  @SerializedName("interval_count")
  Long intervalCount;

  /**
   * A set of key-value pairs that you can attach to a plan object. It can be useful for storing
   * additional information about the plan in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A brief description of the plan, hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  @SerializedName("product")
  Object product;

  /**
   * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to
   * `tiered`. See also the documentation for `billing_scheme`.
   */
  @SerializedName("tiers")
  List<Tier> tiers;

  /**
   * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based
   * tiering, the maximum quantity within a period determines the per unit price, in `graduated`
   * tiering pricing can successively change as the quantity grows.
   */
  @SerializedName("tiers_mode")
  TiersMode tiersMode;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the billed price.
   * Cannot be combined with `tiers`.
   */
  @SerializedName("transform_usage")
  TransformUsage transformUsage;

  /**
   * Default number of trial days when subscribing a customer to this plan using
   * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
   */
  @SerializedName("trial_period_days")
  Long trialPeriodDays;

  /**
   * Configures how the quantity per period should be determined, can be either `metered` or
   * `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it to
   * a subscription, `metered` will aggregate the total usage based on usage records. Defaults to
   * `licensed`.
   */
  @SerializedName("usage_type")
  UsageType usageType;

  private PlanCreateParams(
      Boolean active,
      AggregateUsage aggregateUsage,
      Long amount,
      BigDecimal amountPrecise,
      BillingScheme billingScheme,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      String id,
      Interval interval,
      Long intervalCount,
      Map<String, String> metadata,
      String nickname,
      Object product,
      List<Tier> tiers,
      TiersMode tiersMode,
      TransformUsage transformUsage,
      Long trialPeriodDays,
      UsageType usageType) {
    this.active = active;
    this.aggregateUsage = aggregateUsage;
    this.amount = amount;
    this.amountPrecise = amountPrecise;
    this.billingScheme = billingScheme;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.id = id;
    this.interval = interval;
    this.intervalCount = intervalCount;
    this.metadata = metadata;
    this.nickname = nickname;
    this.product = product;
    this.tiers = tiers;
    this.tiersMode = tiersMode;
    this.transformUsage = transformUsage;
    this.trialPeriodDays = trialPeriodDays;
    this.usageType = usageType;
  }

  public static Builder builder() {
    return new com.stripe.param.PlanCreateParams.Builder();
  }

  public static class Builder {
    private Boolean active;

    private AggregateUsage aggregateUsage;

    private Long amount;

    private BigDecimal amountPrecise;

    private BillingScheme billingScheme;

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String id;

    private Interval interval;

    private Long intervalCount;

    private Map<String, String> metadata;

    private String nickname;

    private Object product;

    private List<Tier> tiers;

    private TiersMode tiersMode;

    private TransformUsage transformUsage;

    private Long trialPeriodDays;

    private UsageType usageType;

    /** Finalize and obtain parameter instance from this builder. */
    public PlanCreateParams build() {
      return new PlanCreateParams(
          this.active,
          this.aggregateUsage,
          this.amount,
          this.amountPrecise,
          this.billingScheme,
          this.currency,
          this.expand,
          this.extraParams,
          this.id,
          this.interval,
          this.intervalCount,
          this.metadata,
          this.nickname,
          this.product,
          this.tiers,
          this.tiersMode,
          this.transformUsage,
          this.trialPeriodDays,
          this.usageType);
    }

    /** Whether the plan is currently available for new subscriptions. Defaults to `true`. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are
     * `sum` for summing up all usage during a period, `last_during_period` for picking the last
     * usage record reported within a period, `last_ever` for picking the last usage record ever
     * (across period bounds) or `max` which picks the usage record with the maximum reported usage
     * during a period. Defaults to `sum`.
     */
    public Builder setAggregateUsage(AggregateUsage aggregateUsage) {
      this.aggregateUsage = aggregateUsage;
      return this;
    }

    /**
     * A positive integer in %s (or 0 for a free plan) representing how much to charge on a
     * recurring basis.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setAmountPrecise(BigDecimal amountPrecise) {
      this.amountPrecise = amountPrecise;
      return this;
    }

    /**
     * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit`
     * indicates that the fixed amount (specified in `amount`) will be charged per unit in
     * `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with
     * `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a
     * tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
     */
    public Builder setBillingScheme(BillingScheme billingScheme) {
      this.billingScheme = billingScheme;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PlanCreateParams#expand} for the field documentation.
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
     * PlanCreateParams#expand} for the field documentation.
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
     * PlanCreateParams#extraParams} for the field documentation.
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
     * See {@link PlanCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An identifier randomly generated by Stripe. Used to identify this plan when subscribing a
     * customer. You can optionally override this ID, but the ID must be unique across all plans in
     * your Stripe account. You can, however, use the same plan ID in both live and test modes.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** Specifies billing frequency. Either `day`, `week`, `month` or `year`. */
    public Builder setInterval(Interval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The number of intervals between subscription billings. For example, `interval=month` and
     * `interval_count=3` bills every 3 months. Maximum of one year interval allowed (1 year, 12
     * months, or 52 weeks).
     */
    public Builder setIntervalCount(Long intervalCount) {
      this.intervalCount = intervalCount;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PlanCreateParams#metadata} for the field documentation.
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
     * See {@link PlanCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** A brief description of the plan, hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    public Builder setProduct(Product product) {
      this.product = product;
      return this;
    }

    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /**
     * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PlanCreateParams#tiers} for the field documentation.
     */
    public Builder addTier(Tier element) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.add(element);
      return this;
    }

    /**
     * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PlanCreateParams#tiers} for the field documentation.
     */
    public Builder addAllTier(List<Tier> elements) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.addAll(elements);
      return this;
    }

    /**
     * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based
     * tiering, the maximum quantity within a period determines the per unit price, in `graduated`
     * tiering pricing can successively change as the quantity grows.
     */
    public Builder setTiersMode(TiersMode tiersMode) {
      this.tiersMode = tiersMode;
      return this;
    }

    /**
     * Apply a transformation to the reported usage or set quantity before computing the billed
     * price. Cannot be combined with `tiers`.
     */
    public Builder setTransformUsage(TransformUsage transformUsage) {
      this.transformUsage = transformUsage;
      return this;
    }

    /**
     * Default number of trial days when subscribing a customer to this plan using
     * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
     */
    public Builder setTrialPeriodDays(Long trialPeriodDays) {
      this.trialPeriodDays = trialPeriodDays;
      return this;
    }

    /**
     * Configures how the quantity per period should be determined, can be either `metered` or
     * `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it
     * to a subscription, `metered` will aggregate the total usage based on usage records. Defaults
     * to `licensed`.
     */
    public Builder setUsageType(UsageType usageType) {
      this.usageType = usageType;
      return this;
    }
  }

  public static class Product {
    /** Whether the product is currently available for purchase. Defaults to `true`. */
    @SerializedName("active")
    Boolean active;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The identifier for the product. Must be unique. If not provided, an identifier will be
     * randomly generated.
     */
    @SerializedName("id")
    String id;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to
     * `metadata`.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * A label that represents units of this product, such as seat(s), in Stripe and on customers’
     * receipts and invoices. Only available on products of type=`service`.
     */
    @SerializedName("unit_label")
    String unitLabel;

    private Product(
        Boolean active,
        Map<String, Object> extraParams,
        String id,
        Map<String, String> metadata,
        String unitLabel) {
      this.active = active;
      this.extraParams = extraParams;
      this.id = id;
      this.metadata = metadata;
      this.unitLabel = unitLabel;
    }

    public static Builder builder() {
      return new com.stripe.param.PlanCreateParams.Product.Builder();
    }

    public static class Builder {
      private Boolean active;

      private Map<String, Object> extraParams;

      private String id;

      private Map<String, String> metadata;

      private String unitLabel;

      /** Finalize and obtain parameter instance from this builder. */
      public Product build() {
        return new Product(this.active, this.extraParams, this.id, this.metadata, this.unitLabel);
      }

      /** Whether the product is currently available for purchase. Defaults to `true`. */
      public Builder setActive(Boolean active) {
        this.active = active;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PlanCreateParams.Product#extraParams} for the field documentation.
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
       * See {@link PlanCreateParams.Product#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The identifier for the product. Must be unique. If not provided, an identifier will be
       * randomly generated.
       */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PlanCreateParams.Product#metadata} for the field documentation.
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
       * See {@link PlanCreateParams.Product#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * A label that represents units of this product, such as seat(s), in Stripe and on customers’
       * receipts and invoices. Only available on products of type=`service`.
       */
      public Builder setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
        return this;
      }
    }
  }

  public static class Tier {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The flat billing amount for an entire tier, regardless of the number of units in the tier.
     */
    @SerializedName("flat_amount")
    Long flatAmount;

    /** The per unit billing amount for each individual unit for which this tier applies. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the
     * previous tier adding one. Use `inf` to define a fallback tier.
     */
    @SerializedName("up_to")
    Object upTo;

    private Tier(Map<String, Object> extraParams, Long flatAmount, Long unitAmount, Object upTo) {
      this.extraParams = extraParams;
      this.flatAmount = flatAmount;
      this.unitAmount = unitAmount;
      this.upTo = upTo;
    }

    public static Builder builder() {
      return new com.stripe.param.PlanCreateParams.Tier.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long flatAmount;

      private Long unitAmount;

      private Object upTo;

      /** Finalize and obtain parameter instance from this builder. */
      public Tier build() {
        return new Tier(this.extraParams, this.flatAmount, this.unitAmount, this.upTo);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PlanCreateParams.Tier#extraParams} for the field documentation.
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
       * See {@link PlanCreateParams.Tier#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The flat billing amount for an entire tier, regardless of the number of units in the tier.
       */
      public Builder setFlatAmount(Long flatAmount) {
        this.flatAmount = flatAmount;
        return this;
      }

      /** The per unit billing amount for each individual unit for which this tier applies. */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the
       * previous tier adding one. Use `inf` to define a fallback tier.
       */
      public Builder setUpTo(UpTo upTo) {
        this.upTo = upTo;
        return this;
      }

      /**
       * Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the
       * previous tier adding one. Use `inf` to define a fallback tier.
       */
      public Builder setUpTo(Long upTo) {
        this.upTo = upTo;
        return this;
      }
    }

    public enum UpTo implements ApiRequestParams.EnumParam {
      @SerializedName("inf")
      INF("inf");

      @Getter(onMethod_ = {@Override})
      private final String value;

      UpTo(String value) {
        this.value = value;
      }
    }
  }

  public static class TransformUsage {
    /** Divide usage by this number. */
    @SerializedName("divide_by")
    Long divideBy;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** After division, either round the result `up` or `down`. */
    @SerializedName("round")
    Round round;

    private TransformUsage(Long divideBy, Map<String, Object> extraParams, Round round) {
      this.divideBy = divideBy;
      this.extraParams = extraParams;
      this.round = round;
    }

    public static Builder builder() {
      return new com.stripe.param.PlanCreateParams.TransformUsage.Builder();
    }

    public static class Builder {
      private Long divideBy;

      private Map<String, Object> extraParams;

      private Round round;

      /** Finalize and obtain parameter instance from this builder. */
      public TransformUsage build() {
        return new TransformUsage(this.divideBy, this.extraParams, this.round);
      }

      /** Divide usage by this number. */
      public Builder setDivideBy(Long divideBy) {
        this.divideBy = divideBy;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PlanCreateParams.TransformUsage#extraParams} for the field documentation.
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
       * See {@link PlanCreateParams.TransformUsage#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** After division, either round the result `up` or `down`. */
      public Builder setRound(Round round) {
        this.round = round;
        return this;
      }
    }

    public enum Round implements ApiRequestParams.EnumParam {
      @SerializedName("down")
      DOWN("down"),

      @SerializedName("up")
      UP("up");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Round(String value) {
        this.value = value;
      }
    }
  }

  public enum AggregateUsage implements ApiRequestParams.EnumParam {
    @SerializedName("last_during_period")
    LAST_DURING_PERIOD("last_during_period"),

    @SerializedName("last_ever")
    LAST_EVER("last_ever"),

    @SerializedName("max")
    MAX("max"),

    @SerializedName("sum")
    SUM("sum");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AggregateUsage(String value) {
      this.value = value;
    }
  }

  public enum BillingScheme implements ApiRequestParams.EnumParam {
    @SerializedName("per_unit")
    PER_UNIT("per_unit"),

    @SerializedName("tiered")
    TIERED("tiered");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BillingScheme(String value) {
      this.value = value;
    }
  }

  public enum Interval implements ApiRequestParams.EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("month")
    MONTH("month"),

    @SerializedName("week")
    WEEK("week"),

    @SerializedName("year")
    YEAR("year");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Interval(String value) {
      this.value = value;
    }
  }

  public enum TiersMode implements ApiRequestParams.EnumParam {
    @SerializedName("graduated")
    GRADUATED("graduated"),

    @SerializedName("volume")
    VOLUME("volume");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TiersMode(String value) {
      this.value = value;
    }
  }

  public enum UsageType implements ApiRequestParams.EnumParam {
    @SerializedName("licensed")
    LICENSED("licensed"),

    @SerializedName("metered")
    METERED("metered");

    @Getter(onMethod_ = {@Override})
    private final String value;

    UsageType(String value) {
      this.value = value;
    }
  }
}
