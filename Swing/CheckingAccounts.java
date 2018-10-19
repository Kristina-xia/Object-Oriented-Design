/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserProfileInformation;

/**
 *
 * @author qingchunxia
 */
public class CheckingAccounts {
    private String debt;
    private String credit;
    private String balance;
    private String activeOrNotActive;
    private String creationDate;
    public CheckingAccounts(){
    
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }



    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getActiveOrNotActive() {
        return activeOrNotActive;
    }

    public void setActiveOrNotActive(String activeOrNotActive) {
        this.activeOrNotActive = activeOrNotActive;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    
}
