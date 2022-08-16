package com.github.yury1991.PayrollWeb.Logic;

public class Manager {
	private String name;
	private ManagerSalesProfit managerSalesProfit;
	private ManagerClientProfit managerClientProfit;
	private ManagerBusinessProfit managerBusinessProfit;
	private TotalSalesProfit totalSalesProfit;
//	private TimeRate timeRate;
	private final double WAREHOUSE_PAYMENT = 7000;
	private double managerSalary;	
	
	public Manager() {
		
	}
	public Manager(String name) {
		this.name = name;
	}
	
	public Manager(String name, ManagerSalesProfit managerSalesProfit,
					ManagerClientProfit managerClientProfit, 
					ManagerBusinessProfit managerBusinessProfit,
					TotalSalesProfit totalSalesProfit) {
		this.name = name;
		this.managerSalesProfit = managerSalesProfit;
		this.managerClientProfit = managerClientProfit;
		this.managerBusinessProfit = managerBusinessProfit;
		this.totalSalesProfit = totalSalesProfit;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double  salary) {
		this.setManagerSalary(salary);
	}
	public double getManagerSalary() {
		return managerSalary;
	}
	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}
	
	public double calculateManagerSalary() {
		managerSalary = managerSalesProfit.getProfit() + managerClientProfit.getProfit() + 
				managerBusinessProfit.getProfit() + totalSalesProfit.getProfit() + 
				WAREHOUSE_PAYMENT;
		return managerSalary;
	}
/*	public TimeRate getTimeRate() {
		return timeRate;
	}
	public void setTimeRate(TimeRate timeRate) {
		this.timeRate = timeRate;
	}	*/
}
