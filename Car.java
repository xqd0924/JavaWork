package project5;

public  class Car implements ICarry{
	public int carId;
	public String carName;
	public int carRental;
	public int carCarry;
	public int day;
	public int carNum;	
	
	public void show() {
		System.out.println(carId+".\t"+carName+" \t"+carRental+"Ԫ/��"+"\t"+"   ���ˣ�"+carCarry+"��");
	}

	@Override
	public void icarry() {
		// TODO Auto-generated method stub
		
	}

}
