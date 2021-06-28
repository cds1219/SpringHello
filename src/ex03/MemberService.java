package ex03;

public class MemberService implements Service{
	DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public void selectAll() {
		dao.selectAll();
	}
}
