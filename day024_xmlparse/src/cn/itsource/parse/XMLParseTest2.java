package cn.itsource.parse;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *	解析XML步骤：
			1. 在项目下创建一个lib文件夹folder
			2. 复制dom4j的jar包到lib文件夹中
			3. 选中jar右键buildpath
			4. 在测试类中使用dom4j解析XML。（今天开始学习别人的api）
			
	dom4j中使用到的方法：
		1.创建SaxReader对象
			SAXReader reader = new SAXReader();
		
		*******************************这是使用约束的用法************************************	
		2.设置命名空间	（如果XML使用约束的话必须要设置）【简化自定义命名空间使用过程】
			HashMap<String, String> hashMap = new HashMap<String, String>();
			map.put("myKey", "自定义命名空间名");// key的名字自己取
        	reader.getDocumentFactory().setXPathNamespaceURIs(map);	
		*******************************************************************	
		
		3. SAXReader对象调用read方法，将当前XML文件，转换为Document对象
			获取字节流InputStream
			用缓冲流包装一下InputStream
			Document document = reader.read(缓冲流);
			
		4. 获取根节点
			root = document.getRootElement();
			
		5. 通过父签添加子标签（元素）
			Element element = root.addElement("标签名");//返回值就是要添加的元素对象
			
			给子标签添加值
			element.setText("标签值");
			
		6. 给当前标签添加属性:xxx ，值是：xxx
			Element attribute = linkman.addAttribute("属性名","值");	
			
			通过当前元素获取属性对象
				element.attribute("属性名");
				
			通过属性对象attribute获取属性值
				attribute.setText("值");
				
			通过属性对象attribute获取属性值
				String 值 = attribute.getText();
			
		7. 获取当前元素标签名
				String name = e.getName();
				
			获取当前元素标签值
				String text = e.getText();
		
		8. 获取指定名字的子标签（元素）
		   	 	root.element(String name);	
		   	 	
		9. 获取所有子标签（元素）
		   	 	root.elements();	
			
		10. 删除子元素，必须通过父元素remove(子元素对象)完成	
				父元素.remove(子元素对象);
			
		10.在dom4j里面提供了两个方法，用来支持xpath
       　　　　	selectNodes("xpath表达式")，获取当前名字的多个节点
　　　　　　 	selectSingleNode("xpath表达式")，获取一个节点	
			【注意：】
				在多层级的xpath使用的语法：//命名空间:a[@id='b1']/命名空间:元素
			
		
	6. dom4j解析注意事项：
		1. 一定注意导包是dom4j下面的类

	dom4j解析：
			支持xpath解析，就可以可以直接输入一个路径查找：
			由于DOM4J在解析XML时只能一层一层解析，所以当XML文件层数过多时使用会很不方便，
			结合XPATH就可以直接获取到某个元素

		使用dom4j支持xpath的操作的几种主要形式
			https://blog.csdn.net/sidihuo/article/details/41310727
		   　　第一种形式
		        　　　　/a/b/c： 表示一层一层的，a下面 b下面的c
		    　  第二种形式
		       　　　　 //b： 表示和这个名称相同，表示只要名称是b，都得到
		         第三种形式
		        　　　　/* : 所有元素
		         第四种形式
		       　　　　a[1]：　表示第一个a元素
		        　  　　a[last()]：表示最后一个a元素
		         第五种形式
		        　　　　//a[@id]： 表示只要a元素上面有id属性，都得到
		         第六种形式
		        　　　　//自定义命名空间:a[@id='b1'] 表示元素名称是a,在a上面有id属性，并且id的属性值是b1【如果使用约束文件，则写自定义命名空间】
		        　　　　//a[@id='b1'] 表示元素名称是a,在a上面有id属性，并且id的属性值是b1【如果不使用约束文件】
		
				如果查询id属性值是b1的a元素下一级元素d，则可以这样写：
					//自定义命名空间:a[@id='b1']/自定义命名空间:d 表示元素名称是a,在a上面有id属性，并且id的属性值是b1【使用了约束文件，且属性值是：qualified】
					//a[@id='b1']/d 表示元素名称是a,在a上面有id属性，并且id的属性值是b1【如果不使用约束文件】
		
			使用dom4j支持xpath具体操作
		         默认的情况下，dom4j不支持xpath，如果想要在dom4j里面是有xpath，
		         第一步需要，引入支持xpath的jar包，如下：
				jaxen-1.1-beta-6.jar
		       
		         在dom4j里面提供了两个方法，用来支持xpath
		       　　　　selectNodes("xpath表达式")，获取多个节点
		　　　　　　selectSingleNode("xpath表达式")，获取一个节点

 */
