package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VaccinationCenter {
	private Center centerName;

	public VaccinationCenter(Center centerName) {
		super();
		this.centerName = centerName;
		}
	

	public Center getCenterName() {
		return centerName;
	}

@Autowired
	public void setCenterName(Center centerName) {
		this.centerName = centerName;
	}


	public VaccinationCenter() {
	super();
	// TODO Auto-generated constructor stub
}


	@Override
	public String toString() {
		return "VaccinationCenter [centerName=" + centerName + "]";
	}

}
