package com.github.yury1991.PayrollWeb.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Properties;

import org.springframework.stereotype.Repository;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;

@Repository
public class CoefficientDAOImpl implements CoefficientDAO {
	
	private final Properties prop = new Properties();
	private final String coefficientPropertiesPath = "/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/coefficient.properties";
	private File paymentProperties = new File(coefficientPropertiesPath);
	private FileReader reader = null;
    private FileWriter writer = null;
	
	
	@Override
	public LoyaltyCoefficient getLoyaltyCoefficient() {		
		try
		{			
			reader = new FileReader(paymentProperties);
			prop.load(reader);	
			return new LoyaltyCoefficient(	Float.valueOf(prop.getProperty("LoyaltyCoefficient.minLoyaltyCoefficient")),
											Float.valueOf(prop.getProperty("LoyaltyCoefficient.maxLoyaltyCoefficient")),
											Float.valueOf(prop.getProperty("LoyaltyCoefficient.complaintCoefficient")));	
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();				 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}

	@Override
	public BusinessCoefficient getBusinessCoefficient() {		
		try
		{
			reader = new FileReader(paymentProperties);
			prop.load(reader);
			return new BusinessCoefficient(Float.valueOf(prop.getProperty("BusinessCoefficient.minBusinessCoefficient")),
										   Float.valueOf(prop.getProperty("BusinessCoefficient.maxBusinessCoefficient")), 
										   Float.valueOf(prop.getProperty("BusinessCoefficient.mistakeCoefficient")));
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ParticipationCoefficient getParticipationCoefficient() {		
		try
		{
			reader = new FileReader(paymentProperties);
			prop.load(reader);
			return new ParticipationCoefficient(Float.valueOf(prop.getProperty("ParticipationCoefficient.minParticipationCoefficient")),
												Float.valueOf(prop.getProperty("ParticipationCoefficient.maxParticipationCoefficient")), 
												Float.valueOf(prop.getProperty("ParticipationCoefficient.clientSearchCoefficient")),
												Float.valueOf(prop.getProperty("ParticipationCoefficient.decisionCoefficient")),
												Float.valueOf(prop.getProperty("ParticipationCoefficient.documentationCoefficient")),
												Float.valueOf(prop.getProperty("ParticipationCoefficient.negotiationCoefficient")),
												Float.valueOf(prop.getProperty("ParticipationCoefficient.shipmentCoefficient")));
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	


	@Override
	public void setLoyaltyCoefficient(LoyaltyCoefficient loyaltyCoefficient) {
		try {
			writer = new FileWriter(paymentProperties);
			prop.setProperty("LoyaltyCoefficient.minLoyaltyCoefficient", String.valueOf(loyaltyCoefficient.getMinCoefficient()));
			prop.setProperty("LoyaltyCoefficient.maxLoyaltyCoefficient", String.valueOf(loyaltyCoefficient.getMaxCoefficient()));
			prop.setProperty("LoyaltyCoefficient.complaintCoefficient",  String.valueOf(loyaltyCoefficient.getComplaintCoefficient()));	
			prop.setProperty("LoyaltyCoefficient.complaintQuantity",     String.valueOf(loyaltyCoefficient.getComplaintQuantity()));
			prop.store(writer, "Запись в файл");
			/*writer.close();
			writer.flush();*/
		} catch(IOException ex) {
			ex.printStackTrace();
		}		
	}

	@Override
	public void setBusinessCoefficient(BusinessCoefficient businessCoefficient) {
		try {
			writer = new FileWriter(paymentProperties);
			prop.setProperty("BusinessCoefficient.minBusinessCoefficient", String.valueOf(businessCoefficient.getMinCoefficient()));
			prop.setProperty("BusinessCoefficient.maxBusinessCoefficient", String.valueOf(businessCoefficient.getMaxCoefficient()));
			prop.setProperty("BusinessCoefficient.mistakeCoefficient",     String.valueOf(businessCoefficient.getMistakeCoefficient()));			
			prop.store(writer, "Запись в файл");
		/*	writer.close();
			writer.flush();*/
		} catch(IOException ex) {
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void setParticipationCoefficient(ParticipationCoefficient participationCoefficient) {
		try {
			writer = new FileWriter(paymentProperties);
			prop.setProperty("ParticipationCoefficient.minParticipationCoefficient", String.valueOf(participationCoefficient.getMinCoefficient()));
			prop.setProperty("ParticipationCoefficient.maxParticipationCoefficient", String.valueOf(participationCoefficient.getMaxCoefficient()));
			prop.setProperty("ParticipationCoefficient.clientSearchCoefficient",     String.valueOf(participationCoefficient.getClientSearchCoefficient()));	
			prop.setProperty("ParticipationCoefficient.decisionCoefficient",         String.valueOf(participationCoefficient.getDecisionCoefficient()));
			prop.setProperty("ParticipationCoefficient.documentationCoefficient",    String.valueOf(participationCoefficient.getDocumentationCoefficient()));
			prop.setProperty("ParticipationCoefficient.negotiationCoefficient",      String.valueOf(participationCoefficient.getNegotiationCoefficient()));	
			prop.setProperty("ParticipationCoefficient.shipmentCoefficient",         String.valueOf(participationCoefficient.getShipmentCoefficient()));
			prop.store(writer, "Запись в файл");
		/*	writer.close();
			writer.flush();*/
		} catch(IOException ex) {
			ex.printStackTrace();
		}			
	}	
}
		
