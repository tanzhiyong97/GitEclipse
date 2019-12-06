package collection接口和iterator接口;

import java.util.*;
public class YoungCollection {
	public static void main(String[] args) {
		try {
			ArrayList c=new ArrayList();
			c.add("美美"); //添加元素
			c.add(6);
			System.out.println("集合C的元素个数为："+c.size());
			c.remove(6);
			System.out.println("集合C的元素个数为："+c.size());
			//判断是否包含指定字符
			System.out.println("集合C的元素是否包含美美字符串"+c.contains("美美"));
			System.out.println("集合C的元素是否包含美美字符串"+c.contains("美美"));
			c.add("江湖");
			System.out.println("集合C的元素："+c);
			System.out.println("test");
			System.out.println("用来测试代码的对比");
		}
		catch(Exception e) {
			System.out.println("输出错误:"+e);
			e.printStackTrace();
		}
	}

}
