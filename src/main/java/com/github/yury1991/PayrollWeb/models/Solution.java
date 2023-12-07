package com.github.yury1991.PayrollWeb.models;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.yury1991.PayrollWeb.dao.PaymentDAOImpl;
import com.github.yury1991.PayrollWeb.service.CoefficientService;
import com.github.yury1991.PayrollWeb.service.CoefficientServiceImpl;
public class Solution  {
	public static void main(String [] args) throws Exception {	
		
		BigDecimal a = new BigDecimal(12.00);
		BigDecimal b = new BigDecimal(6.00);
		BigDecimal c = new BigDecimal(2.00);
		
		System.out.println(a.subtract(b).divide(c));

	//	Properties prop = new Properties();
	//	try(InputStream input = new FileInputStream("/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/coefficient.properties"))
	//	{			
	//		prop.load(input);	
	/*		LoyaltyCoefficient lc = new LoyaltyCoefficient(	Double.valueOf(prop.getProperty("LoyaltyCoefficient.minLoyaltyCoefficient")),
														   	Double.valueOf(prop.getProperty("LoyaltyCoefficient.maxLoyaltyCoefficient")),
														   	Double.valueOf(prop.getProperty("LoyaltyCoefficient.complaintCoefficient")),
														   	Integer.valueOf(prop.getProperty("LoyaltyCoefficient.complaintQuantity")));
			System.out.println("Минимальный коэффициент: " + lc.getMinCoefficient());
			System.out.println("Максимальный коэффициент: " + lc.getMaxCoefficient());
			System.out.println("Штраф за жалобу: " + lc.getComplaintCoefficient());
			System.out.println("Количество жалоб: " + lc.getComplaintQuantity());
			System.out.println();*/
			
			
	/*		BusinessCoefficient bc = 
					new BusinessCoefficient	(Double.valueOf(prop.getProperty("BusinessCoefficient.minBusinessCoefficient")), 
											 Double.valueOf(prop.getProperty("BusinessCoefficient.maxBusinessCoefficient")),
											 Double.valueOf(prop.getProperty("BusinessCoefficient.mistakeCoefficient")),
											 Double.valueOf(prop.getProperty("BusinessCoefficient.defectCost")));
											
			System.out.println("Минимальный коэффициент: " + bc.getMinCoefficient());
			System.out.println("Максимальный коэффициент: " + bc.getMaxCoefficient());
			System.out.println("Коэффициент ошибки: " + bc.getMistakeCoefficient());
			System.out.println("Стоимость недочета: " + bc.getDefectCost());
			System.out.println();*/
			
/*			ParticipationCoefficient pc = 
					new ParticipationCoefficient(	Double.valueOf(prop.getProperty("ParticipationCoefficient.minParticipationCoefficient")), 
													Double.valueOf(prop.getProperty("ParticipationCoefficient.maxParticipationCoefficient")),
													Double.valueOf(prop.getProperty("ParticipationCoefficient.clientSearchCoefficient")),
													Double.valueOf(prop.getProperty("ParticipationCoefficient.decisionCoefficient")),
													Double.valueOf(prop.getProperty("ParticipationCoefficient.documentationCoefficient")),
													Double.valueOf(prop.getProperty("ParticipationCoefficient.negotiationCoefficient")),
													Double.valueOf(prop.getProperty("ParticipationCoefficient.shipmentCoefficient")));
			
			System.out.println("Минимальный коэффициент: " + pc.getMinCoefficient());
			System.out.println("Максимальный коэффициент: " + pc.getMaxCoefficient());
			System.out.println("Коэффициент поиска клиента: " + pc.getClientSearchCoefficient());
			System.out.println("Коэффиент решения: " + pc.getDecisionCoefficient());
			System.out.println("Коэффициент документации: " + pc.getDocumentationCoefficient());
			System.out.println("Коэффициент переговоров: " + pc.getNegotiationCoefficient());
			System.out.println("Коэффициент отгрузки: " + pc.getShipmentCoefficient()); */
/*		} catch (FileNotFoundException ex) {
//			ex.printStackTrace();				 
//		}		
		
//		System.out.println("Finish"); 		  
	}*/
	}
}
