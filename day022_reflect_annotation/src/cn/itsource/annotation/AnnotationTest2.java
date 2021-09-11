package cn.itsource.annotation;

/**
 *	注意：区别可以生成文档说明 api，标记【掌握】
			操作步骤：
				1．选中项目/代码，右键选中Export
				2．输入Javadoc
				3．第一个next（可以设置生成文档注释的目录），第二个next，设置字符集
					如果是UTF-8编码，且有中文，请输入-encoding UTF-8 -charset UTF-8   
				4. 勾选一个生成完毕后，直接通过浏览器打开的选项
				5. finish
 */
public class AnnotationTest2 {
	
	public static void main(String[] args) {

	}
	
	/**
	 * @author 龙泽宇潇 该标记，表示作者
	 * @author 仓井进进
	 * @author 小泽某毅
	 * @author 森田宇航
	 * @author 加藤仁义
	 * @author 仓井老师
	 * @see 该标记，表示，参考某些类。参考了某热集团全部文献。
	 * @since 表示从第几个版本开始。5.1
	 * @param actors 该标记，表示参数
	 * @throws 人太多异常！
	 */
	public static void playMovie(String... actors) throws Exception {
		System.out.println("拍摄人和动物和谐相处的故事.avi");
	}
}
