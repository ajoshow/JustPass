package com.ajoshow.justpass.pass.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ajoshow.justpass.annoation.pass.LowerLevelKey;
import com.ajoshow.justpass.annoation.pass.TopLevelKey;
import com.ajoshow.justpass.domain.AbstractEntity;
import static com.ajoshow.justpass.pass.domain.PassKeyType.*;
import com.ajoshow.justpass.validation.constraints.Mandatory;

@TopLevelKey(Relevance)
@Entity
@Table(name = "pass_beacon")
public class Beacon extends AbstractEntity {
	
	private static final long serialVersionUID = -3255034373845844165L;

	/**
	 * Major identifier of a Bluetooth Low Energy location beacon
	 */
	@LowerLevelKey(Beacon)
	private Integer major;

	/**
	 * Minor identifier of a Bluetooth Low Energy location beacon
	 */
	@LowerLevelKey(Beacon)
	private Integer minor;

	/**
	 * Unique identifier of a Bluetooth Low Energy location beacon.
	 * 
	 */
	@Mandatory
	@LowerLevelKey(Beacon)
	private String proximityUUID;

	/**
	 * Text displayed on the lock screen when the pass is currently relevant.
	 * For example, a description of the nearby location such as “Store nearby
	 * on 1st and Main.”
	 */
	@LowerLevelKey(Beacon)
	private String relevantText;

}
