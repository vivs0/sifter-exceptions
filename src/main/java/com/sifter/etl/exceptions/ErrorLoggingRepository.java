package com.sifter.etl.exceptions;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorLoggingRepository extends JpaRepository<ErrorLog, Long>{

}
