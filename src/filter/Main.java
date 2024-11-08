package filter;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FilterService fs = new FilterService();
        Product p1 = new Product(Map.of(
                "type", "mobile",
                "price", "1000"));
        Product p2 = new Product(Map.of(
                "type", "fruit",
                "color", "red"));
        EqualFilter typeEqFilter = new EqualFilter("type", "mobile");
        RangeFilter rangeFilter = new RangeFilter("price", 500, 5000);

        System.out.println(fs.filter(List.of(p1, p2), List.of(typeEqFilter, rangeFilter)));
    }
}
