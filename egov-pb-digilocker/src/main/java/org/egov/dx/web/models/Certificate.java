package org.egov.dx.web.models;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;

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
    
    
    @XmlAttribute
    public String getlanguage() {
        return language;
    }

    public void setlanguage(String language) {
        this.language = language;
    }
    
    @XmlAttribute
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    
    @XmlAttribute
    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
    
    @XmlAttribute
    public String getissueDate() {
        return issueDate;
    }

    public void setissueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    
 
    
    @XmlAttribute
    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }
}
