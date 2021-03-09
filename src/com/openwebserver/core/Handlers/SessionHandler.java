package com.openwebserver.core.Handlers;

import com.openwebserver.core.Annotations.Session;
import com.openwebserver.core.Content.Code;
import com.openwebserver.core.Objects.Request;
import com.openwebserver.core.Objects.Response;
import com.openwebserver.core.WebException;

public interface SessionHandler {

    boolean check(Session annotation, com.openwebserver.core.Sessions.Session session);

    default com.openwebserver.core.Sessions.Session.SessionException decline(Request request, Throwable t){
        return new com.openwebserver.core.Sessions.Session.SessionException(t.getMessage());
    }

}
