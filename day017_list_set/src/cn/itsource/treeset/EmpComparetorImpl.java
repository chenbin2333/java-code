package cn.itsource.treeset;

import java.util.Comparator;

/**
 *	设计一个Emp比较器子类EmpComparetorImpl，实现Comparator接口，重写compare方法
 *	因为我们TreeSet要添加Emp类型的元素，所以这里<>中写Emp类型
 *	2. 定制排序：
  		在创建TreeSet对象的时候，传入一个Comparator接口的实现类，该实现类必须重写compare方法
  			返回值  正数：升序
			返回值  负数：降序
			返回值 0：相同的元素
  			当自然排序和定制排序同时使用，定制排序优先级更高
  			一般情况下，默认排序用自然排序，特殊排序用定制排序
 *	
 */
public class EmpComparetorImpl implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
//		return 0;// 表示相同的元素
//		return 1;// 正数表示不相同的元素，且升序排序。1只是表示正数而已。
		return -1;// 负数表示不相同的元素，且降序排序。-1只是表示负数而已。
	}

}
