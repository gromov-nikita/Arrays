import Generator.BigDecimalGen;
import Generator.*;
import java.math.BigDecimal;
import java.util.Arrays;

/*
Exercise 17: (5) Create and test a Generator for BigDecimal, and ensure that it works
with the Generated methods.
 */
public class Runner {
    public static void main(String[] args) {
        BigDecimalGen obj = new BigDecimalGen();
        BigDecimal[] arr = Generated.array(new BigDecimal[20],obj);
        System.out.println(Arrays.toString(arr));
    }
}
