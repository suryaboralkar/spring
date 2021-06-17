package springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Center {
     @Value("camp")
	private String name;
     @Value("area")
	private String location;
     @Value("7")
	private int noOfWorkers;
     @Value("covidshield")
	private String vaccineName;
	public Center() {
		System.out.println("center object created");
	}
	@Override
	public String toString() {
		return "Center [name=" + name + ", location=" + location + ", noOfWorkers=" + noOfWorkers + ", vaccineName="
				+ vaccineName + "]";
	}
	

}
