public class Doctor extends HospitalEmployee {
	
	protected String specialty;
	
	public Doctor(String name, int number, String specialty) {
		super(name, number);
		this.specialty=specialty;
	}
	
    // Overriding toString() method of String class
    @Override
    public String toString() {
        return this.name + " "+ this.number +" "+ this.specialty;
    }
    
    public void work() {
    	System.out.println(this.name + " works for the hospital. "+ this.name+ " is a(n) "+ this.specialty+" doctor.");	
    }
}
