package com.stephenbrown.bx.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


//...
@Entity
@Table(name="users")
public class User {
 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotEmpty(message="Username is required")
	 @Size (min=3, max=20, message="Username must be 3-20 charachters")
	 private String userName;
	
	 @NotEmpty(message="Email is required")
	 @Email (message="Please enter a valid email")
	 private String email;
	 
	 @NotEmpty(message="Password is required") 
	 @Size (min=8, message="Password must be at least 8 charachters")
	 private String password;
	
	 @Transient
	 @NotEmpty(message="Confirm Password is required")
	 @Size (min=8, message="Confirm Password must be at least 8 charachters")
	 private String confirm;
	
	 @Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;

	 @OneToMany(mappedBy="postedBy", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	 	private List<Show> showsPosted;

	
	public List<Show> getShowsPosted() {
		return showsPosted;
	}

	public void setShowsPosted(List<Show> showsPosted) {
		this.showsPosted = showsPosted;
	}

	public User() {
	     
	 }
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirm() {
		return confirm;
	}
	
	public void setConfirm(String confirm) {
		this.confirm = confirm;
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