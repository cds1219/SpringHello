package ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Hello h=(Hello) factory.getBean("h");
		Hello h2=(Hello) factory.getBean("h2");
		System.out.println(h.getMsg());
		System.out.println(h2.getMsg());
		System.out.println(h==h2);	//false
	}
}
