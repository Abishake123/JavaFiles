public class Shop {


    private Integer id;

    private String shopName;

    

    public Shop() {
    }

    

    public Shop(Integer id, String shopName) {
        this.id = id;
        this.shopName = shopName;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }



    @Override
    public String toString() {
        return "Shop [id=" + id + ", shopName=" + shopName + "]";
    }

    
    
}
