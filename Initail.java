package project5;
import java.util.Scanner;
import java.util.Arrays;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Audi(1,"奥迪A4",500,4);
		Car car2 = new Mazda(2,"马自达6",400,4);
		Pick car3 = new Pick(3,"皮卡雪6",450,4,2);
		Car car4 = new KingLong(4,"金龙",800,20);
		Car car5 = new Song(5,"松花江",400,4);
		Car car6 = new Iveco(6,"依维柯",1000,20);
		
		int i_finalPrice = 0;
		int i_finalPersonNum = 0;
		int i_finalGoodsNum = 0;
		StringBuffer buffer_sBusName = new StringBuffer();
		StringBuffer buffer_sTrunkName = new StringBuffer();
		
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("你是否要租车：1是 0否");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		if(key==1) {
			System.out.println("您可租车的类型及其价目表：");
			System.out.println("序号   \t汽车名称 \t租金\t   容量");
			car1.show();
			car2.show();
			car3.icarry();
			car4.show();
			car5.icarry();
			car6.icarry();
			System.out.println("请输入您要租汽车的数量：");
			int i_num = input.nextInt();
			int[] i_car = new int[i_num];
			for(int i=0;i<i_num;i++) {
				System.out.println("请输入第"+(i+1)+"辆车的序号：");				
				int i_key = input.nextInt();
				if(i_key>=1&&i_key<=6) {
					i_car[i] = i_key;
				}else {
					System.out.println("您输入的序号有误，请重新输入（1-6）：");
					i--;
				}
				
			}
			for(int i=0;i<i_car.length;i++) {
				switch(i_car[i]) {
				case 1:
					buffer_sBusName.append(car1.carName+" ");
					i_finalPrice += car1.carRental;
					i_finalPersonNum += car1.carCarry;
					break;
				case 2:
					buffer_sBusName.append(car2.carName+" ");
					i_finalPrice += car2.carRental;
					i_finalPersonNum += car2.carCarry;
					break;
				case 3:
					buffer_sBusName.append(car3.carName+" ");
					buffer_sTrunkName.append(car3.carName+" ");
					i_finalPrice += car3.carRental;
					i_finalPersonNum += car3.carCarry;
					i_finalGoodsNum += car3.carCarry2;
					break;
				case 4:
					buffer_sBusName.append(car4.carName+" ");
					i_finalPrice += car4.carRental;
					i_finalPersonNum += car4.carCarry;
					break;
				case 5:
					buffer_sTrunkName.append(car5.carName+" ");
					i_finalPrice += car5.carRental;
					i_finalGoodsNum += car5.carCarry;
					break;
				case 6:
					buffer_sTrunkName.append(car6.carName+" ");
					i_finalPrice += car6.carRental;
					i_finalGoodsNum += car6.carCarry;
					break;
					
				}
			}
			System.out.println("请输入租车天数：");			
			int days = input.nextInt();
			System.out.println("您的账单：\n***可载人的车有：");
			System.out.println(buffer_sBusName+"可载："+i_finalPersonNum+"人");
			System.out.println("载货的车有："+buffer_sTrunkName+"可载"+i_finalGoodsNum+"吨");
			System.out.println("***租车总费用："+i_finalPrice*days+"元");
			
			
		}else {
			System.out.println("退出");
			System.exit(0);
		}

	}

}
