package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.Location;
import static com.ajoshow.justpass.pass.domain.PassKeyType.Relevance;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ajoshow.justpass.annoation.pass.LowerLevelKey;
import com.ajoshow.justpass.annoation.pass.TopLevelKey;
import com.ajoshow.justpass.domain.AbstractEntity;
import com.ajoshow.justpass.validation.constraints.Mandatory;

@TopLevelKey(Relevance)
@Entity
@Table(name = "pass_location")
public class Location extends AbstractEntity {

	private static final long serialVersionUID = 2103855977130322760L;

	/**
	 * Altitude, in meters, of the location.
	 */
	@LowerLevelKey(Location)
	private Double altitude;

	/**
	 * Latitude, in degrees, of the location.
	 */
	@Mandatory
	@LowerLevelKey(Location)
	private Double latitude;

	/**
	 * Longitude, in degrees, of the location.
	 * 
	 */
	@Mandatory
	@LowerLevelKey(Location)
	private Double longitude;

	/**
	 * Text displayed on the lock screen when the pass is currently relevant.
	 * For example, a description of the nearby location such as “Store nearby
	 * on 1st and Main.”
	 * 
	 */
	@LowerLevelKey(Location)
	private String relevantText;
}
