package ca.bc.gov.open.pssg.rsbc.dps.paymentservice.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeanstreamEndpointResponse {

    private String approved;
    private String declined;
    private String error;
    private String respMsg;
    private int respCode;

    public BeanstreamEndpointResponse(String approved, String declined, String error, String respMsg, int respCode) {
        this.approved = approved;
        this.declined = declined;
        this.error = error;
        this.respMsg = respMsg;
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }


    public int getRespCode() {
        return respCode;
    }


    public String getDeclined() {
        return declined;
    }


    public String getError() {
        return error;
    }


    public String getApproved() {
        return approved;
    }


}
