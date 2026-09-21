package schoolAdapters;

public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem grades;

    public GradingSystemAdapter(GradingSystem grades){
        this.grades = grades;
    }

    @Override
    public void integrateSystem() {
        grades.recordGrades();
    }

}