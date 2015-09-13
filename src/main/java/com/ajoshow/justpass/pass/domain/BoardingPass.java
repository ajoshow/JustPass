package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.Style;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.ajoshow.justpass.annoation.pass.TopLevelKey;

@Entity
@DiscriminatorValue("boardingPass")
public class BoardingPass extends Pass {
	private static final long serialVersionUID = -5027713197087205856L;

	/**
	 * Information specific to a boarding pass.
	 */
	@Embedded
	@TopLevelKey(Style)
	private Structure boardingPass;
}
