package ca.bc.gov.open.pssg.rsbc.dps.paymentservice;

import java.net.URL;

import ca.bc.gov.open.pssg.rsbc.dps.paymentservice.exception.PaymentServiceException;
import ca.bc.gov.open.pssg.rsbc.dps.paymentservice.types.SinglePaymentRequest;

/**
 * 
 * Payment Client interface
 * 
 * @author smillar
 *
 */
public interface PaymentClient {

	/**
	 * 
	 * Single Payment URL 
	 * 
	 * @param SinglePaymentRequest
	 * @return
	 * @throws PaymentServiceException
	 */
	public URL calculateSinglePaymentURL(SinglePaymentRequest spr)
			throws PaymentServiceException;

}

