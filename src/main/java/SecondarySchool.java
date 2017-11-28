public class SecondarySchool implements School {

    private final String SNAME;

    public SecondarySchool() {
        SNAME = "Secondary School";
    }

    @Override
    public String getSchoolName() {
        return SNAME;
    }
}
