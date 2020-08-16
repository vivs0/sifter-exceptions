package com.sifter.etl.exceptions;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ErrorLog")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorLog {

	@Id
	@GeneratedValue(generator = "log_id")
	@SequenceGenerator(
		name = "log_id",
		sequenceName = "log_sequence",
		initialValue = 100
			)
	private Long id;
	
	private String detail;
}
