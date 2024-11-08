package filter;

public class RangeFilter implements Filter {

    private final String key;
    private final int lowerLimit;
    private final int upperLimit;

    public RangeFilter(String key, int lowerLimit, int upperLimit) {
        this.key = key;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public boolean check(Product product) {
        String value = product.getAttributes().get(key);
        if (value == null) {
            return false;
        }
        int num = Integer.parseInt(value);
        return lowerLimit <= num && num <= upperLimit;
    }

}
