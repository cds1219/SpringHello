package ex03;

public class MemberService implements Service{
	MemberDAO dao=new MemberDAO();
	
	public void selectAll() {
		dao.selectAll();
	}
}
