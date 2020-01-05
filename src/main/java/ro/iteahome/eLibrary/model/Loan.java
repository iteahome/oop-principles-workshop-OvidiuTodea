package ro.iteahome.eLibrary.model;

import java.util.List;

public class Loan {

    private int loanId;
    private List<Book> bookList;

    public Loan(int loanId, List<Book> bookList) {
        this.loanId = loanId;
        this.bookList = bookList;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
