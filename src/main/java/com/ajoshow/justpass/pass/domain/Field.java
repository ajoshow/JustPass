package com.ajoshow.justpass.pass.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ajoshow.justpass.annoation.pass.FieldDictKey;
import com.ajoshow.justpass.domain.AbstractEntity;
import com.ajoshow.justpass.validation.constraints.CurrencyCode;
import com.ajoshow.justpass.validation.constraints.Mandatory;

import static com.ajoshow.justpass.pass.domain.PassKeyType.*;

import java.util.List;

@Entity
@Table(name = "pass_field")
public class Field extends AbstractEntity {

	private static final long serialVersionUID = 1205846718678575952L;

	/**
	 * Attributed value of the field. The value may contain HTML markup for
	 * links. Only the <a> tag and its href attribute are supported. For
	 * example, the following is key/value pair specifies a link with the text
	 * “Edit my profile”: "attributedValue": "
	 * <a href='http://example.com/customers/123'>Edit my profile</a>" This
	 * key’s value overrides the text specified by the value key.
	 */
	@FieldDictKey(StandardField)
	private String attributedValue;

	/**
	 * Format string for the alert text that is displayed when the pass is
	 * updated. The format string must contain the escape %@, which is replaced
	 * with the field’s new value. For example, “Gate changed to %@.” If you
	 * don’t specify a change message, the user isn’t notified when the field
	 * changes.
	 * 
	 */
	@FieldDictKey(StandardField)
	private String changeMessage;

	/**
	 * Data dectors that are applied to the field’s value. The default value is
	 * all data detectors. Provide an empty array to use no data detectors. Data
	 * detectors are applied only to back fields.
	 */
	@FieldDictKey(StandardField)
	private List<DataDetectorType> dataDetectorTypes;

	/**
	 * The key must be unique within the scope of the entire pass. For example,
	 * “departure-gate”.
	 */
	@Mandatory
	@FieldDictKey(StandardField)
	private String key;

	/**
	 * Label text for the field.
	 */
	@FieldDictKey(StandardField)
	private String label;

	/**
	 * Alignment for the field’s contents. The default value is natural
	 * alignment, which alignsthe text appropriately based on its script
	 * direction. This key is not allowed for primary fields or back fields.
	 * 
	 */
	@FieldDictKey(StandardField)
	private TextAlignment textAlignment;

	/**
	 * Value of the field. For example, 42.
	 * 
	 */
	@Mandatory
	@FieldDictKey(StandardField)
	private String value;

	/**
	 * Style of date to display.
	 */
	@FieldDictKey(DateStyle)
	private DateStyle dateStyle;

	/**
	 * Always display the time and date in the given time zone, not in the
	 * user’s current time zone. The default value is false. The format for a
	 * date and time always requires a time zone, even if it will be ignored.
	 * For backward compatibility with iOS 6, provide an appropriate time zone,
	 * so that the information is displayed meaningfully even without ignoring
	 * time zones. This key does not affect how relevance is calculated.
	 * 
	 */
	@FieldDictKey(DateStyle)
	private Boolean ignoresTimeZone;

	/**
	 * If true, the label’s value is displayed as a relative date; otherwise, it
	 * is displayed as an absolute date. The default value is false. This does
	 * not affect how relevance is calculated.
	 * 
	 */
	@FieldDictKey(DateStyle)
	private Boolean isRelative;

	/**
	 * Style of time to display.
	 */
	@FieldDictKey(DateStyle)
	private DateStyle timeStyle;
	
	/**
	 * ISO 4217 currency code for the field’s value.
	 */
	@CurrencyCode
	@FieldDictKey(NumberStyle)
	private String currencyCode;
	
	/**
	 * Style of number to display
	 */
	@FieldDictKey(NumberStyle)
	private String numberStyle;

}
