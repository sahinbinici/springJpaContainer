package com.otostore.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.otostore.dao.CarDetailDao;
import com.otostore.model.CarDetail;
@Repository
@Transactional
public class CarDetailDaoImpl implements CarDetailDao<CarDetail>{

	@PersistenceContext
	private EntityManager em;
	
	public CarDetailDaoImpl(){
		
	}
	
	@Override
	public void dropTable() {
		Query query=(Query) em.createNamedQuery("CarDetail.dropTable");
		CarDetail carDetail=(CarDetail) query.getSingleResult();
		em.remove(carDetail);
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTable(CarDetail object,int id) {
		CarDetail oldCarDetail=em.find(CarDetail.class, id);
		em.merge(object);
	}

	@Override
	public void insertRecord(CarDetail object) {
		em.persist(object);
		
	}

	@Override
	public void deleteRecord(int id) {
		CarDetail carDetail=em.find(CarDetail.class, id);
		em.remove(carDetail);
		
	}

	@Override
	public CarDetail getRecord(int id) {
		
		return null;
	}

	@Override
	public List<CarDetail> getAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
