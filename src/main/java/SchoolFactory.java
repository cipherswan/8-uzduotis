class SchoolFactory extends AbstractFactory {

    @Override
    public School getSchool(String school) {
        if(school == null){
            return null;
        }
        if(school.equalsIgnoreCase("Primary")){
            return new PrimarySchool();
        } else if(school.equalsIgnoreCase("Secondary")){
            return new SecondarySchool();
        } else if(school.equalsIgnoreCase("High")){
            return new HighSchool();
        }
        return null;
    }


    @Override
    public Rating getRating(String rating) {
        return null;
    }
}
