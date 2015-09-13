package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.Style;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.ajoshow.justpass.annoation.pass.TopLevelKey;

@Entity
@DiscriminatorValue("storeCard")
public class StoreCard extends Pass {

	private static final long serialVersionUID = -2774158114528621866L;
	
	/**
	 * Information specific to a store card.
	 */
	@Embedded
	@TopLevelKey(Style)
	private Structure storeCard;
}
