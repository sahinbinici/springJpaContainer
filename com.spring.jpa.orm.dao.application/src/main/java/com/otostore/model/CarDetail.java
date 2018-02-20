package com.otostore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="CarDetail")
@NamedQueries({
	@NamedQuery(name="CarDetail.findAll",query="SELECT c FROM CarDetail c"),
	@NamedQuery(name="CarDetail.dropTable",query="DROP c CarDetail")
})
public class CarDetail implements Serializable{

	public static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CarDetail_ID")
	private int id;
	private String marka;
	private String model;
	private int year;
	private Date addDate;
	private Date updateAddDate;
	
	public CarDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarDetail(int id, String marka, String model, int year, Date addDate, Date updateAddDate) {
		super();
		this.id = id;
		this.marka = marka;
		this.model = model;
		this.year = year;
		this.addDate = addDate;
		this.updateAddDate = updateAddDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateAddDate() {
		return updateAddDate;
	}

	public void setUpdateAddDate(Date updateAddDate) {
		this.updateAddDate = updateAddDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarDetail [id=");
		builder.append(id);
		builder.append(", marka=");
		builder.append(marka);
		builder.append(", model=");
		builder.append(model);
		builder.append(", year=");
		builder.append(year);
		builder.append(", addDate=");
		builder.append(addDate);
		builder.append(", updateAddDate=");
		builder.append(updateAddDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
