package com.SpringJpaTest.Controller;

import com.SpringJpaTest.Entity.Track;
import com.SpringJpaTest.Service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/tracks")
public class TrackController {

    @Autowired
    private TrackService trackService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Track> getAllTracks(){
        return trackService.getAllTracks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Track getTrackById(@PathVariable("id") int id){
        return trackService.getTrackById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTrackById(@PathVariable("id") int id){
        trackService.removeTrackById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteTrackById(@RequestBody Track track){
        trackService.updateTrack(track);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertTrack(@RequestBody Track track){
        trackService.insertTrack(track);
    }
}