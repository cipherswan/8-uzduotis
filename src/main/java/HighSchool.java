public class HighSchool implements School {

    private final String SNAME;
    public HighSchool() {
        SNAME = "High School";
    }

    @Override
    public String getSchoolName() {
        return SNAME;
    }
}
