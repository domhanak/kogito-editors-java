package org.jboss.errai.bus.server.security.auth;

import org.jboss.errai.client.bus.CommandMessage;

public interface AuthDescriptor {
    public boolean isAuthorized(CommandMessage message);
    public void addAuthorization(Role role);
}
