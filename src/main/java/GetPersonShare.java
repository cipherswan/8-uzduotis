class GetPersonShare {

    static Person getPerson(String personType) {
        if(personType == null){
            return null;
        }
        if(personType.equalsIgnoreCase("teacher")) {
            return new TeacherPerson();
        }
        else if(personType.equalsIgnoreCase("janitor")){
            return new JanitorPerson();
        }
        else if(personType.equalsIgnoreCase("coach")) {
            return new CoachPerson();
        }
        return null;
    }
}
