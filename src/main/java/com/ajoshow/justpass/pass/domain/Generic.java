package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.Style;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.ajoshow.justpass.annoation.pass.TopLevelKey;

@Entity
@DiscriminatorValue("generic")
public class Generic extends Pass {

	
	private static final long serialVersionUID = 2715788353427365741L;
	
	/**
	 * Information specific to a generic pass.
	 */
	@Embedded
	@TopLevelKey(Style)
	private Structure generic;
}
