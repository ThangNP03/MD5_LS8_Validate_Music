package ra.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ra.model.Music;
@Repository
public interface IMusicRepository extends CrudRepository<Music, Long> {
}
