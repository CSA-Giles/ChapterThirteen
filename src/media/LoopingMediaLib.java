package media;

public class LoopingMediaLib {

    public static void main(String[] args){

        String songInfo = MediaFile.readString();
//        while (songInfo != null){
//            System.out.println(MediaFile.readString());
//            songInfo = MediaFile.readString();
//        }
        while (songInfo != null){
            String title = songInfo.substring(0, songInfo.indexOf("|"));

            String rating = songInfo.substring(songInfo.indexOf("|") + 1, songInfo.length());

            System.out.println("Title: " + title);
            System.out.println("Rating: " + rating);
            songInfo = MediaFile.readString();
        }
    }
}
