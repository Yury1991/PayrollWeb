package com.github.yury1991.PayrollWeb.models;

public class Solution  {
	public static void main(String [] args) {	
		// создание коэффициента с продаж
		SalesRate salesRate = new SalesRate(78000, 50000, 5600);
		SalesProfit managerSalesProfit = new SalesProfit (11000, salesRate);
		System.out.println("доход менеджера с личных продаж " + managerSalesProfit.getProfit() + " руб.");
		ClientRate clientRate = new ClientRate(true, 2);
		ClientProfit managerClientProfit = new ClientProfit(11000, clientRate);
		System.out.println("доход менеджера от лояльности клиента " + managerClientProfit.getProfit() + " руб.");
		BusinessRate businessRate = new BusinessRate(false, 0, 0.1);
		BusinessProfit managerBusinessProfit = new BusinessProfit(22000, businessRate, false, 0, 330 );
		System.out.println("доход менеджера от оценки бизнес процессов " + managerBusinessProfit.getProfit() + " руб.");
		ParticipationRate participationRate = new ParticipationRate(false, true, false, false, true);		
		PieceEquipmentProfit managerPieceEquipmentProfit = new PieceEquipmentProfit(1000000, 0.1, participationRate);
		System.out.println("доход менеджера от продажи единицы оборудования " + managerPieceEquipmentProfit.getProfit() + " руб.");
		Manager manager = new Manager("Иванов", "Иван", "Иванович", managerSalesProfit, managerClientProfit, managerBusinessProfit, managerPieceEquipmentProfit );
		System.out.println(manager.toString());
		/*ClientRate clientRate = new ClientRate();
		ManagerClientProfit managerClientProfit = new ManagerClientProfit (clientRate);		
		System.out.println("доход менеджера от работы с клиентом " +
								managerClientProfit.getProfit() + " руб.");
		BusinessRate businessRate = new BusinessRate();
		ManagerBusinessProfit managerBusinessProfit = new ManagerBusinessProfit(businessRate);
		System.out.println("доход менеджера от бизнес-процессов " +
				managerBusinessProfit.getProfit() + " руб.");
		ParticipationRate participationRate = new ParticipationRate();
		TotalSalesProfit totalSalesProfit = new TotalSalesProfit(participationRate);
		System.out.println("доход менеджера от всех продаж " +
				totalSalesProfit.getProfit() + " руб.");
		Manager manager = new Manager("Bill Cloudfield", managerSalesProfit, 
								managerClientProfit, managerBusinessProfit, totalSalesProfit);
		System.out.println("итоговая зарплата менеджера " + manager.calculateManagerSalary());*/
	}
	
	
		
	
}
