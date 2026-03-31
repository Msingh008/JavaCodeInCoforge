package RandomPractices;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Accounts implements  Comparable<Accounts>{
    double amount;
    int transactionId;
    Date transactionDate;
    Accounts (double amount,int transactionId,Date transactionDate){
       this.amount=amount;
       this.transactionDate=transactionDate;
       this.transactionId=transactionId;
    };

    @Override
    public int compareTo(Accounts e){
        return Double.compare(this.amount,e.amount);
    }
    @Override
    public String toString(){
        return "{ Amount = "+this.amount+
                ",TransactionId = "+this.transactionId+
                ",Date "+this.transactionDate+" }";
    }
    public double getAmount(){
        return this.amount;
    }

    public Date getDate(){
        return this.transactionDate;
    }
}
