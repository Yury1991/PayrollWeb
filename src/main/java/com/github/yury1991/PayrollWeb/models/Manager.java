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
//	private SalesProfit managerSalesProfit;
//	private ClientProfit managerClientProfit;
//	private BusinessProfit managerBusinessProfit;
//	private PieceEquipmentProfit pieceEquipmentProfit;	
	// флаг была ли работа на складе	
//		private boolean isWarehouse;	
	// уникальный идентификатор менеджера
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
		
	// фамилия менеджера
	@Column(name = "Фамилия")
	private String surname;
	
	// имя менеджера
	@Column(name = "Имя")
	private String name;
	
	// отчество менеджера
	@Column(name = "Отчество")
    private String patronymic;	
	
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
	
	// зарплата менеджера за месяц
	@Column(name = "Зарплата")
	private double managerSalary;	
	
	public Manager() {
		
	}
	
	public Manager(String surname, String name, String patronymic) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.salesProfit = 0.00;
		this.clientProfit = 0.00;
		this.businessProfit = 0.00;
		this.equipmentProfit = 0.00;	
		this.managerSalary = 0.00;		
	}
	
	public Manager(String surname, String name, String patronymic, 
					double salesProfit,	double clientProfit, 
					double businessProfit, double equipmentProfit, double managerSalary) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
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
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
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
	public void setEquiomentProfit(double equipmentProfit) {
		this.equipmentProfit = equipmentProfit;
	}
	
	/*public boolean getIsWarehouse() {
		return isWarehouse;
	}
	public void setIsWarehouse(boolean isWarehouse) {
		this.isWarehouse = isWarehouse;
	}	*/
	
	public double getWarehousePayment() {
		return warehousePayment;
	/*	if(isWarehouse) {
			return warehousePayment;
		} else {
			return 0;
		}	*/	
	}	
	public void setWarehousePayment() {
		this.warehousePayment = 7000;
	}	
		
	public double getManagerSalary() {
	/*	managerSalary = salesProfit + clientProfit + 
				businessProfit + equipmentProfit;*/
		return managerSalary;
	}	
	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}		
	
	@Override
	public String toString() {
		return "Менеджер: " + this.surname + " "+ this.name + " " + this.patronymic + '\''+ 
				" " + "итоговая зарплата за месяц: " + this.getManagerSalary();
	}	
}
