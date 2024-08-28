package pe.edu.upc.recomendaciones.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.recomendaciones.dtos.RecomendacionDTO;
import pe.edu.upc.recomendaciones.entities.Recomendacion;
import pe.edu.upc.recomendaciones.servicesinterfaces.IRecomendacionService;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/recomendaciones")
public class RecomendacionController {

    @Autowired
    private IRecomendacionService rs;

    @PostMapping
    public void Registrar (@RequestBody RecomendacionDTO dto){
        ModelMapper m = new ModelMapper();
        Recomendacion d = m.map(dto, Recomendacion.class);
        rs.insert(d);
    }

    @GetMapping
    public List<RecomendacionDTO> listar() {
        return rs.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecomendacionDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rs.delete(id);
    }

    @GetMapping("/{id}")
    public RecomendacionDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        RecomendacionDTO dto=m.map(rs.listId(id),RecomendacionDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody RecomendacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Recomendacion d = m.map(dto, Recomendacion.class);
        rs.update(d);
    }

    @GetMapping("/buscar")
    public List<RecomendacionDTO> buscar(@RequestParam String descripcion) {
        return rs.buscar(descripcion).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecomendacionDTO.class);
        }).collect(Collectors.toList());
    }


}
