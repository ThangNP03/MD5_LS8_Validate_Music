package ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Music;
import ra.repository.IMusicRepository;

import java.util.Optional;
@Service
public class MusicService implements IMusicService{
    @Autowired
    private IMusicRepository musicRepository;
    @Override
    public Iterable<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Optional<Music> findById(Long id) {
        return musicRepository.findById(id);
    }

    @Override
    public void save(Music music) {
            musicRepository.save(music);
    }

    @Override
    public void remove(Long id) {
        musicRepository.deleteById(id);
    }
}
