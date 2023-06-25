package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController  <service extends AbstractService,DTO extends AbstractDto,ENTITY extends AbstractBaseEntity>{
    @Autowired
    private  AbstractService<DTO,ENTITY> service;


    @GetMapping("")
    public List<DTO> getAll(){
        return service.getAll();
    }
    @GetMapping("{id}")
    public DTO getById(@PathVariable("id") Long id){
        return (DTO) service.findById(id);
    }
    @PostMapping("")
    public void insertNew(@RequestBody DTO dto){
        service.insertNew(dto);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long id){
        service.deleteById(id);
    }
}
