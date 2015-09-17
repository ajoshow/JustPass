package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.ApplePay;
import static com.ajoshow.justpass.pass.domain.PassKeyType.NFC;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ajoshow.justpass.annoation.pass.LowerLevelKey;
import com.ajoshow.justpass.annoation.pass.TopLevelKey;
import com.ajoshow.justpass.domain.AbstractEntity;
import com.ajoshow.justpass.validation.constraints.Mandatory;

@TopLevelKey(ApplePay)
@Entity
@Table(name = "pass_nfc")
public class NFC extends AbstractEntity {

	private static final long serialVersionUID = 906825266523311923L;

	/**
	 * The payload to be transmitted to the Apple Pay terminal. Must be 64 bytes
	 * or less. Messages longer than 64 bytes are truncated by the system.
	 */
	@Mandatory
	@LowerLevelKey(NFC)
	private String message;

	/**
	 * The public encryption key used by the Value Added Services protocol. Use
	 * a Base64 encoded X.509 SubjectPublicKeyInfo structure containing a ECDH
	 * public key for group P256.
	 */
	@LowerLevelKey(NFC)
	private String encryptionPublicKey;
}
