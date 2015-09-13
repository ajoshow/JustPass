package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.Style;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.ajoshow.justpass.annoation.pass.TopLevelKey;

@Entity
@DiscriminatorValue("coupon")
public class Coupon extends Pass {
	private static final long serialVersionUID = 1906205626608026865L;

	/**
	 * Information specific to a coupon.
	 */
	@Embedded
	@TopLevelKey(Style)
	private Structure coupon;
}
