public abstract class FoodDecorator implements CafeteriaFood{

    private CafeteriaFood newFood;

    public FoodDecorator(CafeteriaFood newFood) {
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double foodPrice() {
        return newFood.foodPrice();
    }
}
