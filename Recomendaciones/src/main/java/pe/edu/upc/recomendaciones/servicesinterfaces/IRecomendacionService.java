package pe.edu.upc.recomendaciones.servicesinterfaces;

import pe.edu.upc.recomendaciones.entities.Recomendacion;

import java.util.List;

public interface IRecomendacionService {
    public void insert(Recomendacion recomendacion);

    public List<Recomendacion> list();

    public void delete(int id_recomendacion);

    public Recomendacion listId(int id_recomendacion);

    public void update(Recomendacion recomendacion);

    public List<Recomendacion>buscar(String descrpcion);
}
