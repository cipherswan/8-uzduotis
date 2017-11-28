class RatingFactory extends AbstractFactory {

    @Override
    public School getSchool(String school) {
        return null;
    }

    @Override
    public Rating getRating(String rating) {
        if (rating == null) {
            return null;
        }
        if (rating.equalsIgnoreCase("Teaching")) {
            return new TeachingRating();
        } else if (rating.equalsIgnoreCase("Cafeteria")) {
            return new CafeteriaRating();
        }
        return null;
    }
}
