package fr.letroll.ttorrentandroid;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.annotation.Nonnull;

import fr.letroll.ttorrentandroid.client.Client;
import fr.letroll.ttorrentandroid.client.ClientListener;
import fr.letroll.ttorrentandroid.client.TorrentHandler;
import fr.letroll.ttorrentandroid.common.Torrent;


public class MyActivity extends Activity implements ClientListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        String path = Environment.getExternalStorageDirectory().getPath();

        // First, instantiate the Client object.
        Client client = new Client();
        client.addClientListener(this);
        try {
            client.addTorrent(new TorrentHandler(client,new Torrent(new File(path,"archlinux.torrent")),new File(path,"toto")));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        setContentView(R.layout.activity_my);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void clientStateChanged(@Nonnull Client client, @Nonnull Client.State state) {

    }

    @Override
    public void torrentStateChanged(@Nonnull Client client, @Nonnull TorrentHandler torrent, @Nonnull TorrentHandler.State state) {

    }
}
