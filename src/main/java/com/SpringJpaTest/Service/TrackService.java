package com.SpringJpaTest.Service;

import com.SpringJpaTest.Dao.TrackDao;
import com.SpringJpaTest.Entity.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by lise on 06/02/2017.
 */
@Service
public class TrackService {

    @Autowired
    @Qualifier("db2")
    private TrackDao trackDao;

    public Collection<Track> getAllTracks() {
        return this.trackDao.getAllTracks();
    }

    public Track getTrackById(int id){
        return this.trackDao.getTrackById(id);
    }


    public void removeTrackById(int id) {
        this.trackDao.removeTrackById(id);
    }

    public void updateTrack(Track track){
        this.trackDao.updateTrack(track);
    }

    public void insertTrack(Track track) {
        this.trackDao.insertTrackToDb(track);
    }
}
