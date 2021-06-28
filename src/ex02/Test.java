package ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));	//객체 주문서
		
		Shape s=(Shape) factory.getBean(args[0]);	//arg -> c, r, t 중 하나를 넣어주면 된다
		s.area();
	}
}