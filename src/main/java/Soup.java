public class Soup extends FoodDecorator {

    public Soup(CafeteriaFood newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+ " with gazpacho";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 20;
    }
}
