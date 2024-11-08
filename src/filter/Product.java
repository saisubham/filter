package filter;

import java.util.Map;
import java.util.UUID;

public class Product {
    private String id;
    private Map<String, String> attributes;

    public Product(Map<String, String> attributes) {
        this.id = UUID.randomUUID().toString();
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
