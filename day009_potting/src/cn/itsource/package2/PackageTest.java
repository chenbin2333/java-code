package cn.itsource.package2;

//import java.sql.Date;
//import java.util.Date;
import java.util.*;

import cn.itsource.anonymous1.Student;// ���ǽ����а�����������Ϊ��ȫ�޶�����
import cn.itsource.potting1.Account;

/**
 *	 2. �� package
 	1. ����򵥵�������һ���ļ���
 	2. ���ã�
 		1. ���������Ŀ�е�java����
 		2. ���Ա���������ͻ��
 		
 	3. ʹ�ã�(����)
 		1. �������﷨��
			һ���ǹ�˾������д.��Ŀ��.ģ������.��ģ����
			������ȫӢ�ģ�Сд��
			���� �� itsource.cn ����
			package  cn.itsource.erp.oa.domain;�Զ����칫
			package  cn.itsource.erp.sa.entity; ϵͳ����
			ע�⣺��Ҫд��nc.
			
			
		2. ������﷨����ʹ�ñ���д�õ���
			�﷨��
				import ȫ�޶�����.����; ����ͳͳ�ÿ�ݼ��� ctrl + shift + O
			����:
				ʹ��Arrays��
				import java.util.Arrays;
				
			���⵼������һ�����л��õ�ͬ����ͬ�������ʱ�����ʹ��ȫ�޶�·��	
				���磺ͬʱʹ��java.util.Date��java.sql.Date
			
			
	4. ע�����	
		1.	������Ĵ���Ӧ���������������Ǹ������ڵİ����ĺ��棬�������ǰ��
		2.	import java.util.*;  ��ʾ���뱾�������л�ʹ�õ��ģ�util���е��ࣻ
			ֻ�ᵼ��util������ֱ�ӵ����ͣ�������util�����Ӱ��е�����
    	3.	java.lang�Ǻ��İ��������ֱ���������Զ�����ģ�
			���磺String��System��
    		lang�����Ӱ��е����Ͳ����Զ����룬��Ҫ�ֶ�����
   		
		
	5.  java/ javax(java��ǿ��)���˽⡿
      	java.lang (java�ĺ��İ�--������)
      	java.util(java�Ĺ��߰� --���Ͽ��ArrayList LinkedList)
        java.io(java IO��input-output ��д�ļ�)
        java.net(������) 
       	java.awt/javax.swing��java��ͼ�λ����棩̹�˴�ս����һ������±�����ͼ����
		java.math ��ѧ��صİ�
		java.sql  ���ݿ���صİ�
		java.text ���ı���ʽ����صİ�
		java.time ʱ����صİ�	
 */
public class PackageTest {

	public static void main(String[] args) {
		/*
		 *  ����ʹ��cn.itsource.anonymous1���е�Student��
		 *  ��ʹ�õ�һ�����ʱ�򣬻����ȴӵ�ǰ���в��ң���Ҳ�Ǿͽ�ԭ��
		 *  �Ҳ����ͻᱨ�� cannot be resolved to a type �Ͳ��ܱ�ʶ��Ϊһ���࣬
		 *  ��ʱ����Ҫ���ǳ���Ա���߳��������ȥ������࣬����ǵ�����
		 *  �����Ŀ�ݼ���Ctrl + shift + o����ĸ��
		 */
		new Student();// ����Ҫʹ���������е����ʱ�򣬾���Ҫ����
		
		/*
		 *  ����2����������Ҫʹ������ͬ����ͬ�������ʱ��Ӧ����ô���أ�
		 *  Date���ͣ���util����sql���У����ʱ�����Ǳ���ʹ��ȫ�޶�������
		 *  
		 */
		new java.sql.Date(1L);// ������sql���µ�Date��
		new java.util.Date(1L);// ������util���µ�Date��
		
		Arrays.sort(new int[]{1, 5, 2, 9});
		System.out.println(1);
		
		Account acc = new Account();
//		acc.name = "";
	}

}
