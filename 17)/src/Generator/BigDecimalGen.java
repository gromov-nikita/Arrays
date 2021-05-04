package Generator;

import java.math.BigDecimal;

public class BigDecimalGen implements Generator<BigDecimal> {
    private static double value = 0;
    @Override
    public BigDecimal next() {
        return new BigDecimal(value++);
    }
}
