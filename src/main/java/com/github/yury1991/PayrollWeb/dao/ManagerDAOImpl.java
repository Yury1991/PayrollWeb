package com.github.yury1991.PayrollWeb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.yury1991.PayrollWeb.models.Manager;

@Repository
public class ManagerDAOImpl implements ManagerDAO{
	
	@Autowired 
	private SessionFactory sessionFactory;

	@Override
	public List<Manager> getAllManagers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Manager> query = session.createQuery("from Manager", Manager.class);
		List<Manager> allManagers = query.getResultList();
		return allManagers;
	}
	
	@Override
	public Manager getManager(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Manager> query = session.createQuery("from Manager", Manager.class);
		List<Manager> allManagers = query.getResultList();
		return allManagers.stream().filter(manager -> manager.getId() == id).findAny().orElse(null);
	}

	@Override
	public void saveManager(Manager manager) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(manager);		
	}
	
	@Override
	public void updateManager(Manager manager, int id) {		
		Session session = sessionFactory.getCurrentSession();		
		Manager updatedManager =  getManager(id);
		updatedManager.setFullName(manager.getFullName());		
		session.saveOrUpdate(updatedManager);
	}

	@Override
	public void deleteManager(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query <Manager> query = session.createQuery("delete from Manager where id =:managerId");
		query.setParameter("managerId", id);
		query.executeUpdate();
	}

	@Override
	public void calculateManager(Manager manager, int id) {
		Session session = sessionFactory.getCurrentSession();
		Manager calculateManager = getManager(id);
		
	}
}
