package controller;

import java.util.ArrayList;

import model.DrinkDAO;
import model.DrinkVO;
import view.DrinkView;

public class DrinkCtrl {
	private DrinkView view;
	private DrinkDAO dao; // model
	public DrinkCtrl(){
		this.view=new DrinkView();
		this.dao=new DrinkDAO();
	}

	public void startApp() {
		while(true) {
			
			// 사용자한테 메뉴보여줘!
			view.printMenu();
			// 사용자가 뭐 할지 입력 받아봐
			int menuNum=view.getMenuNum();
			
			if(menuNum==1) {
				view.printInfo_I_Start();
				String name=view.getDrinkName();
				int price=view.getDrinkPrice();
				int stock=view.getDrinkStock();
				dao.insert(name,price,stock);
				view.printInfo_I_End();
				
			}
			else if(menuNum==2) {
				ArrayList<DrinkVO> datas=dao.selectAll();
				view.printDrink(datas);
			}
			else if(menuNum==3) {
				view.printInfo_P_Start();
				int num=view.getDrinkNum();
				dao.update(num);
				int buyNum=view.getDrinkBuy();
				dao.update(buyNum);
				view.printInfo_P_End();
				int pay=view.getDrinkPay();
				
			}
			else if(menuNum==4) {
				view.printInfo_D_Start();
				int deleteNum=view.getDrinkDelete();
				dao.delete(deleteNum);

				view.printInfo_D_End();
			}
			else if(menuNum==5) {
				view.printEnd();
				break;
			}
			
			




		}
	}





}
