package com.stephenbrown.bookClub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 5, message="Please enter more than 5 charachters")
    private String bookName;
    @NotNull
    @Size(min = 5, message="Please enter more than 5 charachters")
    private String authorName;
    @NotNull
    @Size(min = 3, message="Please enter more than 5 charachters") 
    private String postedBy;
    @NotNull
    private String notes;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="user_id")
    //private User user;
    
    //public User getUser() {
	//	return user;
	//}

	//public void setUser(User user) {
	//	this.user = user;
	//}

	public Book() {
    }
    
    public Book(String bookName, String authorName, String postedBy, String notes) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.postedBy = postedBy;
        this.notes = notes;
        
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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