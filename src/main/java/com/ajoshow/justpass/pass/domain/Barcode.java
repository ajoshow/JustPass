package com.ajoshow.justpass.pass.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ajoshow.justpass.annoation.pass.LowerLevelKey;
import com.ajoshow.justpass.annoation.pass.TopLevelKey;
import com.ajoshow.justpass.domain.AbstractEntity;
import static com.ajoshow.justpass.pass.domain.PassKeyType.*;
import com.ajoshow.justpass.validation.constraints.Mandatory;

@TopLevelKey(VisualAppearance)
@Entity
@Table(name = "pass_barcode")
public class Barcode extends AbstractEntity {

	private static final long serialVersionUID = 665087935074971467L;

	/**
	 * Text displayed near the barcode. For example, a human-readable version of
	 * the barcode data in case the barcode doesn’t scan.
	 */
	@LowerLevelKey(Barcode)
	private String altText;

	/**
	 * Barcode format.
	 */
	@Mandatory
	@LowerLevelKey(Barcode)
	private BarcodeFormat format;

	/**
	 * Message or payload to be displayed as a barcode
	 */
	@Mandatory
	@LowerLevelKey(Barcode)
	private String message;

	/**
	 * Text encoding that is used to convert the message from the string
	 * representation to a data representation to render the barcode. The value
	 * is typically iso-8859-1, but you may use another encoding that is
	 * supported by your barcode scanning infrastructure
	 */
	@Mandatory
	@LowerLevelKey(Beacon)
	private String messageEncoding;

}
