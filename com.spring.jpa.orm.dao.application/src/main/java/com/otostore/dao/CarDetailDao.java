package com.otostore.dao;

import java.util.List;

public interface CarDetailDao <T>{

	public void dropTable();
	public void createTable();
	public void updateTable(T object,int id);
	public void insertRecord(T object);
	public void deleteRecord(int id);
	public T getRecord(int id);
	public List<T> getAllRecord();
}
