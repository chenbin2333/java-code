package cn.itsource.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *	2. Stream流【重点】
 *		1. 概念：就是java支持的一种流水线式处理数据的方式
 *		2. 作用：Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
 *			这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 
 			比如筛选， 排序，聚合等。
			聚合操作 类似SQL语句一样的操作， 
					比如filter, map, reduce, find, match, sorted等。
 *
 			
 *		3. 使用：
 *			流的数据来源：
 *					数据源 流的来源。 可以是集合，数组，I/O channel
 					（nio new IO非阻塞式IO）， 产生器generator【Random】 等。
 					
 *			获取Stream：方式 Collection体系下都有这两个方法（直接通过集合对象调用方法获取即可）
 *				1. stream() − 为集合创建串行流。【线程是安全的】
				2. parallelStream() − 为集合创建并行流。【底层是多线程处理，线程不安全，可以设置线程。可以解决线程安全】
									【每次运行过程可能不同，但最终结果是相同】
			以后如果数据量大，且业务复杂，用并行，数据量少且业务简单，用串行。
			因为，并行分支fork和join合并也需要很多时间
	
		4. 常用方法：
			1. void forEach(Consumer<? super T> action) 对此流的每个元素执行操作。
			      返回值是void，只能放在流的最后一位
					public interface Consumer<T>是一个函数式接口
					使用方式，lambda，表示接受一个参数，并且处理完后没有返回值。
				  		void accept(T t) 对给定的参数执行此操作。  
			
			2. <R> Stream<R> map(Function<? super T,? extends R> mapper) 
		 		map方法，取出每一个元素操作（运算....）
				Function接口中方法: R apply(T t)
				
			3. long count()获取当前元素个数
			4. Stream<T> limit(long maxSize) 获取一个元素个数是maxSize个的Stream对象
			5. Stream<T> sorted() 元素必须是实现Comparable接口
					返回根据自然顺序排序的流，。  
			   Stream<T> sorted(Comparator<? super T> comparator) 
					返回根据定制顺序排序的流，。

			6. 将Stream流中的元素进行聚合操作
			  	<R,A> R collect(Collector<? super T,A,R> collector)  
			  
			  	获取一个Collector实现类对象方式：通过Collectors工具类中的方法:
					https://blog.csdn.net/sl1992/article/details/98900343
				
			  		将Stream流转换为集合对象
			  			static <T> Collector<T,?,List<T>> toList() 将流中的元素放到一个List集合
					将Stream流中元素按照字符串 拼接
		 				static Collector<CharSequence,?,String> joining(CharSequence delimiter)  
		 			将Stream流中元素分组
		 				static <T,K> Collector<T,?,Map<K,List<T>>> groupingBy(Function<? super T,? extends K> classifier)  	
		 			将Stream流中元素计算
			 			static <T,U,A,R> Collector<T,?,R> mapping
			 				(Function<? super T,? extends U> mapper, Collector<? super U,A,R> downstream)  
		 			将Stream流中元素按照指定业务缩容
		 				static <T> Collector<T,?,Optional<T>> reducing(BinaryOperator<T> op)  	
		 				
		 		例如：		
		  		List<T> list = collect(Collectors.toList());将流中 的元素再转换为集合
		 				
			7. Stream<T> distinct() 将流中元素去重,不保证顺序
			
			8. Stream<T> filter(Predicate<? super T> predicate) 
		 		将流中的元素按照指定的业务过滤，返回满足条件的流对象  
		 			public interface Predicate<T>是函数式接口，
		 			抽象：boolean test(T t)  
		 			
		 	 以下几个方法自己扩展：
		 * 		boolean allMatch(Predicate<? super T> predicate)  
		 * 		<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)  
		 * 		Optional<T> reduce(BinaryOperator<T> accumulator)  一定要看
		 * 		T reduce(T identity, BinaryOperator<T> accumulator)  
 */
public class StreamTest {

