package ra.service;

import ra.model.Music;

import java.util.Optional;

public interface IMusicService {
    Iterable<Music> findAll();
    Optional<Music> findById(Long id);
    void save(Music music);
    void remove(Long id);
}
