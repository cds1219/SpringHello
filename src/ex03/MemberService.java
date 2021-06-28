package ex03;

public class MemberService implements Service{
	MemberDAO dao;
	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	public void selectAll() {
		dao.selectAll();
	}
}
