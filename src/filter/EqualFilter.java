package filter;

public class EqualFilter implements Filter {

    private final String key;
    private final String value;

    public EqualFilter(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean check(Product product) {
        return product.getAttributes().getOrDefault(key, "").equals(value);
    }
}
