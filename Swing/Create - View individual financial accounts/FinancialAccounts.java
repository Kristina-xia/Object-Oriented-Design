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
public class FinancialAccounts {
    private CheckingAccounts checkingAccounts;
    private SavingAccounts savingAccounts;
    public FinancialAccounts()
    {
        
    }
    public FinancialAccounts(CheckingAccounts checkingAccounts,SavingAccounts savingAccounts)
    {

        this.checkingAccounts=checkingAccounts;
        this.savingAccounts=savingAccounts;
    }
    public CheckingAccounts getCheckingAccounts()
    {
        return checkingAccounts;
    }
    public SavingAccounts getSavingAccounts()
    {
        return savingAccounts;
    }
    public void setCheckingAccounts(CheckingAccounts checkingAccounts) {
        this.checkingAccounts = checkingAccounts;
    }

    public void setSavingAccounts(SavingAccounts savingAccounts) {
        this.savingAccounts = savingAccounts;
    }
}
