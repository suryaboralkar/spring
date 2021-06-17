package springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("bridge")
	private String location;
	@Value("A87")
	private String buildingNo;
	public Address(String location, String buildingNo) {
		super();
		this.location = location;
		this.buildingNo = buildingNo;
	}
	
	public Address() {
		System.out.println("address ojected created");
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", buildingNo=" + buildingNo + "]";
	}
	



}
