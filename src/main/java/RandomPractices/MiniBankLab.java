package RandomPractices;

import java.awt.*;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniBankLab {
    public static  void main(String[] args) {
        List<Accounts> transactions = List.of(new Accounts(44.44, 123,  Date.from(Instant.from(LocalDate.of(2026, 11, 21).atStartOfDay(ZoneId.systemDefault()).toInstant()))),
                new Accounts(23.34, 122, Date.from(Instant.from(LocalDate.of(2027, 11, 21).atStartOfDay(ZoneId.systemDefault()).toInstant()))),
                new Accounts(29.43, 124, Date.from(Instant.from(LocalDate.of(2026, 11, 22).atStartOfDay(ZoneId.systemDefault()).toInstant()))),
                new Accounts(29.43, 126, Date.from(Instant.from(LocalDate.of(2025, 12, 21).atStartOfDay(ZoneId.systemDefault()).toInstant()))),
                new Accounts(28, 127, Date.from(Instant.from(LocalDate.of(2024, 11, 21).atStartOfDay(ZoneId.systemDefault()).toInstant()))),
                new Accounts(23.34, 128, Date.from(Instant.from(LocalDate.of(2023, 11, 21).atStartOfDay(ZoneId.systemDefault()).toInstant()))));

        List<Accounts> trx=new ArrayList<>(transactions);
        trx.sort(Comparator.comparing(Accounts::getAmount).thenComparing(Accounts::getDate));
        System.out.println("Custom Sorted transactions: "+trx);
        System.out.println("Now doing natural sorting by passing null");
       //// trx.sort(null);
        //System.out.println("Naural sorting " +trx);
    }
}