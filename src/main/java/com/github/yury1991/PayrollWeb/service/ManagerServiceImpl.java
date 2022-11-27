package com.github.yury1991.PayrollWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.yury1991.PayrollWeb.dao.ManagerDAO;
import com.github.yury1991.PayrollWeb.models.Manager;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	private ManagerDAO managerDAO;
	
	@Override
	@Transactional
	public List<Manager> getAllManagers() {		
		return managerDAO.getAllManagers();
	}
	
	@Override
	@Transactional
	public Manager getManager(int id) {
		return managerDAO.getManager(id);
		
	}

	@Override
	@Transactional
	public void saveManager(Manager manager) {
		 managerDAO.saveManager(manager);		
	}
	
	@Override
	@Transactional
	public void updateManager(Manager manager, int id) {
		 managerDAO.updateManager(manager, id);
		
	}

	@Override
	@Transactional
	public void deleteManager(int id) {
		managerDAO.deleteManager(id);
		
	}	
}
