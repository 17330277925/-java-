package zzq;

import java.util.Scanner;
public class chg1 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();//����һ��StringBuffer��
		Scanner scanner = new Scanner(System.in);
		s.append(scanner.next());  //����StringBuffer��ĳ��޸�
		chg3 c = new chg3();	//����һ��chg3��
		c.A(s);//Ϊ�����޸衷��Ӧ��λ�ü��ϱ����Ų���������Ľ��
		try {
			chg4 t= new chg4();//����һ��chg4��
			String s1 = s.toString();//��StringBufferת����string������chg4��ͳ��
			System.out.println("����Ҫ���ҵĺ��֣�");
			Scanner scanner1 = new Scanner(System.in);
			String a = scanner1.nextLine(); //��������ҵ���
			t.T(s1,a);
		}
		catch(chg2 e) {
			System.out.println("ͳ�Ƶĺ��ֲ����ڣ�");//�����ֲ�����������쳣
		}
	}

}