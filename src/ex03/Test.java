package ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {
		//MemberService service=new MemberService();
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		MemberService service=(MemberService) factory.getBean("memberService");
		service.selectAll();
	}
}
