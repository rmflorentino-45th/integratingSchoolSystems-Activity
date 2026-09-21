package schoolAdapters;

public class Main {

    public static void main(String[] args){
        GradingSystem usecase1 = new GradingSystem();
        LibrarySystem usecase2 = new LibrarySystem();
        AttendanceSystem usecase3 = new AttendanceSystem();

        GradingSystemAdapter translator1 = new GradingSystemAdapter(usecase1);
        LibrarySystemAdapter translator2 = new LibrarySystemAdapter(usecase2);
        AttendanceSystemAdapter translator3 = new AttendanceSystemAdapter(usecase3);

        translator1.integrateSystem();
        translator2.integrateSystem();
        translator3.integrateSystem();

    }   
    
}
