package RandomPractices;

import java.util.Comparator;
import java.util.Date;

public class ComparablePractice implements Comparable<ComparablePractice> {
    int transactionID;
    double amount;
    Date date;

    @Override
    public int compareTo(ComparablePractice o) {
        return Double.compare(this.amount,o.amount);
    }



}
