public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
	    this.name = name;
	    this.price = price;
    }

    //getter
    public String getName() {
        return this.name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public double getPrice() {
        return this.price;
    }

    //setter
    public void setPrice(double price) {
        this.price = price;
    }
    //getter
    public int getIndex() {
        return this.index;
    }

    //setter
    public void setIndex(int index) {
        this.index = index;
    }

}