package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.AssociatedApp;
import static com.ajoshow.justpass.pass.domain.PassKeyType.CompanionApp;
import static com.ajoshow.justpass.pass.domain.PassKeyType.Expiration;
import static com.ajoshow.justpass.pass.domain.PassKeyType.*;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

import com.ajoshow.justpass.annoation.pass.TopLevelKey;
import com.ajoshow.justpass.domain.ArchivableEntity;
import com.ajoshow.justpass.validation.constraints.JsonString;
import com.ajoshow.justpass.validation.constraints.Mandatory;
import com.ajoshow.justpass.validation.constraints.RGBtriple;

@Entity
@Table(name = "pass")
public class Pass extends ArchivableEntity {
	private static final long serialVersionUID = -6161422537951284548L;

	/**
	 * Brief description of the pass, used by the iOS accessibility
	 * technologies. Don’t try to include all of the data on the pass in its
	 * description, just include enough detail to distinguish passes of the same
	 * type.
	 */
	@Mandatory
	@TopLevelKey(Standard)
	private String description;

	/**
	 * Version of the file format. The value must be 1.
	 */
	@Min(1)
	@Mandatory
	@TopLevelKey(Standard)
	private int formatVersion;

	/**
	 * Display name of the organization that originated and signed the pass.
	 * 
	 */
	@Mandatory
	@TopLevelKey(Standard)
	private String organizationName;

	/**
	 * Pass type identifier, as issued by Apple. The value must correspond with
	 * your signing certificate.
	 */
	@Mandatory
	@TopLevelKey(Standard)
	private String passTypeIdentifier;

	/**
	 * Serial number that uniquely identifies the pass. No two passes with the
	 * same pass type identifier may have the same serial number.
	 * 
	 */
	@Mandatory
	@TopLevelKey(Standard)
	private String serialNumber;

	/**
	 * Team identifier of the organization that originated and signed the pass,
	 * as issued by Apple.
	 * 
	 */
	@Mandatory
	@TopLevelKey(Standard)
	private String teamIdentifier;

	/**
	 * A URL to be passed to the associated app when launching it. The app
	 * receives this URL in the application: didFinishLaunchingWithOptions: and
	 * application: handleOpenURL: methods of its app delegate. If this key is
	 * present, the associatedStoreIdentifiers key must also be present.
	 */
	@TopLevelKey(AssociatedApp)
	private String appLaunchURL;

	/**
	 * A list of iTunes Store item identifiers for the associated apps. Only one
	 * item in the list is used—the first item identifier for an app compatible
	 * with the current device. If the app is not installed, the link opens the
	 * App Store and shows the app. If the app is already installed, the link
	 * launches the app.
	 */
	@TopLevelKey(AssociatedApp)
	private List<Long> associatedStoreIdentifiers;

	/**
	 * Custom information for companion apps. This data is not displayed to the
	 * user. For example, a pass for a cafe could include information about the
	 * user’s favorite drink and sandwich in a machine-readable form for the
	 * companion app to read, making it easy to place an order for “the usual”
	 * from the app.
	 */
	@JsonString
	@TopLevelKey(CompanionApp)
	private String userInfo;

	/**
	 * Date and time when the pass expires. The value must be a complete date
	 * with hours and minutes, and may optionally include seconds
	 */
	@TopLevelKey(Expiration)
	private LocalDateTime expirationDate;

	/**
	 * Indicates that the pass is void—for example, a one time use coupon that
	 * has been redeemed. The default value is false.
	 */
	@TopLevelKey(Expiration)
	private Boolean voided;

	/**
	 * Beacons marking locations where the pass is relevant.
	 */
	@TopLevelKey(Relevance)
	private List<Beacon> beacons;

	/**
	 * Locations where the pass is relevant. For example, the location of your
	 * store.
	 */
	@TopLevelKey(Relevance)
	private List<Location> locaitons;

	/**
	 * Maximum distance in meters from a relevant latitude and longitude that
	 * the pass is relevant. This number is compared to the pass’s default
	 * distance and the smaller value is used.
	 */
	@TopLevelKey(Relevance)
	private Double maxDistance;

	/**
	 * Date and time when the pass becomes relevant. For example, the start time
	 * of a movie. The value must be a complete date with hours and minutes, and
	 * may optionally include seconds.
	 */
	@TopLevelKey(Relevance)
	private LocalDateTime relevantDate;

	/**
	 * Information specific to barcodes.
	 */
	@TopLevelKey(VisualAppearance)
	private Barcode barcode;

	/**
	 * Background color of the pass, specified as an CSS-style RGB triple. For
	 * example, rgb(23, 187, 82).
	 */
	@RGBtriple
	@TopLevelKey(VisualAppearance)
	private String backgroundColor;

	/**
	 * Foreground color of the pass, specified as a CSS-style RGB triple. For
	 * example, rgb(100, 10, 110).
	 * 
	 */
	@RGBtriple
	@TopLevelKey(VisualAppearance)
	private String foregroundColor;

	/**
	 * Optional for event tickets and boarding passes; otherwise not allowed.
	 * Identifier used to group related passes. If a grouping identifier is
	 * specified, passes with the same style, pass type identifier, and grouping
	 * identifier are displayed as a group. Otherwise, passes are grouped
	 * automatically. Use this to group passes that are tightly related, such as
	 * the boarding passesfor different connections of the same trip
	 */
	@TopLevelKey(VisualAppearance)
	private String groupingIdentifier;

	/**
	 * Color of the label text, specified as a CSS-style RGB triple. For
	 * example, rgb(255, 255, 255).
	 * 
	 */
	@RGBtriple
	@TopLevelKey(VisualAppearance)
	private String labelColor;

	/**
	 * Text displayed next to the logo on the pass.
	 */
	@TopLevelKey(VisualAppearance)
	private String logoText;

	/**
	 * deprecated. If true, the strip image is displayed without a shine effect.
	 * The default value prior to iOS 7.0 is false.
	 * 
	 * @Deprecated In iOS 7.0, a shine effect is never applied, and this key is
	 * 
	 */
	@Deprecated
	@TopLevelKey(VisualAppearance)
	private Boolean suppressStripShine;

	/**
	 * The authentication token to use with the web service. The token must be
	 * 16 characters or longer.
	 * 
	 */
	@Length(min = 16, max = 16)
	@TopLevelKey(WebService)
	private String authenticationToken;

	/**
	 * The URL of a web service that conforms to the API described in Passbook
	 * Web Service Reference . The web service must use the HTTPS protocol; the
	 * leading https:// is included in the value of this key. On devices
	 * configured for development, there is UI in Settings to allow HTTP web
	 * services.
	 * 
	 */
	@TopLevelKey(WebService)
	private String webServiceURL;
}
