package com.example.viewpager2withbottomnavi;

import java.io.Serializable;

public class MoveInfoModel implements Serializable {
    int movieImage;
    String title;

    public MoveInfoModel(int movieImage, String title) {
        this.movieImage = movieImage;
        this.title = title;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MoveInfoModel{");
        sb.append("movieImage=").append(movieImage);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
