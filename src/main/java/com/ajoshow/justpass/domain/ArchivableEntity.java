package com.ajoshow.justpass.domain;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public abstract class ArchivableEntity extends AbstractEntity{
	private static final long serialVersionUID = -8425848375272025318L;
	
	private LocalDateTime archivedAt;
	
	private Long archivedBy;
	
	private boolean archived = false;
	
}
