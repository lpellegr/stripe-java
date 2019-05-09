// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CardCollectionCreateParams;
import com.stripe.param.CardCollectionListParams;
import com.stripe.param.CardCollectionRetrieveParams;
import java.util.Map;

public class CardCollection extends StripeCollection<Card> {
  /** Creates a new <code>Card</code> object for a recipient. */
  public Card create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Card</code> object for a recipient. */
  public Card create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /** Creates a new <code>Card</code> object for a recipient. */
  public Card create(CardCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Card</code> object for a recipient. */
  public Card create(CardCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /** Returns a list of cards for a recipient. */
  public CardCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of cards for a recipient. */
  public CardCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, CardCollection.class, options);
  }

  /** Returns a list of cards for a recipient. */
  public CardCollection list(CardCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of cards for a recipient. */
  public CardCollection list(CardCollectionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, CardCollection.class, options);
  }

  /**
   * You can always see the 10 most recent cards directly on a recipient; this method lets you
   * retrieve details about a specific card stored on the recipient.
   */
  public Card retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * You can always see the 10 most recent cards directly on a recipient; this method lets you
   * retrieve details about a specific card stored on the recipient.
   */
  public Card retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * You can always see the 10 most recent cards directly on a recipient; this method lets you
   * retrieve details about a specific card stored on the recipient.
   */
  public Card retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Card.class, options);
  }

  /**
   * You can always see the 10 most recent cards directly on a recipient; this method lets you
   * retrieve details about a specific card stored on the recipient.
   */
  public Card retrieve(String id, CardCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Card.class, options);
  }
}
