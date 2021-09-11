package cn.itsource.reflect;

import java.lang.reflect.Method;

/**
 * 反射：
 *  语法使用：(重点)
			1. 获取字节码文件
				1. 
					1.1 Class clazz  = Class.forName(全限定路径名) (最多使用)默认就是调用下面的方法
					1.2 static 类<?> forName(String name, boolean initialize, ClassLoader loader)  
							name:全限定路径名
							initialize:表示是否初始化，默认是false
							loader：可以指定一个类加载器加载字节码文件
				
				2. 全限定类名.class	
				3. 对象名.getClass()
				
				Class类中方法newInstance()：创建当前字节码对象（只能调用无参且是public修饰的构造方法）
				
				
			2. 根据字节码文件获取构造方法、普通方法、字段等
				构造方法	获取构造方法的目的就是为了创建对象	创建对象的目的是：调用非静态的成员（成员变量、普通方法）
				Constructor[] constructors = clazz.getConstructors() 获取public修饰的构造方法数组
				Constructor[] constructors = clazz.getDeclaredConstructors() 获取任意权限的所有造方法数组
				Constructor constructor = clazz.getConstructor(Class 参数字节码）根据参数类型获取public修饰的指定的的构造方法
				Constructor constructor = clazz.getDeclearConstructor(Class  参数字节码) 获取任意访问权限指定的构造方法
		
				//通过构造方法对象去用构造方法创建对象 => 相当于new 一个对象
				Object instance  = constructor.newInstance(Object...实参);//可以创建任意访问权限的有参或者无参构造
		
				普通方法		获取普通方法的目的就是为了被 对象或者 类调用 执行
				Method[] methods = clazz.getMethods() 获取public修饰的构造方法数组,有父类中的方法
				Method[] methods = clazz.getDeclaredMethods() 获取任意访问权限所有造方法数组，并且都是自己的方法
				Method method = clazz.getMethod(String methodName,Class... 参数字节码）根据方法名和参数类型获取指定的的方法
					methodName:方法名
					Class：形参类型。如果方法没有形参，则Class可变参数不用写
				
				Method method = clazz.getDeclaredMethod(String methodName,Class... 参数字节码）根据方法名和参数类型获取指定的的方法
					methodName:方法名
					Class：形参类型。如果方法没有形参，则Class可变参数不用写
				
				//通过普通方法对象调用执行方法		获取普通方法的目的就是为了被 对象或者 类调用 执行
				method.invoke(Object obj，Object... args);
					obj：对象。如果是对象的方法，就传入一个当前字节码创建的对象，如果是static方法，则写null
					args：就是具体实参
				
				字段		获取字段 的目的就是为了被 对象或者 类  赋值取值
					Field[] fields = clazz.getFields() 获取public修饰的字段
					Field[] fields = clazz.getDeclaredFields() 获取任意权限所有字段
					Field field = clazz.getDeclaredField(String fieldName) 根据字段名获取任意访问权限的指定字段
					Field field = clazz.Field(String fieldName）根据字段名获取public的指定字段
				
				//通过当前的字段对象:	
					给某一个字段取值
				  	field.get(Object obj);//如果是属于非static，就传入一个对象，如果是静态的，就传入null
				  		obj：对象
					给某一个字段赋值
					field.set(Object obj, Object value);//如果是属于非static，就传入一个对象，如果是静态的，就传入null
				  		obj：对象
						value：值
				
				
 *			String getName()  获取全限定类名（全限定，包含包名）	Class类中方法
 *			String getSimpleName()   获取类名简称			Class类中方法
 *			Package getPackage()   获取包名				Class类中方法
 *			T newInstance()  根据当前字节码创建对应的对象		Class类中方法
 *
 *		注意：
 *			1. Class类中方法newInstance()：创建当前字节码对象（只能调用无参且是public修饰的构造方法）
 *			2. Constructor类中方法newInstance(Object 实参);//可以创建任意访问权限的有参或者无参构造
 *			3. 私有化方法、字段、构造方法都必须破坏封装才能使用：
 *				public void setAccessible(boolean flag) true表示破坏封装，false是不破坏
 *				
 *				是哪个private修饰的方法、字段、构造方法需要执行，就需要用这个对象破坏哪一个的封装
 *				例如：
 *					//获取cn.itsource.reflect.User字节码文件
 *					Class<?> clazz = Class.forName("cn.itsource.reflect.User");
 *					//获取User的有String参构造
 *					Constructor<?> constructor = clazz.getConstructor(String.class);
 *					//调用有参String构造，创建一个User对象
					Object newInstance = constructor.newInstance("某文");
					//获取private修饰的方法：testPrivate
					Method method2 = clazz.getDeclaredMethod("testPrivate");
					method2.setAccessible(true);//破坏普通方法Method封装
		
					//破坏封装后就可以执行了
					Object invoke2 = method2.invoke(newInstance);//没有形参就不用写
					System.out.println(invoke2);
					
 *			4. 调用static方法、字段：
 *				例如:
 *					Field field = clazz.getDeclaredField("country");//获取任意访问权限静态变量country
					field.set(null, "中国");//因为字段country是static修饰，所以不用对象调用，就传入null。字段country赋值：中文
					Object object = field.get(null);//字段country取值
					System.out.println(object);	
			
			5. 反射是在该类还没有设计好的时候，可以保证继续向后开发
			 	只是保证功能开发完成，运行的话就必须时候整个项目开发完毕才可以
			 	而项目真正运行的时候，肯定所有的项目中的类都已经设计完毕，这时候，就可以保证代码正常运行了	
			
	扩展：
		1. 反射里面的方法很多，很繁琐，有一个工具类Joor反射库，可以简化获取上面的操作	
		2. 看一下java内省
		3. 用反射优化简单工厂模式	
 */
