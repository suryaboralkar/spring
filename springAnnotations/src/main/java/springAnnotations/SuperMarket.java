package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SuperMarket {
	@Value("more")
	private String name;
	@Autowired
	private Address address;
	@Value("25")
	private int noOfWorkers;
	@Value("10")
	private int noOfCounters;
	public SuperMarket(String name, Address address, int noOfWorkers, int noOfCounters) {
		super();
		this.name = name;
		this.address = address;
		this.noOfWorkers = noOfWorkers;
		this.noOfCounters = noOfCounters;
	}
	
	public SuperMarket() {
System.out.println("supermarket objected created");	}

	@Override
	public String toString() {
		return "SuperMarket [name=" + name + ", address=" + address + ", noOfWorkers=" + noOfWorkers + ", noOfCounters="
				+ noOfCounters + "]";
	}
	
	

}
