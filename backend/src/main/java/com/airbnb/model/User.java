package com.airbnb.model;



import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype", 
  discriminatorType = DiscriminatorType.STRING)
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String name;
	
	@Column
	private String lastName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;
	

}
