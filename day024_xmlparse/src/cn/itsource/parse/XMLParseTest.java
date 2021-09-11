package cn.itsource.parse;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
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

 */
public class XMLParseTest {

	/**
	 * 查询 id="69"的linkman元素的子元素name的值
	 */
	@Test 
	public void testSearch() {
		// 1. 创建SAXReader对象
		SAXReader reader = new SAXReader();
		// 使用自动关流语法try(){}
		try (
			// 2. 创建一个FileInputStream对象，赋值，参数：xml文件相对路径
			FileInputStream fis = new FileInputStream("src/cn/itsource/parse/contacts.xml");// 区分之前资源文件解析方式，这里相对路径是从src开始的
			// 3. 创建一个BufferedInputStream缓冲流，提高读取效率
			BufferedInputStream buff = new BufferedInputStream(fis);
		) {
			// 4. 通过reader调用read方法，获取Document文档树对象。传入参数buff
			Document document = reader.read(buff);
			System.out.println(document);
			// 5. 获取根节点, document调用方法： getRootElement();
			Element contacts = document.getRootElement();// 这就是当前根元素contacts
			// 6. 获取所有子标签（元素）,调用方法：elements();
			List<Element> linkmans = contacts.elements();// 这里获取的是所有Element类型的元素集合，手动加上泛型，避免强转
			// 7. 遍历所有的子元素，遍历之前必须判断非null
			if (linkmans != null) {
				// 增强for循环遍历
				for (Element linkman : linkmans) {
					// 8. 通过当前元素获取属性对象,调用方法：attribute("属性名");
					Attribute idAttribute = linkman.attribute("id");
					// 9. idAttribute非null判断，不为null，才获取属性值，调用方法：通过属性对象attribute获取属性值，attribute.getText();
					if (idAttribute != null) {
						String idText = idAttribute.getText();// 获取id属性的值
						// 10. 判断当前属性值是否是equals("69")为true，如果是则继续获取下一级name子元素
						if ("69".equals(idText)) {
							// 11. 获取linkman的子元素name，获取指定名字的子标签（元素）：element(String name);	
							Element nameElement = linkman.element("name");
							// 12. 判断非null，不为null，获取值,getText(), 打印
							if (nameElement != null) {
								String nameText = nameElement.getText();
								System.out.println(nameText);
							}
						}
					}
					
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
