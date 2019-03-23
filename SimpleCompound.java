/**
 * program to find simple and compound intrest 
 * @author manasa
 *
 */
public class SimpleCompound {
	
	float principle,rateOfintrst,time;
	/**
	 * constructor initializes class data 
	 * @param principle
	 * @param rateOfIntrest
	 * @param time
	 */
	public SimpleCompound(float principle,float rateOfintrst,float time) {
		this.principle=principle;
		this.rateOfintrst=rateOfintrst;
		this.time=time;
	}
	/**
	 * finds simple intrest 
	 * @return double SI
	 */
	public double SimpleIntrest() {
		return (principle*time*rateOfintrst)/100;
	}
	/**
	 * finds compound intrest
	 * @return double CI
	 */
	public double CompoundIntrest() {
		return principle * 
                (Math.pow((1 + rateOfintrst / 100), time));
	}
}
