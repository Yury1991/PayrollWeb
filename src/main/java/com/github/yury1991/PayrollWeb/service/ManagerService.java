package com.github.yury1991.PayrollWeb.service;

import java.util.List;

import com.github.yury1991.PayrollWeb.models.Manager;

public interface ManagerService {
	public List<Manager> getAllManagers();
	public Manager getManager(int id);
	public void saveManager(Manager manager);
	public void updateManager(Manager manager, int id);
	public void deleteManager(int id);
}