public class XMLParseTest2 {
	/** 为了在下面的测试方法中都可以使用当前根元素，声明在成员变量位置，在before方法中赋值 */
	private Element contacts;
	private Document document;
	
	
	/**
	 * 将公共代码抽取到预执行方法中
	 */
	@Before
	public void before() {
		// 1. 创建SAXReader对象
		SAXReader reader = new SAXReader();
		// 使用自动关流语法try(){}
		try (
			// 2. 创建一个FileInputStream对象，赋值，参数：xml文件相对路径
			FileInputStream fis = new FileInputStream("src/cn/itsource/parse/contacts.xml"); // 区分之前资源文件解析方式，这里相对路径是从src开始的
			// 3. 创建一个BufferedInputStream缓冲流，提高读取效率
			BufferedInputStream buff = new BufferedInputStream(fis);
		) {
			/*
			 * 如果我们XML文件使用了约束，且属性elementFormDefault值是：qualified。则我们查询某一个元素的时候，
			 * 必须使用自定义命名空间，但是 单独使用自定义命名空间，太长了，麻烦，所以，我们通过下面的步骤简化操作，直接调用Map中的
			 * key代替。
			 */
//			HashMap<String, String> map = new HashMap<String, String>();
//			map.put("myKey", "http://itsource.cn");// key的名字自己取
//			reader.getDocumentFactory().setXPathNamespaceURIs(map);// 这一步相当于DOM4j启用命名空间的简化模式
			// 4. 通过reader调用read方法，获取Document文档树对象。传入参数buff
			document = reader.read(buff);
//			System.out.println(document);
			// 5. 获取根节点, document调用方法： getRootElement();
			contacts = document.getRootElement();// 这就是当前根元素contacts
//			System.out.println(contacts);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 查询 id="69"的linkman元素的子元素name的值 【使用约束文件】
	 */
	@Test
	public void testSearch2() {
		// 其他代码优化到before方法中
		// 6. 使用XPath解析，调用方法: selectSingleNode("xpath表达式")，获取一个节点
		Node name = contacts.selectSingleNode("//myKey:linkman[@id='69']/myKey:name");
		// 调用getText方法获取name的值
		System.out.println(name.getText());
	}

	/**
	 * 查询 id="69"的linkman元素的子元素name的值 【没有使用约束文件】
	 */
	@Test
	public void testSearch() {
		// 其他代码优化到before方法中
		// 6. 使用XPath解析，调用方法: selectSingleNode("xpath表达式")，获取一个节点
		Node name = contacts.selectSingleNode("//linkman[@id='69']/name");
		// 调用getText方法获取name的值
		System.out.println(name.getText());
	}

	/**
	 * 修改 id="69"的linkman元素的子元素group的值为：菊花伤集团 【没有使用约束文件】
	 */
	@Test
	public void testUpdate() {
		// 6. 使用XPath解析，调用方法: selectSingleNode("xpath表达式")，获取一个节点
		Node group = contacts.selectSingleNode("//linkman[@id='69']/group");
		// 7. 调用setText方法修改group的值：菊花伤
		group.setText("菊花残");
	}
	
	/**
	 * 添加linkman元素， 属性id=996，name：某飞扬、email：maihuochai@TokyoHot.com、address：成都某街、group：菊花台
	 * 	xml文件中添加元素必须通过父级元素完成，这里必须通过contacts完成，只不过，恰好contacts就是根元素
	 * 	用到的方法;
	 * 	5. 通过父签添加子标签（元素）
			Element element = root.addElement("标签名");// 返回值就是要添加的元素对象
			
			给子标签添加值
			element.setText("标签值");
			
		6. 给当前标签添加属性:xxx ，值是：xxx
			Element attribute = linkman.addAttribute("属性名","值");	
	 * 
	 */
	@Test 
	public void testAdd() {
		// 通过父元素root添加子元素：root.addElement("元素名");
		Element linkmanElement = contacts.addElement("linkman");
		// 通过linkmanElement调用： addAttribute("属性名","值");
		linkmanElement.addAttribute("id", "996");// 不需要返回值
		// 通过linkmanElement调用： addElement("元素名")，并且可以直接调用：setText("元素值");
		linkmanElement.addElement("name").setText("某飞扬");
		linkmanElement.addElement("email").setText("maihuochai@TokyoHot.com");
		linkmanElement.addElement("address").setText("成都某街");
		linkmanElement.addElement("group").setText("菊花台头牌");
	}
	
	/**
	 * 删除 属性id=996的linkman元素
	 * 在XML中必须通过父元素删除当前的linkman，这里必须通过contacts完成，只不过，恰好contacts就是根元素
	 * 需要用到的方法：
	 * 	10. 删除子元素，必须通过父元素remove(子元素对象)完成	
				父元素.remove(子元素对象);
			所以先查询到 属性id=996的linkman元素，再通过contacts删除
	 */
	@Test 
	public void testDelete() {
		// 将所有公共需要预执行的操作，放到before方法中
		// 6. 使用XPath解析，调用方法: selectSingleNode("xpath表达式")，获取一个节点
		Node linkman = contacts.selectSingleNode("//linkman[@id='996']");
		boolean remove = contacts.remove(linkman);
		System.out.println("是否删除成功：" + remove);
	}
	
	/**
	 * 将所有公共代码抽取到after方法中，主要是将内存中Document写出到硬盘的XML文件的操作
	 */
	@After
	public void after() {
		XMLWriter writer = null;
		FileWriter fw = null;
		try {
			// 为了在 XMLWriter创建的对象的时候，传入参数，所以先创建一个FileWriter,参数：xml文件相对路径
			fw = new FileWriter("src/cn/itsource/parse/contacts.xml"); // 创建输出流不要使用自动关流，否则可能提前关流报错。
			// 创建一个漂亮格式对象OutputFormat，调用createPrettyPrint方法
			OutputFormat format = OutputFormat.createPrettyPrint();
			// 8. 创建一个XMLWriter对象，将文件输出流fw传入
			writer = new XMLWriter(fw, format);
			// 9. writer调用write方法，将内存中document写出到硬盘
			writer.write(document);
			System.out.println("修改完成");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			// 关流
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fw != null) {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
	

}
