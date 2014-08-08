/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.letroll.ttorrentandroid.client;

/**
 *
 * @author shevek
 */
public class ClientListenerAdapter implements ClientListener {

    @Override
    public void clientStateChanged(Client client, Client.State state) {
    }

    @Override
    public void torrentStateChanged(Client client, TorrentHandler torrent, TorrentHandler.State state) {
    }
}
