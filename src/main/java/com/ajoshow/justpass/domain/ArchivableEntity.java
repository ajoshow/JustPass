package com.ajoshow.justpass.domain;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ArchivableEntity extends AbstractEntity{
	private static final long serialVersionUID = -8425848375272025318L;
	
	private LocalDateTime archivedAt;
	
	private Long archivedBy;
	
	private boolean archived = false;
	
}
