/**
 * The program is used to estimate the cost of a house
 * depending on the material used and and area 
 * @author manasa
 *
 */
public class CostEstimate {
	int material;
	double area;
	boolean automated;
	
	/**
	 * constructor for the CostEstimate class 
	 * @param material
	 * @param area
	 * @param automated
	 */
	public CostEstimate(int material,double area,boolean automated) {
		this.area=area;
		this.material=material;
		this.automated=automated;
	}
	
	/**
	 * calculate the cost of the house
	 * depending on the class instance data
	 * @return cost of the house(double datatype)
	 */
	public double findCost() {
		int cost = 0;
		if(material==0)
			cost = 1200;
		else if(material==1)
			cost = 1500;
		else if(material==2 && automated)
			cost = 2500;
		else
			cost = 1800;
		return area*cost;
	}
}
