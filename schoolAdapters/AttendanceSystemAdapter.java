package schoolAdapters;

public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem system) {
        this.attendanceSystem = system;
    }

    @Override
    public void integrateSystem() {           
        attendanceSystem.markAttendance();    
    }
}