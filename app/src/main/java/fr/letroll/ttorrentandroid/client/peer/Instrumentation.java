/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.letroll.ttorrentandroid.client.peer;

import fr.letroll.ttorrentandroid.client.PeerPieceProvider;
import fr.letroll.ttorrentandroid.client.io.PeerMessage;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * This is a hook class to interject cheeky behaviour into the client(s).
 *
 * @author shevek
 */
public class Instrumentation {

    public void instrumentThrowable(@Nonnull Object source, @Nonnull Throwable t) {
    }

    @CheckForNull
    public PeerMessage.RequestMessage instrumentBlockRequest(@Nonnull PeerHandler peer, @Nonnull PeerPieceProvider provider, @CheckForNull PeerMessage.RequestMessage request) {
        return request;
    }
}
