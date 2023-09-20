package model;

import java.util.ArrayList;

public class DrinkDAO {

	private ArrayList<DrinkVO> datas;
	private int PK=1001; // 시스템 마다
	public DrinkDAO() {
		this.datas=new ArrayList<DrinkVO>();
		this.datas.add(new DrinkVO(1001,"콜라",2000,15));
		this.datas.add(new DrinkVO(1002,"포카리",2500,20));
		this.datas.add(new DrinkVO(1003,"비타500",1800,10));
	}

	// C : 음료 추가
	public boolean insert(String name,int price,int stock) {
		this.datas.add(new DrinkVO(PK++,name,price,stock));
		return true;
	}

	// R : 음료 목록 모두 출력
	public ArrayList<DrinkVO> selectAll() {
		return this.datas;
	}

	// U : 음료 구매
	public boolean update(int num) {
		for(int i=0;i<datas.size();i++) {
			if(datas.get(i).getNum()==num) {
				return true;
			}
		}
		return false;
	}

	public boolean update(int num,int buyNum) {
		for(int i=0;i<datas.size();i++) {
			if(datas.get(i).getNum()==num) {
				if(datas.get(i).getStock()>=buyNum) {
					// 내가 가진 재고를 뺀재고로 변경
					datas.get(i).setStock(datas.get(i).getStock()-buyNum);
					return true;
				}
			}
		}
		System.out.println("  로그: model: DrinkDAO: update(): 재고가 없다!");
		return false;
	}
	
	
	
	// D : 음료 삭제
	public boolean delete(int deleteNum) {
		for(int i=0;i<datas.size();i++) {
			if(datas.get(i).getNum()==deleteNum) {
				datas.remove(i);
				return true;
			}
		}
		return false;
	}
	



}


