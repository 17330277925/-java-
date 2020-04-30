package zzq;

public class chg3 {
	public void A(StringBuffer s) {
		/*
		 * 以下为插入的标点符号的位置
		 */
		int x=0;
		int y=7;
		int p=7;
		int q=14;
		int m;
		String a[]=new String[34];
	/*
	 * 依次按要求插入标点符号
	 */
		for(int i=0;i<34;i=i+2) {
		a[i]=s.substring(x,y);
		m=i+1;
		a[m]=s.substring(p,q);
		System.out.print(a[i]+"，"+a[m]+"。"+"\n");
		x=x+14;
		y=y+14;
		p=p+14;
		q=q+14;
	}
	}
}