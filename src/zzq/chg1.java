package zzq;

import java.util.Scanner;
public class chg1 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();//定义一个StringBuffer类
		Scanner scanner = new Scanner(System.in);
		s.append(scanner.next());  //输入StringBuffer类的长恨歌
		chg3 c = new chg3();	//定义一个chg3类
		c.A(s);//为《长恨歌》对应的位置加上标点符号并输出加入后的结果
		try {
			chg4 t= new chg4();//定义一个chg4类
			String s1 = s.toString();//将StringBuffer转换成string，方便chg4的统计
			System.out.println("输入要查找的汉字：");
			Scanner scanner1 = new Scanner(System.in);
			String a = scanner1.nextLine(); //输入带查找的字
			t.T(s1,a);
		}
		catch(chg2 e) {
			System.out.println("统计的汉字不存在！");//若汉字不存在则输出异常
		}
	}

}