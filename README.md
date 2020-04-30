实验目的，试验任务：

系统要求（所设计的系统必须包含以下四项内容）
1、利用字符串String及其方法对古诗做对齐处理
2、设计系统的输入/输出，把处理结果保存在文件中存储
3、包含异常处理结构
4、系统的界面采用二选一：
 1）使用GUI窗体界面，设计各组件，完成用户与系统的交互
 2）控制台（Console）

说明
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，达到如下功能：
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：

通过在控制台键盘输入或在GUI窗体中输入待处理的字符串：
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

输出：

在程序界面中输出结果，并把结果保存在文件中。

汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………

实验核心方法：

我认为本实验的核心方法是string buffer的运用。

string buffer是string的延申，本实验，整个插入和查找都是建立在string buffer上的。

核心代码及解释：



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


public class chg2 extends Exception {
    chg2(String s) {
        System.out.println(s);
    }
}

这里就是字符串输出。

定义一个类的继承异常，然后弄一个构造函数带参的。输出参数信息。

int x=0;
		int y=7;
		int p=7;
		int q=14;
		int m;
		String a[]=new String[34];

这里是插入标点符号的语句

 */
		for(int i=0;i<100;i++) {
			r1=string1.indexOf(string2);
			if(r1==-1)
				break;
			string1 = string1.substring(r1+1,string1.length()-1);
			s++;

循环，查找输入的字。



实验大概思路流程：


第一块主函数就是调用函数，实现功能

第二块 函数实现第一个功能，就是奇数逗号，偶数句号

三块，异常继承类，继承异常

第四块 就是查找子字符串，实现查找的功能



实验收获：

​    其实本次实验也确实让我看到了我在上学期学习中的不足，很多东西的学习都不是很好。这次可以说是这次再次实验，我学会了很多东西。字符串实验，也让我深入学习理解了上学期期末考试题string 和 string buffer的那道题。还有一些基础的问题，在学习了理论部分的内容结合实际应用，真正的用到了函数的调用等问题，就掌握的更好了，解决了很多上学期一流的问题。虽然本次实验的内容和上学期的实验内容像，当时在上次的实验中我是把要用的字符串编写到了代码中，这次在编写代码的过程中我应要求把这一串的字符串改成了后来输入，变化不是很大。
https://github.com/17330277925/-java-/blob/master/1.jpg
https://github.com/17330277925/-java-/blob/master/2.jpg
https://github.com/17330277925/-java-/blob/master/3.jpg
https://github.com/17330277925/-java-/blob/master/4.jpg
https://github.com/17330277925/-java-/blob/master/5.jpg
https://github.com/17330277925/-java-/blob/master/6.jpg
