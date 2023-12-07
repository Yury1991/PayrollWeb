package com.github.yury1991.PayrollWeb.dao;

import java.util.List;

import com.github.yury1991.PayrollWeb.models.Manager;

public interface ManagerDAO {
	public List<Manager> getAllManagers();
	public Manager getManager(int id);
	public void saveManager(Manager manager);	
	public void updateManager(Manager manager, int id);
	public void deleteManager(int id);
	public void calculateManager(Manager manager, int id);
}
