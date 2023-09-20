package model;

import java.util.ArrayList;

// CRUD(비즈니스 메서드,핵심 로직)
// ---> 일반적으로 output이 boolean 타입입니다!! *****

// 로그들만 syso()가 가능하고 --> 나중에 로그는 주석으로 제거함!
// 나머지 syso() --> view에서만 가능
public class StudentDAO {

	private ArrayList<StudentVO> datas;
	private static int PK=1001;
	public StudentDAO(){
		this.datas=new ArrayList<StudentVO>();
		this.datas.add(new StudentVO(1001,"홍길동",85));
		this.datas.add(new StudentVO(1002,"아무무",92));
		this.datas.add(new StudentVO(1003,"티모",51));
	}


	// C
	public boolean insert(String name,int score) {
		this.datas.add(new StudentVO(PK++,name,score));
		return true;

	}


	// R : 목록 출력
	public ArrayList<StudentVO> selectAll() {
		return this.datas;
	}
	// R : 1개 출력
	public StudentVO selectOne(int num) { // PK를 받아서,
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				return this.datas.get(i);
			}
		} // -> 향상된 for문(forEach문)
		System.out.println("  로그: model: StudentDAO: selectOne(): 반환할 학생이 없습니다!");
		// 어떤 패키지,클래스,메소드 인지 남겨 두면 오류가 어디서 났는지 찾기 쉬움
		return null; // 해당 PK를 가진 학생이 없는 상태
	}

	// U
	public boolean update(int num,int score) {
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				this.datas.get(i).setScore(score);
				return true;
			}
		}
		System.out.println("  로그: model: StudentDAO: update(): 성적변경할 학생이 없습니다!");
		return false;
	}


	// D
	public boolean delete(int num) {
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				this.datas.remove(i);
				return true;
			}
		}
		System.out.println("  로그: model: StudentDAO: update(): 성적변경할 학생이 없습니다!");
		return false;
	}











}
