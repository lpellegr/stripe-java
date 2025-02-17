package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SetupIntentCancelParams;
import com.stripe.param.SetupIntentConfirmParams;
import com.stripe.param.SetupIntentCreateParams;
import com.stripe.param.SetupIntentListParams;
import com.stripe.param.SetupIntentRetrieveParams;
import com.stripe.param.SetupIntentUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SetupIntent extends ApiResource implements HasId, MetadataStore<SetupIntent> {
  /** ID of the Connect application that created the SetupIntent. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or
   * `duplicate`.
   */
  @SerializedName("cancellation_reason")
  String cancellationReason;

  /**
   * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
   *
   * <p>The client secret can be used to complete payment setup from your frontend. It should not be
   * stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make sure that
   * you have TLS enabled on any page that includes the client secret.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * <p>If present, payment methods used with this SetupIntent can only be attached to this
   * Customer, and payment methods attached to other Customers cannot be used with this SetupIntent.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The error encountered in the previous SetupIntent confirmation. */
  @SerializedName("last_setup_error")
  StripeError lastSetupError;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If present, this property tells you what actions you need to take in order for your customer to
   * continue payment setup.
   */
  @SerializedName("next_action")
  NextAction nextAction;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /** The account (if any) for which the setup is intended. */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** ID of the payment method used with this SetupIntent. */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  /** Payment-method-specific configuration for this SetupIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** The list of payment method types (e.g. card) that this SetupIntent is allowed to set up. */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * [Status](https://stripe.com/docs/payments/intents#intent-statuses) of this SetupIntent, one of
   * `requires_payment_method`, `requires_confirmation`, `requires_action`, `processing`,
   * `canceled`, or `succeeded`.
   */
  @SerializedName("status")
  String status;

  /**
   * Indicates how the payment method is intended to be used in the future.
   *
   * <p>Use `on_session` if you intend to only reuse the payment method when the customer is in your
   * checkout flow. Use `off_session` if your customer may or may not be in your checkout flow. If
   * not provided, this value defaults to `off_session`.
   */
  @SerializedName("usage")
  String usage;

  /** Get id of expandable `application` object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded `application`. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `onBehalfOf` object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded `onBehalfOf`. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `paymentMethod` object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded `paymentMethod`. */
  public PaymentMethod getPaymentMethodObject() {
    return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
  }

  public void setPaymentMethodObject(PaymentMethod expandableObject) {
    this.paymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After the SetupIntent is created, attach a payment method and <a
   * href="/docs/api/setup_intents/confirm">confirm</a> to collect any required permissions to
   * charge the payment method later.
   */
  public static SetupIntent create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After the SetupIntent is created, attach a payment method and <a
   * href="/docs/api/setup_intents/confirm">confirm</a> to collect any required permissions to
   * charge the payment method later.
   */
  public static SetupIntent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_intents");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After the SetupIntent is created, attach a payment method and <a
   * href="/docs/api/setup_intents/confirm">confirm</a> to collect any required permissions to
   * charge the payment method later.
   */
  public static SetupIntent create(SetupIntentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After the SetupIntent is created, attach a payment method and <a
   * href="/docs/api/setup_intents/confirm">confirm</a> to collect any required permissions to
   * charge the payment method later.
   */
  public static SetupIntent create(SetupIntentCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_intents");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_intents");
    return ApiResource.requestCollection(url, params, SetupIntentCollection.class, options);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(SetupIntentListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(SetupIntentListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_intents");
    return ApiResource.requestCollection(url, params, SetupIntentCollection.class, options);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#setup_intent_object">SetupIntent</a> object reference for more details.
   */
  public static SetupIntent retrieve(String intent) throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#setup_intent_object">SetupIntent</a> object reference for more details.
   */
  public static SetupIntent retrieve(String intent, RequestOptions options) throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#setup_intent_object">SetupIntent</a> object reference for more details.
   */
  public static SetupIntent retrieve(
      String intent, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(intent)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SetupIntent.class, options);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code>
   * is provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="#setup_intent_object">SetupIntent</a> object reference for more details.
   */
  public static SetupIntent retrieve(
      String intent, SetupIntentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(intent)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SetupIntent.class, options);
  }

  /** Updates a SetupIntent object. */
  @Override
  public SetupIntent update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a SetupIntent object. */
  @Override
  public SetupIntent update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /** Updates a SetupIntent object. */
  public SetupIntent update(SetupIntentUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a SetupIntent object. */
  public SetupIntent update(SetupIntentUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the <code>succeeded</code> status.
   *
   * <p>Otherwise, it will transition to the <code>requires_action</code> status and suggest
   * additional actions via <code>next_action</code>. If setup fails, the SetupIntent will
   * transition to the <code>requires_payment_method</code> status.
   */
  public SetupIntent confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the <code>succeeded</code> status.
   *
   * <p>Otherwise, it will transition to the <code>requires_action</code> status and suggest
   * additional actions via <code>next_action</code>. If setup fails, the SetupIntent will
   * transition to the <code>requires_payment_method</code> status.
   */
  public SetupIntent confirm(RequestOptions options) throws StripeException {
    return confirm((Map<String, Object>) null, options);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the <code>succeeded</code> status.
   *
   * <p>Otherwise, it will transition to the <code>requires_action</code> status and suggest
   * additional actions via <code>next_action</code>. If setup fails, the SetupIntent will
   * transition to the <code>requires_payment_method</code> status.
   */
  public SetupIntent confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the <code>succeeded</code> status.
   *
   * <p>Otherwise, it will transition to the <code>requires_action</code> status and suggest
   * additional actions via <code>next_action</code>. If setup fails, the SetupIntent will
   * transition to the <code>requires_payment_method</code> status.
   */
  public SetupIntent confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s/confirm", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the <code>succeeded</code> status.
   *
   * <p>Otherwise, it will transition to the <code>requires_action</code> status and suggest
   * additional actions via <code>next_action</code>. If setup fails, the SetupIntent will
   * transition to the <code>requires_payment_method</code> status.
   */
  public SetupIntent confirm(SetupIntentConfirmParams params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the <code>succeeded</code> status.
   *
   * <p>Otherwise, it will transition to the <code>requires_action</code> status and suggest
   * additional actions via <code>next_action</code>. If setup fails, the SetupIntent will
   * transition to the <code>requires_payment_method</code> status.
   */
  public SetupIntent confirm(SetupIntentConfirmParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s/confirm", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /**
   * A SetupIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, setup is abandoned and any operations on the SetupIntent will fail with an
   * error.
   */
  public SetupIntent cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A SetupIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, setup is abandoned and any operations on the SetupIntent will fail with an
   * error.
   */
  public SetupIntent cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * A SetupIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, setup is abandoned and any operations on the SetupIntent will fail with an
   * error.
   */
  public SetupIntent cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A SetupIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, setup is abandoned and any operations on the SetupIntent will fail with an
   * error.
   */
  public SetupIntent cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  /**
   * A SetupIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, setup is abandoned and any operations on the SetupIntent will fail with an
   * error.
   */
  public SetupIntent cancel(SetupIntentCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A SetupIntent object can be canceled when it is in one of these statuses: <code>
   * requires_payment_method</code>, <code>requires_capture</code>, <code>requires_confirmation
   * </code>, <code>requires_action</code>.
   *
   * <p>Once canceled, setup is abandoned and any operations on the SetupIntent will fail with an
   * error.
   */
  public SetupIntent cancel(SetupIntentCancelParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/setup_intents/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SetupIntent.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    @SerializedName("redirect_to_url")
    NextActionRedirectToUrl redirectToUrl;

    /** Type of the next action to perform, one of `redirect_to_url` or `use_stripe_sdk`. */
    @SerializedName("type")
    String type;

    /**
     * When confirming a SetupIntent with Stripe.js, Stripe.js depends on the contents of this
     * dictionary to invoke authentication flows. The shape of the contents is subject to change and
     * is only intended to be used by Stripe.js.
     */
    @SerializedName("use_stripe_sdk")
    Map<String, Object> useStripeSdk;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextActionRedirectToUrl extends StripeObject {
    /**
     * If the customer does not exit their browser while authenticating, they will be redirected to
     * this specified URL after completion.
     */
    @SerializedName("return_url")
    String returnUrl;

    /** The URL you must redirect your customer to in order to authenticate. */
    @SerializedName("url")
    String url;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions extends StripeObject {
    @SerializedName("card")
    Card card;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and [other
       * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you wish
       * to request 3D Secure based on logic from your own fraud engine, provide this option.
       * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
       * Read our guide on [manually requesting 3D
       * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information on
       * how this configuration interacts with Radar and our SCA Engine.
       */
      @SerializedName("request_three_d_secure")
      String requestThreeDSecure;
    }
  }
}
