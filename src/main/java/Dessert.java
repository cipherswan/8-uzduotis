public class Dessert extends FoodDecorator {

    public Dessert(CafeteriaFood newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with ice cream";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+ 50;
    }
}
