package org.a1019464589.commons.processors;

import org.a1019464589.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}
