
public class SchoolStaff {
	
	private void makeAnnouncements() {
		System.out.println("made announcements");
	}
	
	private void takeAttendence() {
		System.out.println("took attendance");
	}
	
	private void collectPaparWork() {
		System.out.println("collected paperwork");
	}
	
	private void conductHallwayDuties() {
		System.out.println("conducted hallway duties...");
	}
	
	public void perfomOtherResponsibilites() {
		makeAnnouncements();
		takeAttendence();
		collectPaparWork();
		conductHallwayDuties();
	}
	
}