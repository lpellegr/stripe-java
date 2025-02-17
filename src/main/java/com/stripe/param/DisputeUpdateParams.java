package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisputeUpdateParams extends ApiRequestParams {
  /**
   * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all
   * fields in the hash for review. The combined character count of all fields is limited to
   * 150,000.
   */
  @SerializedName("evidence")
  Evidence evidence;

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
   * A set of key-value pairs that you can attach to a dispute object. This can be useful for
   * storing additional information about the dispute in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Whether to immediately submit evidence to the bank. If `false`, evidence is staged on the
   * dispute. Staged evidence is visible in the API and Dashboard, and can be submitted to the bank
   * by making another request with this attribute set to `true` (the default).
   */
  @SerializedName("submit")
  Boolean submit;

  private DisputeUpdateParams(
      Evidence evidence,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Boolean submit) {
    this.evidence = evidence;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.submit = submit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Evidence evidence;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Boolean submit;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeUpdateParams build() {
      return new DisputeUpdateParams(
          this.evidence, this.expand, this.extraParams, this.metadata, this.submit);
    }

    /**
     * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all
     * fields in the hash for review. The combined character count of all fields is limited to
     * 150,000.
     */
    public Builder setEvidence(Evidence evidence) {
      this.evidence = evidence;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeUpdateParams#expand} for the field documentation.
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
     * DisputeUpdateParams#expand} for the field documentation.
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
     * DisputeUpdateParams#extraParams} for the field documentation.
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
     * See {@link DisputeUpdateParams#extraParams} for the field documentation.
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
     * DisputeUpdateParams#metadata} for the field documentation.
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
     * See {@link DisputeUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Whether to immediately submit evidence to the bank. If `false`, evidence is staged on the
     * dispute. Staged evidence is visible in the API and Dashboard, and can be submitted to the
     * bank by making another request with this attribute set to `true` (the default).
     */
    public Builder setSubmit(Boolean submit) {
      this.submit = submit;
      return this;
    }
  }

  public static class Evidence {
    /** Has a maximum character count of 20,000. */
    @SerializedName("access_activity_log")
    String accessActivityLog;

    @SerializedName("billing_address")
    String billingAddress;

    @SerializedName("cancellation_policy")
    String cancellationPolicy;

    /** Has a maximum character count of 20,000. */
    @SerializedName("cancellation_policy_disclosure")
    String cancellationPolicyDisclosure;

    /** Has a maximum character count of 20,000. */
    @SerializedName("cancellation_rebuttal")
    String cancellationRebuttal;

    @SerializedName("customer_communication")
    String customerCommunication;

    @SerializedName("customer_email_address")
    String customerEmailAddress;

    @SerializedName("customer_name")
    String customerName;

    @SerializedName("customer_purchase_ip")
    String customerPurchaseIp;

    @SerializedName("customer_signature")
    String customerSignature;

    @SerializedName("duplicate_charge_documentation")
    String duplicateChargeDocumentation;

    /** Has a maximum character count of 20,000. */
    @SerializedName("duplicate_charge_explanation")
    String duplicateChargeExplanation;

    @SerializedName("duplicate_charge_id")
    String duplicateChargeId;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Has a maximum character count of 20,000. */
    @SerializedName("product_description")
    String productDescription;

    @SerializedName("receipt")
    String receipt;

    @SerializedName("refund_policy")
    String refundPolicy;

    /** Has a maximum character count of 20,000. */
    @SerializedName("refund_policy_disclosure")
    String refundPolicyDisclosure;

    /** Has a maximum character count of 20,000. */
    @SerializedName("refund_refusal_explanation")
    String refundRefusalExplanation;

    @SerializedName("service_date")
    String serviceDate;

    @SerializedName("service_documentation")
    String serviceDocumentation;

    @SerializedName("shipping_address")
    String shippingAddress;

    @SerializedName("shipping_carrier")
    String shippingCarrier;

    @SerializedName("shipping_date")
    String shippingDate;

    @SerializedName("shipping_documentation")
    String shippingDocumentation;

    @SerializedName("shipping_tracking_number")
    String shippingTrackingNumber;

    @SerializedName("uncategorized_file")
    String uncategorizedFile;

    /** Has a maximum character count of 20,000. */
    @SerializedName("uncategorized_text")
    String uncategorizedText;

    private Evidence(
        String accessActivityLog,
        String billingAddress,
        String cancellationPolicy,
        String cancellationPolicyDisclosure,
        String cancellationRebuttal,
        String customerCommunication,
        String customerEmailAddress,
        String customerName,
        String customerPurchaseIp,
        String customerSignature,
        String duplicateChargeDocumentation,
        String duplicateChargeExplanation,
        String duplicateChargeId,
        Map<String, Object> extraParams,
        String productDescription,
        String receipt,
        String refundPolicy,
        String refundPolicyDisclosure,
        String refundRefusalExplanation,
        String serviceDate,
        String serviceDocumentation,
        String shippingAddress,
        String shippingCarrier,
        String shippingDate,
        String shippingDocumentation,
        String shippingTrackingNumber,
        String uncategorizedFile,
        String uncategorizedText) {
      this.accessActivityLog = accessActivityLog;
      this.billingAddress = billingAddress;
      this.cancellationPolicy = cancellationPolicy;
      this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
      this.cancellationRebuttal = cancellationRebuttal;
      this.customerCommunication = customerCommunication;
      this.customerEmailAddress = customerEmailAddress;
      this.customerName = customerName;
      this.customerPurchaseIp = customerPurchaseIp;
      this.customerSignature = customerSignature;
      this.duplicateChargeDocumentation = duplicateChargeDocumentation;
      this.duplicateChargeExplanation = duplicateChargeExplanation;
      this.duplicateChargeId = duplicateChargeId;
      this.extraParams = extraParams;
      this.productDescription = productDescription;
      this.receipt = receipt;
      this.refundPolicy = refundPolicy;
      this.refundPolicyDisclosure = refundPolicyDisclosure;
      this.refundRefusalExplanation = refundRefusalExplanation;
      this.serviceDate = serviceDate;
      this.serviceDocumentation = serviceDocumentation;
      this.shippingAddress = shippingAddress;
      this.shippingCarrier = shippingCarrier;
      this.shippingDate = shippingDate;
      this.shippingDocumentation = shippingDocumentation;
      this.shippingTrackingNumber = shippingTrackingNumber;
      this.uncategorizedFile = uncategorizedFile;
      this.uncategorizedText = uncategorizedText;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accessActivityLog;

      private String billingAddress;

      private String cancellationPolicy;

      private String cancellationPolicyDisclosure;

      private String cancellationRebuttal;

      private String customerCommunication;

      private String customerEmailAddress;

      private String customerName;

      private String customerPurchaseIp;

      private String customerSignature;

      private String duplicateChargeDocumentation;

      private String duplicateChargeExplanation;

      private String duplicateChargeId;

      private Map<String, Object> extraParams;

      private String productDescription;

      private String receipt;

      private String refundPolicy;

      private String refundPolicyDisclosure;

      private String refundRefusalExplanation;

      private String serviceDate;

      private String serviceDocumentation;

      private String shippingAddress;

      private String shippingCarrier;

      private String shippingDate;

      private String shippingDocumentation;

      private String shippingTrackingNumber;

      private String uncategorizedFile;

      private String uncategorizedText;

      /** Finalize and obtain parameter instance from this builder. */
      public Evidence build() {
        return new Evidence(
            this.accessActivityLog,
            this.billingAddress,
            this.cancellationPolicy,
            this.cancellationPolicyDisclosure,
            this.cancellationRebuttal,
            this.customerCommunication,
            this.customerEmailAddress,
            this.customerName,
            this.customerPurchaseIp,
            this.customerSignature,
            this.duplicateChargeDocumentation,
            this.duplicateChargeExplanation,
            this.duplicateChargeId,
            this.extraParams,
            this.productDescription,
            this.receipt,
            this.refundPolicy,
            this.refundPolicyDisclosure,
            this.refundRefusalExplanation,
            this.serviceDate,
            this.serviceDocumentation,
            this.shippingAddress,
            this.shippingCarrier,
            this.shippingDate,
            this.shippingDocumentation,
            this.shippingTrackingNumber,
            this.uncategorizedFile,
            this.uncategorizedText);
      }

      /** Has a maximum character count of 20,000. */
      public Builder setAccessActivityLog(String accessActivityLog) {
        this.accessActivityLog = accessActivityLog;
        return this;
      }

      public Builder setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
        return this;
      }

      public Builder setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
        this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setCancellationRebuttal(String cancellationRebuttal) {
        this.cancellationRebuttal = cancellationRebuttal;
        return this;
      }

      public Builder setCustomerCommunication(String customerCommunication) {
        this.customerCommunication = customerCommunication;
        return this;
      }

      public Builder setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
      }

      public Builder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
      }

      public Builder setCustomerPurchaseIp(String customerPurchaseIp) {
        this.customerPurchaseIp = customerPurchaseIp;
        return this;
      }

      public Builder setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
        return this;
      }

      public Builder setDuplicateChargeDocumentation(String duplicateChargeDocumentation) {
        this.duplicateChargeDocumentation = duplicateChargeDocumentation;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setDuplicateChargeExplanation(String duplicateChargeExplanation) {
        this.duplicateChargeExplanation = duplicateChargeExplanation;
        return this;
      }

      public Builder setDuplicateChargeId(String duplicateChargeId) {
        this.duplicateChargeId = duplicateChargeId;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeUpdateParams.Evidence#extraParams} for the field documentation.
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
       * See {@link DisputeUpdateParams.Evidence#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
      }

      public Builder setReceipt(String receipt) {
        this.receipt = receipt;
        return this;
      }

      public Builder setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setRefundPolicyDisclosure(String refundPolicyDisclosure) {
        this.refundPolicyDisclosure = refundPolicyDisclosure;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setRefundRefusalExplanation(String refundRefusalExplanation) {
        this.refundRefusalExplanation = refundRefusalExplanation;
        return this;
      }

      public Builder setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
        return this;
      }

      public Builder setServiceDocumentation(String serviceDocumentation) {
        this.serviceDocumentation = serviceDocumentation;
        return this;
      }

      public Builder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      public Builder setShippingCarrier(String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
        return this;
      }

      public Builder setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
        return this;
      }

      public Builder setShippingDocumentation(String shippingDocumentation) {
        this.shippingDocumentation = shippingDocumentation;
        return this;
      }

      public Builder setShippingTrackingNumber(String shippingTrackingNumber) {
        this.shippingTrackingNumber = shippingTrackingNumber;
        return this;
      }

      public Builder setUncategorizedFile(String uncategorizedFile) {
        this.uncategorizedFile = uncategorizedFile;
        return this;
      }

      /** Has a maximum character count of 20,000. */
      public Builder setUncategorizedText(String uncategorizedText) {
        this.uncategorizedText = uncategorizedText;
        return this;
      }
    }
  }
}
