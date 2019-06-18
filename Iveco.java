package project5;

public class Iveco extends Car implements ICarry {
	public Iveco(int id,String name,int rental,int carry) {
		carId = id;
		carName = name;
		carRental = rental;
		carCarry = carry;
		
	}
	
	@Override
	public void icarry() {
		// TODO Auto-generated method stub
		System.out.println(carId+".\t"+carName+" \t"+carRental+"Ôª/Ìì"+"   ÔØ»õ£º"+carCarry+"¶Ö");

	}
}
