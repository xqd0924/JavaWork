package project5;

public class Song extends Car implements ICarry {
	public Song(int id,String name,int rental,int carry) {
		carId = id;
		carName = name;
		carRental = rental;
		carCarry = carry;
		
	}

	@Override
	public void icarry() {
		// TODO Auto-generated method stub
		System.out.println(carId+".\t"+carName+" \t"+carRental+"Ôª/Ìì"+"\t"+"   ÔØ»õ£º"+carCarry+"¶Ö");

	}

}
