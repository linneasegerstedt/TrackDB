package com.SpringJpaTest.Dao;

import com.SpringJpaTest.Entity.Track;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

/**
 * Created by lise on 06/02/2017.
 */

@Repository
@Qualifier("db2")
public class TrackDao {


    private static Map<Integer, Track> tracks;

    static {

        tracks = new HashMap<Integer, Track>(){

            {
                put(1, new Track(1069, "Sunday Crunk", "Mefjus"));
                put(2, new Track(1070, "Mind Games", "Emperor"));
                put(3, new Track(1071, "Headlock", "Rene LaVice"));
            }
        };
    }

        
    public Collection<Track> getAllTracks(){
        return this.tracks.values();
    }


    public Track getTrackById(int id){
        return this.tracks.get(id);
    }


    public void removeTrackById(int id) {
        this.tracks.remove(id);
    }


    public void updateTrack(Track track){
        Track s = tracks.get(track.getId());
        s.setTitle(track.getTitle());
        s.setArtist(track.getArtist());
        tracks.put(track.getId(), track);
    }


    public void insertTrackToDb(Track track) {
        this.tracks.put(track.getId(), track);
    }

}
