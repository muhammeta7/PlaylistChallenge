package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int goForward = 0;
        int goBackwards = 0;

        // Counter for song selection to right of index
        for (int i = startIndex; i < playList.length-1; i++) {

            if(i  == playList.length-1) {
                startIndex = 0;
            }

            if(!selection.equals(playList[i])) {
                goForward++;
            }
            else {
                i = playList.length;
            }

        }

        // Counter for song selection to left of index
        for (int i = startIndex; i < playList.length ; i--) {

            if(i == -1) {
                i = playList.length-1;
            }

            if(!selection.equals(playList[i])) {
                goBackwards++;
            }
            else {
                i = playList.length + 1;
            }
        }

       return Math.min(goBackwards, goForward);

    }
}
