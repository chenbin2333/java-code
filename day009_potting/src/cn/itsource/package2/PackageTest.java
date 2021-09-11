package cn.itsource.package2;

//import java.sql.Date;
//import java.util.Date;
import java.util.*;

import cn.itsource.anonymous1.Student;// 我们将带有包的类名，称为：全限定类名
import cn.itsource.potting1.Account;

/**
 *	 2. 包 package
 	1. 概念：简单的理解就是一个文件夹
 	2. 作用：
 		1. 方便管理项目中的java代码
 		2. 可以避免类名冲突。
 		
 	3. 使用：(掌握)
 		1. 声明包语法：
			一般是公司域名反写.项目名.模块名字.子模块名
			包名是全英文，小写的
			例如 ： itsource.cn 域名
			package  cn.itsource.erp.oa.domain;自动化办公
			package  cn.itsource.erp.sa.entity; 系统管理
			注意：不要写成nc.
			
			
		2. 导入包语法：即使用别人写好的类
			语法：
				import 全限定包名.类名; 现在统统用快捷键： ctrl + shift + O
			例如:
				使用Arrays类
				import java.util.Arrays;
				
			特殊导包：在一个类中会用到同名不同包的类的时候必须使用全限定路径	
				例如：同时使用java.util.Date和java.sql.Date
			
			
	4. 注意事项：	
		1.	导入包的代码应该在声明包（就是该类所在的包）的后面，声明类的前面
		2.	import java.util.*;  表示导入本包中所有会使用到的，util包中的类；
			只会导入util包下面直接的类型，不包括util包的子包中的类型
    	3.	java.lang是核心包，下面的直接类型是自动导入的；
			例如：String、System类
    		lang包的子包中的类型不会自动导入，需要手动导入
   		
		
	5.  java/ javax(java增强包)【了解】
      	java.lang (java的核心包--基本包)
      	java.util(java的工具包 --集合框架ArrayList LinkedList)
        java.io(java IO包input-output 读写文件)
        java.net(网络编程) 
       	java.awt/javax.swing（java的图形化界面）坦克大战、打灰机、记事本、画图工具
		java.math 数学相关的包
		java.sql  数据库相关的包
		java.text 是文本格式化相关的包
		java.time 时间相关的包	
 */
public class PackageTest {

	public static void main(String[] args) {
		/*
		 *  需求：使用cn.itsource.anonymous1包中的Student类
		 *  当使用到一个类的时候，会优先从当前包中查找，这也是就近原则。
		 *  找不到就会报错： cannot be resolved to a type 就不能被识别为一个类，
		 *  这时就需要我们程序员告诉程序从哪里去找这个类，这就是导包。
		 *  导包的快捷键：Ctrl + shift + o【字母】
		 */
		new Student();// 当需要使用其他包中的类的时候，就需要导包
		
		/*
		 *  需求2：当我们需要使用两个同名不同包的类的时候，应该怎么做呢？
		 *  Date类型，在util包和sql包中，这个时候，我们必须使用全限定类名。
		 *  
		 */
		new java.sql.Date(1L);// 这里用sql包下的Date类
		new java.util.Date(1L);// 这里用util包下的Date类
		
		Arrays.sort(new int[]{1, 5, 2, 9});
		System.out.println(1);
		
		Account acc = new Account();
//		acc.name = "";
	}

}
