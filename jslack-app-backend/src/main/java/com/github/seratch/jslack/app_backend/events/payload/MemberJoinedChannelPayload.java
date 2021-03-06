package com.github.seratch.jslack.app_backend.events.payload;

import com.github.seratch.jslack.api.model.event.MemberJoinedChannelEvent;
import lombok.Data;

import java.util.List;

@Data
public class MemberJoinedChannelPayload implements EventsApiPayload<MemberJoinedChannelEvent> {

    private String token;
    private String teamId;
    private String apiAppId;
    private MemberJoinedChannelEvent event;
    private String type;
    private List<String> authedUsers;
    private String eventId;
    private Integer eventTime;

}
