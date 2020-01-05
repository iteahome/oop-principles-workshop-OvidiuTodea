package ro.iteahome.eLibrary.model;

import java.util.Date;

public class LoanDetails {
    private int loanId;
    private Date loanDate;
    private Date returnDate;
    private String status;

    public LoanDetails(int loanId, Date loanDate, Date returnDate, String status) {
        this.loanId = loanId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
