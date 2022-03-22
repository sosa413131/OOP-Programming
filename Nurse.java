public class Nurse extends HospitalEmployee {
	
	int numOfPatients;
	
	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		this.numOfPatients=numOfPatients;
	}
	
    // Overriding toString() method of String class
    @Override
    public String toString() {
        return this.name + " "+ this.number + " has "+ this.numOfPatients +" patients.";
    }
    
    public void work() {
    	System.out.println(this.name + " works for the hospital. "+ this.name+ " is a nurse with "+ this.numOfPatients+" patients.");	
    }
}
