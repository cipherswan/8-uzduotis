public class PrimarySchool implements School {

    private final String SNAME;

    public PrimarySchool() {
        SNAME = "Primary school";
    }

    @Override
    public String getSchoolName() {
        return SNAME;
    }
}
