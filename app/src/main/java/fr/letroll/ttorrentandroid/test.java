package fr.letroll.ttorrentandroid;

import android.app.Activity;
import android.os.Bundle;

import javax.annotation.Nonnull;

import fr.letroll.ttorrentandroid.client.Client;
import fr.letroll.ttorrentandroid.client.ClientListener;
import fr.letroll.ttorrentandroid.client.TorrentHandler;

/**
 * Created by jquievreux on 08/08/2014.
 */
public class test extends Activity implements ClientListener {

    /**
     * VARIABLES *
     */
    public final static String TAG = "test";

    /**
     * OBJECTS *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





 /*       try {
            client = new Client(
                    // This is the interface the client will listen on (you might need something
                    // else than localhost here).
                    InetAddress.getLocalHost(),

                    // Load the torrent from the torrent file and use the given
                    // output directory. Partials downloads are automatically recovered.
                    SharedTorrent.fromFile(
                            new File("/path/to/your.torrent"),
                            new File("/path/to/output/directory")));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    // You can optionally set download/upload rate limits
    // in kB/second. Setting a limit to 0.0 disables rate
    // limits.
//            client.setMaxDownloadRate(50.0);
//            client.setMaxUploadRate(50.0);

    // At this point, can you either call download() to download the torrent and
    // stop immediately after...
//            client.download();

    // Or call client.share(...) with a seed time in seconds:
    // client.share(3600);
    // Which would seed the torrent for an hour after the download is complete.

    // Downloading and seeding is done in background threads.
    // To wait for this process to finish, call:
//            client.waitForCompletion();

    // At any time you can call client.stop() to interrupt the download.
        }

    @Override
    public void clientStateChanged(@Nonnull Client client, @Nonnull Client.State state) {

    }

    @Override
    public void torrentStateChanged(@Nonnull Client client, @Nonnull TorrentHandler torrent, @Nonnull TorrentHandler.State state) {

    }
}
