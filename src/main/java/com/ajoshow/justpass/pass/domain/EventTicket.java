package com.ajoshow.justpass.pass.domain;

import static com.ajoshow.justpass.pass.domain.PassKeyType.Style;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.ajoshow.justpass.annoation.pass.TopLevelKey;

@Entity
@DiscriminatorValue("eventTicket")
public class EventTicket extends Pass {

	private static final long serialVersionUID = -4999781548252790621L;

	/**
	 * Information specific to an event ticket.
	 */
	@Embedded
	@TopLevelKey(Style)
	private Structure eventTicket;
}
