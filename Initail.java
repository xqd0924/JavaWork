package project5;
import java.util.Scanner;
import java.util.Arrays;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Audi(1,"�µ�A4",500,4);
		Car car2 = new Mazda(2,"���Դ�6",400,4);
		Pick car3 = new Pick(3,"Ƥ��ѩ6",450,4,2);
		Car car4 = new KingLong(4,"����",800,20);
		Car car5 = new Song(5,"�ɻ���",400,4);
		Car car6 = new Iveco(6,"��ά��",1000,20);
		
		int i_finalPrice = 0;
		int i_finalPersonNum = 0;
		int i_finalGoodsNum = 0;
		StringBuffer buffer_sBusName = new StringBuffer();
		StringBuffer buffer_sTrunkName = new StringBuffer();
		
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		if(key==1) {
			System.out.println("�����⳵�����ͼ����Ŀ��");
			System.out.println("���   \t�������� \t���\t   ����");
			car1.show();
			car2.show();
			car3.icarry();
			car4.show();
			car5.icarry();
			car6.icarry();
			System.out.println("��������Ҫ��������������");
			int i_num = input.nextInt();
			int[] i_car = new int[i_num];
			for(int i=0;i<i_num;i++) {
				System.out.println("�������"+(i+1)+"��������ţ�");				
				int i_key = input.nextInt();
				if(i_key>=1&&i_key<=6) {
					i_car[i] = i_key;
				}else {
					System.out.println("�����������������������루1-6����");
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
			System.out.println("�������⳵������");			
			int days = input.nextInt();
			System.out.println("�����˵���\n***�����˵ĳ��У�");
			System.out.println(buffer_sBusName+"���أ�"+i_finalPersonNum+"��");
			System.out.println("�ػ��ĳ��У�"+buffer_sTrunkName+"����"+i_finalGoodsNum+"��");
			System.out.println("***�⳵�ܷ��ã�"+i_finalPrice*days+"Ԫ");
			
			
		}else {
			System.out.println("�˳�");
			System.exit(0);
		}

	}

}
