package org.egov.dx.web.models;

import javax.xml.bind.annotation.XmlAttribute;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@XStreamAlias("organization")
public class Organization {
    @XStreamAsAttribute
    private String name;
    @XStreamAsAttribute
    private String code;
    @XStreamAsAttribute
    private String tin;
    @XStreamAsAttribute
    private String type;
    @XStreamAsAttribute
    private String uuid;
    
    private Address address;

    // Constructors, getters, and setters
    // ...

    // Getter and setter methods for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getuuid() {
        return uuid;
    }

    public void setuuid(String uuid) {
        this.uuid = uuid;
    }
}

