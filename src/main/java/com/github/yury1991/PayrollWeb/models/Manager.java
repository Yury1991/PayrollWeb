package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

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
	private BigDecimal salesProfit;
	
	// прибыль менеджера от работы с клиентом
	@Column(name = "Клиент")
	private BigDecimal clientProfit;
	
	// прибыль менеджера за осуществление бизнес-процессов
	@Column(name = "Процесс")	
	private BigDecimal businessProfit;
	
	// прибыль менеджера c продажи единицы оборудования 
	@Column(name = "Оборудование")
	private BigDecimal equipmentProfit;	
	
	
	// прибыль менеджера за осуществление работы на складе	
	@Column(name = "Склад")
	private BigDecimal warehousePayment;	
	
	//зарплатные ставки менеджера
	private Payment managerPayment;
	
	
	
	
	// зарплата менеджера за месяц
	@Column(name = "Зарплата")
	private BigDecimal managerSalary;	
	
	public Manager() {
		
	}
	
	public Manager(String fullName) {
		this.fullName = fullName;		
		this.salesProfit = new BigDecimal(0.00);
		this.clientProfit = new BigDecimal(0.00);
		this.businessProfit = new BigDecimal(0.00);
		this.equipmentProfit = new BigDecimal(0.00);	
		this.managerSalary = new BigDecimal(0.00);		
	}
	
	public Manager(String fullName,
			BigDecimal salesProfit,	BigDecimal clientProfit, 
			BigDecimal businessProfit, BigDecimal equipmentProfit, BigDecimal managerSalary) {
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
	
	public BigDecimal getClientProfit() {
		return clientProfit;
	}
	public void setClientProfit(BigDecimal clientProfit) {
		this.clientProfit = clientProfit;
	}
	
	public BigDecimal getSalesProfit() {
		return salesProfit;
	}
	public void setSalesProfit(BigDecimal salesProfit) {
		this.salesProfit = salesProfit;
	}
	
	public BigDecimal getBusinessProfit() {
		return businessProfit;	
	}
	public void setBusinessProfit(BigDecimal businessProfit) {
		this.businessProfit = businessProfit;
	}
	
	public BigDecimal getEquipmentProfit() {
		return equipmentProfit;
	}
	public void setEquipmentProfit(BigDecimal equipmentProfit) {
		this.equipmentProfit = equipmentProfit;
	}	
	
		
	public BigDecimal getManagerSalary() {	
		return managerSalary;
	}	
	public void setManagerSalary(BigDecimal managerSalary) {
		this.managerSalary = managerSalary;
	}		
	
	@Override
	public String toString() {
		return "Менеджер: " + this.fullName + " " + "итоговая зарплата за месяц: " + this.getManagerSalary();
	}

	public Payment getManagerPayment() {
		return managerPayment;
	}

	public void setManagerPayment(Payment managerPayment) {
		this.managerPayment = managerPayment;
	}	
}
