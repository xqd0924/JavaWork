package project5;

public class Pick extends Car implements ICarry{
	public int carCarry2;
	public Pick(int id,String name,int rental,int carry,int carry2) {
		carId = id;
		carName = name;
		carRental = rental;
		carCarry = carry;
		carCarry2 = carry2;		
	}


	@Override
	public void icarry() {
		// TODO Auto-generated method stub
		System.out.println(carId+".\t"+carName+" \t"+carRental+"Ԫ/��"+"\t"+"   ���ˣ�"+carCarry+" �ػ���"+carCarry2+"��");
	}
}
