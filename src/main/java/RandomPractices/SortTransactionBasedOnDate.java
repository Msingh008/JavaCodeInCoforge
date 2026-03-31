package RandomPractices;

import java.util.Comparator;

public class SortTransactionBasedOnDate implements Comparator<Accounts> {
    @Override
    public int compare(Accounts t1,Accounts t2){
        return t1.transactionDate.compareTo(t2.transactionDate);
    }
}
