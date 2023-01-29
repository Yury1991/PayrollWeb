package com.github.yury1991.PayrollWeb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "managers")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
		
	// ФИО менеджера	
	@Column(name = "ФИО")
	private String fullName;
	
    // прибыль менеджера от продаж
	@Column(name = "Продажи")
	private double salesProfit;
	
	// прибыль менеджера от работы с клиентом
	@Column(name = "Клиент")
	private double clientProfit;
	
	// прибыль менеджера за осуществление бизнес-процессов
	@Column(name = "Процесс")	
	private double businessProfit;
	
	// прибыль менеджера c продажи единицы оборудования 
	@Column(name = "Оборудование")
	private double equipmentProfit;	
	
	
	// прибыль менеджера за осуществление работы на складе	
	@Column(name = "Склад")
	private double warehousePayment;	
	//зарплатные ставки менеджера
	//private Payment managerPayment;
	
	
	// зарплата менеджера за месяц
	@Column(name = "Зарплата")
	private double managerSalary;	
	
	public Manager() {
		
	}
	
	public Manager(String fullName) {
		this.fullName = fullName;		
		this.salesProfit = 0.00;
		this.clientProfit = 0.00;
		this.businessProfit = 0.00;
		this.equipmentProfit = 0.00;	
		this.managerSalary = 0.00;		
	}
	
	public Manager(String fullName,
					double salesProfit,	double clientProfit, 
					double businessProfit, double equipmentProfit, double managerSalary) {
		this.fullName = fullName;		
		this.salesProfit = salesProfit;
		this.clientProfit = clientProfit;
		this.businessProfit = businessProfit;
		this.equipmentProfit = equipmentProfit;	
		this.managerSalary = managerSalary;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}	
	
	public double getClientProfit() {
		return clientProfit;
	}
	public void setClientProfit(double clientProfit) {
		this.clientProfit = clientProfit;
	}
	
	public double getSalesProfit() {
		return salesProfit;
	}
	public void setSalesProfit(double salesProfit) {
		this.salesProfit = salesProfit;
	}
	
	public double getBusinessProfit() {
		return businessProfit;	
	}
	public void setBusinessProfit(double businessProfit) {
		this.businessProfit = businessProfit;
	}
	
	public double getEquipmentProfit() {
		return equipmentProfit;
	}
	public void setEquipmentProfit(double equipmentProfit) {
		this.equipmentProfit = equipmentProfit;
	}
	
	
		
	public double getManagerSalary() {	
		return managerSalary;
	}	
	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}		
	
	@Override
	public String toString() {
		return "Менеджер: " + this.fullName + " " + "итоговая зарплата за месяц: " + this.getManagerSalary();
	}	
}
