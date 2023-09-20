package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.DrinkVO;

public class DrinkView {

	//	메뉴를 안내해주는 기능
	//	1. 음료추가
	//	2. 음료목록출력
	//	3. 음료구매
	//	4. 음료삭제
	//	5. 종료

	private static final int maxMenu=5;
	private static Scanner sc=new Scanner(System.in);

	public void printMenu() {
		System.out.println("===음료 자판기===");
		System.out.println("1. 음료추가");
		System.out.println("2. 음료목록출력");
		System.out.println("3. 음료구매");
		System.out.println("4. 음료삭제");
		System.out.println("5. 종료");
	}

	//	사용자의 메뉴번호 입력을 저장하는 기능
	public int getMenuNum() {
		while(true) {
			try {
				System.out.print("입력) ");
				int menuNum=sc.nextInt();

				if(menuNum<=0 && menuNum>maxMenu) {
					return menuNum;
				}
			}
			catch(Exception e){
				sc.nextLine();
				System.out.println("정수로 입력해주세요:(");
			}
		}
	}

	//	1.
	//	음료 추가  시작 안내멘트
	public void printInfo_I_Start() {
		System.out.println("음료추가를 시작합니다.");
	}

	//	사용자가 입력한 음료 이름 저장
	public String getDrinkName() {
		System.out.println("음료 이름 입력) ");
		String name=sc.next();
		return name;
	}

	//	사용자가 입력한 음료 가격 저장
	public int getDrinkPrice() {
		System.out.println("음료 가격 입력) ");
		int price=sc.nextInt();
		return price;
	}

	//	사용자가 입력한 음료 재고 저장
	public int getDrinkStock(){
		System.out.println("음료 재고 입력) ");
		int stock=sc.nextInt();
		return stock;
	}

	//	음료추가 완료 안내멘트
	public void printInfo_I_End() {
		System.out.println("음료추가를 종료합니다.");
	}



	//	2.
	//	음료목록을 출력하는 기능
	public void printDrink(ArrayList<DrinkVO> datas) {
		System.out.println("=====음료 목록=====");
		for(DrinkVO v: datas) {
			System.out.println(v);
		}
	}



	//	3.
	//	음료 구매 시작 안내멘트
	public void printInfo_P_Start() {
		System.out.println("음료구매를 시작합니다.");
	}

	//	사용자가 입력한 음료 구매 번호
	public int getDrinkNum() {
		System.out.println("구매할 음료 번호 입력) ");
		int num=sc.nextInt();
		return num;
	}

	//	사용자가 입력한 음료 구매 수량
	public int getDrinkBuy() {
		System.out.println("구매할 음료 수량 입력) ");
		int buyNum=sc.nextInt();
		return buyNum;
	}

	//	사용자가 입력한 음료 구매 돈
	public int getDrinkPay() {
		System.out.println("지불할 금액 입력) ");
		int pay=sc.nextInt();
		return pay;
	}
	
	//	구매 종료 멘트
	public void printInfo_P_End() {
		System.out.println("구매가 종료되었습니다.");
	}

	
	//	4.
	//	음료 삭제 시작 멘트
	public void printInfo_D_Start() {
		System.out.println("음료삭제를 시작합니다.");
	}
	
	// 사용자가 입력한 음료 삭제 번호
	public int getDrinkDelete() {
		System.out.println("삭제할 음료 번호 입력) ");
		int deleteNum=sc.nextInt();
		return deleteNum;
	}
	
	//	음료 삭제 완료멘트
	public void printInfo_D_End() {
		System.out.println("음료삭제를 종료합니다.");
	}
	
	// 프로그램 종료 멘트
	public void printEnd() {
		System.out.println("프로그램이 종료됩니다:)");
	}

}
