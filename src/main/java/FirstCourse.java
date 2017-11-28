public class FirstCourse implements CafeteriaFood {

    @Override
    public String prepareFood() {
        return "Steak";
    }

    @Override
    public double foodPrice() {
        return 1.50;
    }
}
