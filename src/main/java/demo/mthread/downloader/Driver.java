package demo.mthread.downloader;

/**
 * Created by owen on 2017/5/29.
 */
public class Driver {
    public static void main(String[] args) {
        Thread dowmloadThread = null;
        for(String url:args){
            dowmloadThread = new Thread(new FileDownloader(url));
            dowmloadThread.start();
        }

    }
}
