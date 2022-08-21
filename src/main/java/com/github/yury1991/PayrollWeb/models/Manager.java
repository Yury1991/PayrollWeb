package com.github.yury1991.PayrollWeb.models;

public class Manager {
	private String name;
    private String surname;
    private String patronymic;
    //прибыль менеджера от продаж
	private SalesProfit managerSalesProfit;
	//прибыль менеджера от работы с клиентом
	private ClientProfit managerClientProfit;
	//прибыль менеджера за осуществление бизнес-процессов
	private BusinessProfit managerBusinessProfit;
	//прибыль менеджера c продажи единицы оборудования 
	private PieceEquipmentProfit pieceEquipmentProfit;	
	//прибыль менеджера за осуществление работы на складе
	private double warehousePayment;
		
	public Manager() {
		
	}
	public Manager(String name) {
		this.name = name;
	}
		
	public Manager(String surname, String name, String patronymic,SalesProfit managerSalesProfit,
					ClientProfit managerClientProfit, 
					BusinessProfit managerBusinessProfit,
					PieceEquipmentProfit pieceEquipmentProfit) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.managerSalesProfit = managerSalesProfit;
		this.managerClientProfit = managerClientProfit;
		this.managerBusinessProfit = managerBusinessProfit;
		this.pieceEquipmentProfit = pieceEquipmentProfit;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public double getWarehousePayment() {
		return warehousePayment;
	}
	public void setWarehousePayment(double warehousePayment) {
		this.warehousePayment = warehousePayment;
	}	
		
	public double calculateManagerSalary() {		 
		return (managerSalesProfit.getProfit() + managerClientProfit.getProfit() + 
				managerBusinessProfit.getProfit() + pieceEquipmentProfit.getProfit());
	}
	
	@Override
	public String toString() {
		return "Менеджер: " + this.getSurname() + " " + this.getName() + " " + this.getPatronymic() + '\''+ 
				" " + "итоговая зарплата за месяц: " + this.calculateManagerSalary();
				}
	
}