public class ReflectTest2 {

	public static void main(String[] args) throws Exception {
		/*
		 * 1. 获取字节码文件(通过反射)
		 */
		// 1.1 Class clazz  = Class.forName(全限定路径名) (最多使用)默认就是调用下面的方法
		Class<?> clazz = Class.forName("cn.itsource.reflect.User");
		
		/*
		 * 2. 通过字节码文件获取普通方法
		 * 		Method[] methods = clazz.getMethods() 获取public修饰的普通方法数组,有父类中的方法
				Method[] methods = clazz.getDeclaredMethods() 获取任意访问权限所有普通方法数组，并且都是自己的方法
				Method method = clazz.getMethod(String methodName,Class... 参数字节码）根据方法名和参数类型获取指定的的方法
					methodName:方法名
					Class：形参类型。如果方法没有形参，则Class可变参数不用写
				
				Method method = clazz.getDeclaredMethod(String methodName,Class... 参数字节码）根据方法名和参数类型获取指定的的方法
					methodName:方法名
					Class：形参类型。如果方法没有形参，则Class可变参数不用写
		 */
		// Method[] methods = clazz.getMethods() 获取public修饰的普通方法数组,有父类中的方法
		Method[] methods = clazz.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		System.out.println("==========================================");
		// Method[] methods = clazz.getDeclaredMethods() 获取任意访问权限所有造方法数组，并且都是自己的方法
		Method[] methods2 = clazz.getDeclaredMethods();
//		for (Method method : methods2) {
//			System.out.println(method);
//		}
		System.out.println("==========================================");
		
		/*
		 * Method method = clazz.getMethod(String methodName,Class... 参数字节码）
		 * 根据方法名和参数类型获取指定的的方法
				methodName:方法名
				Class：形参类型。如果方法没有形参，则Class可变参数不用写
		 */
		// 获取public void test2(String str)有参普通方法
		Method method = clazz.getMethod("test2", String.class);
//		System.out.println("test2(String str)有参普通方法: " + method);
		
		/*
		 * Method method = clazz.getDeclaredMethod(String methodName,Class... 参数字节码）
		 * 根据方法名和参数类型获取指定的的方法
				methodName:方法名
				Class：形参类型。如果方法没有形参，则Class可变参数不用写
		 */
		// 获取private void testPrivate()普通方法
		Method method2 = clazz.getDeclaredMethod("testPrivate");// 没有形参就只写方法名,第二个参数不写
//		System.out.println("testPrivate()普通方法 : " + method2);
		
		// 获取public static void testStatic()普通静态方法
		Method method3 = clazz.getMethod("testStatic");// 没有形参就只写方法名,第二个参数不写
//		System.out.println("testStatic:    " + method3);
		
		/*
		 * 通过普通方法对象调用执行方法		获取普通方法的目的就是为了被 对象或者 类调用 执行
		 *	method.invoke(Object obj，Object... args);
		 *		obj：对象。如果是对象的方法，就传入一个当前字节码创建的对象，如果是static方法，则写null
		 *		args：就是具体实参
		 */
		// method执行invoke方法（method指的是：public void test2(String str)方法）该方法是非静态方法，需要创建对象执行
		// 通过字节码文件创建一个对象
		Object user = clazz.newInstance();// 字节码对象通过调用User类中无参构造创建对象
		method.invoke(user, "龙泽进进");// 通过method执行invoke方法，需要传入一个String类型的实参
		
		
		
		/*
		 * 通过method2执行invoke方法（method2指的是：private void testPrivate()）
		 * 	该方法是非静态方法，需要创建对象执行
		 * 	该方法是私有化方法，需要method2破坏封装才能执行
		 */
		method2.setAccessible(true);// method2破坏封装才能执行
		method2.invoke(user);// 通过method2执行invoke方法,无参方法，直接传入一个对象即可
		
		/*
		 * 通过method3执行invoke方法（method3指的是：public static void testStatic()普通静态方法）
		 * 	该方法是静态方法，不用创建对象执行，只需要将invoke方法第一个参数传入一个null即可
		 */
		method3.invoke(null);// 通过method3执行invoke方法,无参静态方法，直接在第一个参数位置传入一个null。
		
	}

}
