package com.stephenbrown.speedrun.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, message="Brand must not be blank.")
    private String brand;
    
    @NotNull
    @Size(min = 5, max=20, message="Please enter between 5 to 20 characters for the description.")
    private String description;
    
    @NotNull
    @Size(min = 1, max=3, message="Please enter the unit.")
    private String unit;
     
    @NotNull
    @Size(min = 1, max=3, message="Please enter the size.")
    private Integer size;
    
    @NotNull
    @Size(min = 1, max=5, message="Please enter the price.")
    private Double price;
    
    @NotNull
    @Size(min = 1, max=3, message="Please enter the aisle.")
    private Integer aisle;
     
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    @OneToMany(mappedBy="item", fetch=FetchType.LAZY)
    private List<Order_Items> order_items;
        
	public List<Order_Items> getOrder_items() {
		return order_items;
	}

	public void setOrder_items(List<Order_Items> order_items) {
		this.order_items = order_items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAisle() {
		return aisle;
	}

	public void setAisle(Integer aisle) {
		this.aisle = aisle;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}  
}
