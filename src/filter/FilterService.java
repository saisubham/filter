package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterService {

    public List<Product> filter(List<Product> products, List<Filter> filters) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            boolean take = true;
            for (Filter filter : filters) {
                if (!filter.check(product)) {
                    take = false;
                    break;
                }
            }
            if (take) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

}
