package ex03;

public class MemberService {
	MemberDAO dao=new MemberDAO();
	
	public void selectAll() {
		dao.selectAll();
	}
}
