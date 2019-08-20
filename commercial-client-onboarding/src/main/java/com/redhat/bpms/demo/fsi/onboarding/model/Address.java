package com.redhat.bpms.demo.fsi.onboarding.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Address")
public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ADDRESS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "ADDRESS_ID_SEQ", name = "ADDRESS_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "Street")
   private java.lang.String street;

   @org.kie.api.definition.type.Label(value = "Zipcode")
   private java.lang.String zipcode;

   @org.kie.api.definition.type.Label(value = "State")
   private java.lang.String state;

   @org.kie.api.definition.type.Label(value = "Country")
   private java.lang.String country;

   public Address()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getStreet()
   {
      return this.street;
   }

   public void setStreet(java.lang.String street)
   {
      this.street = street;
   }

   public java.lang.String getZipcode()
   {
      return this.zipcode;
   }

   public void setZipcode(java.lang.String zipcode)
   {
      this.zipcode = zipcode;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public Address(java.lang.Long id, java.lang.String street,
         java.lang.String zipcode, java.lang.String state,
         java.lang.String country)
   {
      this.id = id;
      this.street = street;
      this.zipcode = zipcode;
      this.state = state;
      this.country = country;
   }

}