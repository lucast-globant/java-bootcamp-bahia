package topic1;

public class Counter {
	
	private long sequentialNumber;

	public Counter() {
		this.sequentialNumber = 0;
	} 
	
	public Counter(long number) {
		this.sequentialNumber = number;
	} 
	
	public long get () {
		return sequentialNumber;
	}
	
	public long next () {
		sequentialNumber++;
		return sequentialNumber;
	}
	
}
