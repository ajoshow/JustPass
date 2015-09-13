package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.PassStructure;
import static com.ajoshow.justpass.pass.domain.PassKeyType.Style;

import java.util.List;

import javax.persistence.Embeddable;

import com.ajoshow.justpass.annoation.pass.LowerLevelKey;
import com.ajoshow.justpass.annoation.pass.TopLevelKey;

@TopLevelKey(Style)
@Embeddable
public class Structure {

	/**
	 * Fields to be displayed in the header on the front of the pass. Use header
	 * fields sparingly; unlike all other fields, they remain visible when a
	 * stack of passes are displayed.
	 * 
	 */
	@LowerLevelKey(PassStructure)
	private List<Field> headerFields;

	/**
	 * Fields to be on the back of the pass.
	 * 
	 */
	@LowerLevelKey(PassStructure)
	private List<Field> backFields;

	/**
	 * Fields to be displayed prominently on the front of the pass.
	 */
	@LowerLevelKey(PassStructure)
	private List<Field> primaryFields;

	/**
	 * Fields to be displayed on the front of the pass.
	 * 
	 */
	@LowerLevelKey(PassStructure)
	private List<Field> secondaryFields;

	/**
	 * Additional fields to be displayed on the front of the pass.
	 */
	@LowerLevelKey(PassStructure)
	private List<Field> auxiliaryFields;

	/**
	 * Required for boarding passes; otherwise not allowed. Type of transit.
	 */
	@LowerLevelKey(PassStructure)
	private TransitType transitType;
}
