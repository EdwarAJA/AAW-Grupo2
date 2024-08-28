package pe.edu.upc.recomendaciones.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.recomendaciones.entities.Recomendacion;
import pe.edu.upc.recomendaciones.repositories.IRecomendacionRepository;
import pe.edu.upc.recomendaciones.servicesinterfaces.IRecomendacionService;
import java.util.List;
@Service
public class RecomendacionServiceImplement implements IRecomendacionService {
    @Autowired
    private IRecomendacionRepository rR;

    @Override
    public void insert(Recomendacion recomendacion) {rR.save(recomendacion);}

    @Override
    public List<Recomendacion> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id_recomendacion) {
        rR.deleteById(id_recomendacion);
    }

    @Override
    public Recomendacion listId(int id_recomendacion) {
        return rR.findById(id_recomendacion).orElse(new Recomendacion());
    }

    @Override
    public void update(Recomendacion recomendacion) {
        rR.save(recomendacion);
    }

    @Override
    public List<Recomendacion> buscar(String descripcion) { return rR.buscarPorDescripcion(descripcion);
    }
}
