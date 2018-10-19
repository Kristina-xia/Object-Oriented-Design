/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserProfileInformation;
import java.util.*;
/**
 *
 * @author qingchunxia
 */
public class Person {
    public static List<Person> list=new ArrayList<Person>();
    private String lastName;
    private String firstName;
    private String sex;
    private String nationality;
    private String marriedOrNot;
    private LicenseData licenseData;
    private CreditCard creditCard;
    private Address address;
    private FinancialAccounts finanicalAccounts;
    private String picturePath;
    private Person spouse;
    public Person()
    {
        
    }
    public Person(String lastName,String firstName,String sex, String nationality,LicenseData licenseData,CreditCard creditCard,Address address,FinancialAccounts finanicalAccounts,String picturePath,Person spouse)
    {
        
        this.lastName=lastName;
        this.firstName=firstName;
        this.sex=sex;
        this.nationality=nationality;
        this.marriedOrNot=marriedOrNot;
        this.licenseData=licenseData;
        this.creditCard=creditCard;
        this.address=address;
        this.finanicalAccounts=finanicalAccounts;
        this.picturePath=picturePath;
        this.spouse=spouse;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public String getMarriedOrNot() {
        return marriedOrNot;
    }

    public void setMarriedOrNot(String marriedOrNot) {
        this.marriedOrNot = marriedOrNot;
    }
    
    
    public LicenseData getLicenseData()
    {
        return licenseData;
    }
    public CreditCard getCreditCard()
    {
        return creditCard;
    }
    public Address getAddress()
    {
        return address;
    }
    public FinancialAccounts getFinanicalAccounts()
    {
        return finanicalAccounts;
    }
    public String getPicturePath()
    {
        return picturePath;
    }
    public Person getSpouse()
    {
        return spouse;
    }
    public void setSpouse(Person spouse)
    {
        this.spouse=spouse;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setLicenseData(LicenseData licenseData) {
        this.licenseData = licenseData;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFinanicalAccounts(FinancialAccounts finanicalAccounts) {
        this.finanicalAccounts = finanicalAccounts;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
    

    /**
     * @param args the command line arguments
     */
  
    
}
