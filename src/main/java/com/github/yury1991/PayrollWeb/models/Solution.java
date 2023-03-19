package com.github.yury1991.PayrollWeb.models;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.yury1991.PayrollWeb.dao.PaymentDAOImpl;
import com.github.yury1991.PayrollWeb.dao.CoefficientDAOImpl;
import com.github.yury1991.PayrollWeb.service.CoefficientService;
import com.github.yury1991.PayrollWeb.service.CoefficientServiceImpl;
public class Solution  {
	public static void main(String [] args) throws Exception {	
		// создание коэффициента с продаж
	/*	SalesRate salesRate = new SalesRate(78000, 50000, 5600);
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
		System.out.println(manager.toString());*/
		
		//PaymentDAOImpl paymentDAOImpl = new PaymentDAOImpl();
		//Payment payment = paymentDAOImpl.getPayment();
		
		
		
		
			/*Properties prop = new Properties();
			try(InputStream input = new FileInputStream("/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/coefficient.properties"))
			{			
				prop.load(input);			
				clientCoefficient = new ClientCoefficient(Float.valueOf(prop.getProperty("coefficient.clientCoefficient")));
				businessCoefficient = new BusinessCoefficient(Float.valueOf(prop.getProperty("coefficient.businessCoefficient")));
				participationCoefficient = new ParticipationCoefficient(Float.valueOf(prop.getProperty("coefficient.participationCoefficient")));			
				coefficient = new Coefficient(clientCoefficient, businessCoefficient, participationCoefficient);
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();				 
			}		
			
			System.out.println(coefficient.getMaxBusinessCoefficient()); */
			
		
		    CoefficientServiceImpl coefficientServiceImpl = new  CoefficientServiceImpl();
		    CoefficientDAOImpl coefficientDAOImpl = new  CoefficientDAOImpl();
		
			ClientCoefficient clientCoefficient = (ClientCoefficient) coefficientServiceImpl.getMaxCoefficients().get(0);
			
		/*	model.addAttribute("businessCoefficient", coefficientService.getMaxCoefficient().get(1));
			model.addAttribute("participationCoefficient", coefficientService.getMaxCoefficient().get(2));*/
			System.out.println(clientCoefficient.getMaxCoefficient());
		
		
		   
	}
}
