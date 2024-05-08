package com.cbi.SearchHotel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
public class Hotel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	@Column
    private String ename;
	@Column
    private String lien;
	@Column
    private String photo;
	@Column
    private int stars;
	@Column 
	private String ville;

}
