package pe.edu.upc.recomendaciones.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.recomendaciones.entities.Recomendacion;
import java.util.List;
@Repository
public interface IRecomendacionRepository extends JpaRepository<Recomendacion, Integer>{
    @Query("SELECT d FROM Recomendacion d WHERE d.descripcion LIKE %:descripcion%")
    public List<Recomendacion> buscarPorDescripcion(@Param("descripcion") String descripcion);
}
