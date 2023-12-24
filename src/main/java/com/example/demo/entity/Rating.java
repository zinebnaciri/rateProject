package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Rating {
    public Long getAppareil_id() {
		return appareil_id;
	}
	public void setAppareil_id(Long appareil_id) {
		this.appareil_id = appareil_id;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
    private Long appareil_id;
    private int rate;
    private Long user_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

}
