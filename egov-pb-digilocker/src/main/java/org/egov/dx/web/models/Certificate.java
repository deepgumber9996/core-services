package org.egov.dx.web.models;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@XmlRootElement
@XStreamAlias("Certificate")
public class Certificate {
	
	
    private IssuedBy issuedBy;
	
	
    private IssuedTo issuedTo;
	
	@XStreamAlias("CertificateData")
    private CertificateData certificateData;
	
    @Size(max=64)
    @XStreamAlias("Signature")
    private String signature;

 
    @XStreamAlias("language")
    private String language;
    
  
    @XStreamAlias("name")
    private String name;
    
  
    @XStreamAlias("type")
    private String type;
    
    @XStreamAlias("number")
    private String number;
    
 
    @XStreamAlias("prevNumber")
    private String prevNumber;
    

    @XStreamAlias("expiryDate")
    private String expiryDate;
    

    @XStreamAlias("validFromDate")
    private String validFromDate;
    

    @XStreamAlias("issuedAt")
    private String issuedAt;
    

    @XStreamAlias("issueDate")
    private String issueDate;
    
    
    @XStreamAlias("status")
    private String status;
    
    
   

}
