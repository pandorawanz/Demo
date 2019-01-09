package Product.model;

public class UpdateProductRequest {
    private String name;
    private String description;
    private long price;

    public UpdateProductRequest(String name, String desctiption, long price) {
        this.name = name;
        this.description = desctiption;
        this.price = price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}
