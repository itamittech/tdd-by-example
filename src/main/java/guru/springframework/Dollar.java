package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar {

   private final int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    int times( int multiplier) {
       return  amount * multiplier;
    }
}