	public static void main(String[] args) {
		// 将数组转换为集合	: Arrays工具类中方法：static <T>List<T> asList(T...a)
		List<Integer> list = Arrays.asList(1, 3, 69, 3, 69, 5, 9, 9, 996);
		
		// list调用stream方法，获取串行Stream流对象
		Stream<Integer> stream = list.stream();
		
		// Stream常用方法: Stream流要想使用流式编程或者链式编程，必须要求Stream调用方法返回值类型是Stream类型。
		/* 
		 * ==================================1==================================================
		 * 1. void forEach(Consumer<? super T> action) 遍历流Stream中的每一个元素
		 * 	public interface Consumer<T>是一个函数式接口，使用方式，lambda，
		 * 		void accept(T t) 表示接受一个参数t，并且处理完后没有返回值，一般用来打印看效果。
		 * 
		 *  forEach遍历流中的每一个元素,返回值是void，只能放在流的最后一位
		 */
//		stream.forEach(new Consumer<Integer>() {// Integer是流Stream中的元素类型，就是参数
//			@Override
//			public void accept(Integer t) {// t就是stream中每一个元素
//				// 表示将元素t每一个都打印出来
//				System.out.println(t);
//			}
//		});
		
		// lambda优化
//		stream.forEach(t -> System.out.println(t));// 在lambda表达式中 调用实例方法println()
		
		/*
		 * lambda优化3 现在满足实例方法调用的优化条件，可以有实例方法引用优化
		 * 	语法 ： 对象名::非静态方法名
		 * System.out是PrintStream类型的一个对象,是一个整体
		 * accept方法和println方法形参完全一致,并且accept方法的返回值是void，println方法返回值也是void，所以满足实例方法引用条件，简化
		 */
		// lambda优化2
//		stream.forEach(System.out :: println);// System.out :: println 相当于 t -> System.out.println(t)
		
		
		
		
		
		/*======================================2============================================
		 * 2. Stream map(Function mapper) 
		 * 	map方法，取出每一个元素操作（运算....）
		 * Function接口中方法: R apply(T t)	T是元素类型，R是返回值类型
		 */
		// 将stream流中每一个元素 求平方
//		stream.map(new Function<Integer, Integer>() {// 第一个Integer是Stream流中元素类型，第二个Integer是返回值类型
//			@Override
//			public Integer apply(Integer t) {// t表示每个元素
//				return t * t;
//			}
//		}).forEach(System.out :: println);// 调用完map方法后，直接流式编程forEach，打印输出
		
		// lambda优化代码
//		stream.map(t -> t * t).forEach(System.out :: println);// 调用完map方法后，直接流式编程forEach，打印输出
		
		
		
		
		/*======================================3============================================
		 * 3.long count()获取当前元素个数
		 */
//		long count = stream.count();// 返回值是Stream才能继续调用Stream中的方法
//		System.out.println("元素个数：" + count);
		
		
		
		
		
		
		
		
		/*====================================== 4 ============================================
		 * 4. Stream<T> limit(long maxSize)  	limit:限定
		 * 	获取一个元素个数是maxSize个的Stream对象【对于截取元素是有效的 、也可以对生成的Stream个数限制】
		 */
		// 通过stream对象直接调用limit方法
//		stream.limit(3)// 截取Stream中3个元素
//			.forEach(System.out :: println);// 调用完limit方法后，直接流式编程forEach，打印输出
		
		// 创建一个Random随机数对象
		Random random = new Random();
		
		// 通过random对象 调用ints()获取一个无限个数 随机数
		IntStream ints = random.ints();
		// 直接遍历ints流
//		ints.forEach(System.out :: println);
		
//		ints.limit(6)// 调用limit方法，限制流元素个数为6个，然后直接foreach打印
//			.forEach(System.out :: println);
		
		
		
		
		
		
		/*======================================5============================================
		 * 5. Stream<T> sorted() 【元素必须是实现Comparable接口】自然排序
				返回根据自然顺序排序的流。  
				
			  Stream<T> sorted(Comparator<? super T> comparator) 【该方法只有Stream中才有】
				返回根据定制顺序排序的流，。
		 */
//		stream.sorted()// 将流中元素自然排序
//			.forEach(System.out :: println);
			 
			
		
		
		
		
		/*======================================7============================================
		 * 6. 
		 * Stream<T> distinct() 将流中元素去重,不保证顺序
		 * 判断重复元素的依据：1. hashCode	2. equals
		 */
//		stream
//			.distinct()// 将stream中元素去重
//			.sorted()// 将流中元素自然排序
//			.forEach(System.out :: println);
			
				
				
				
				
				
				
		/*======================================7============================================
		 * 7. 
		 * Stream<T> filter(Predicate<? super T> predicate) 	Predicate:断言
		 * 	将流中的元素按照指定的业务过滤，返回满足条件的流对象  
		 * public interface Predicate<T>是函数式接口，
		 * 	抽象：boolean test(T t)   T是流中的元素类型,t就是流中元素
		 */
//		stream.filter(new Predicate<Integer>() {// 匿名内部类
//			@Override
//			public boolean test(Integer t) {// t表示stream中元素
//				// 需求：过滤 > 10的所有元素
//				return t > 10;// false表示不满足条件
//			}
//		}).forEach(System.out :: println);// 打印输出
		
		// lambda优化	
//		stream.filter(t -> t > 10).forEach(System.out :: println);// 打印输出
				
				
				
				
				
				
		/*======================================6============================================
		 * 8. 【注意：该方法中函数式接口Collector是通过工具类Collectors调用方法获取，而不是new创建】
		 * 	<R,A> R collect(Collector<? super T,A,R> collector)  collect：聚集
		 * 	Collector函数式接口获取的方式
		 * 		collect(Collectors.toList());将流中 的元素再转换为集合
		 * 
		 * 	获取一个Collector实现类对象方式：通过Collectors工具类中的方法
		 * 		static <T> Collector<T,?,List<T>> toList() 将流中的元素放到一个List集合
		 */
		// 需求：将Stream流对象转换为List集合
//		List<Integer> collect = stream.collect(Collectors.toList());// Collectors.toList()方法返回值类型是Collector，就是将Stream转换为List集合了
//		System.out.println(collect);
		
		/*
		 * Collectors类中有方法：
		 * 合并，拼接
		 * static Collector<CharSequence,?,String> joining(CharSequence delimiter) 该方法要求元素必须是String类型
		 * 		CharSequence接口：String、StringBuilder、StringBuffer
		 */
		List<String> list2 = Arrays.asList("小吕", "波多宇航", "", "吉泽宇潇", "龟田某毅", "山本正浩", "");
		// 调用parallelStream方法获取并行流
		Stream<String> parallelStream = list2.parallelStream();
		// 需求：将parallelStream中元素进行拼接，用 =>拼接【注意：元素类型必须是String类型】
		String collect = parallelStream.collect(Collectors.joining(" => "));
		System.out.println(collect);
		
		
		/*
		 * 以下几个方法自己扩展：
		 * 		boolean allMatch(Predicate<? super T> predicate)  
		 * 		<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)  
		 * 		Optional<T> reduce(BinaryOperator<T> accumulator)  一定要看
		 * 		T reduce(T identity, BinaryOperator<T> accumulator)  
		 */

	}

}
