class FactoryCreator {

    public static AbstractFactory getFactory(String f){
        if(f.equalsIgnoreCase("School")){
            return new SchoolFactory();
        } else if(f.equalsIgnoreCase("Rating")){
            return new RatingFactory();
        }
        return null;
    }

}
