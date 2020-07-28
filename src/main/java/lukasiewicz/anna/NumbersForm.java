package lukasiewicz.anna;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


public class NumbersForm {
	
	@NotNull
	@Digits(integer=309,fraction=1074)
	private Double num1;
	
	@NotNull
	@Digits(integer=309,fraction=1074)
	private Double num2;

	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	

}
