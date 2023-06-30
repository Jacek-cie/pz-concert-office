package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController  <service extends AbstractService,DTO extends AbstractDto,ENTITY extends AbstractBaseEntity>{
    @Autowired
    private  AbstractService<DTO,ENTITY> service;
    @GetMapping("")
    public List<DTO> getAll(){
        return service.getAll();
    }
    @GetMapping(":{id}")
    public DTO getById(@PathVariable("id") Long id){
        return (DTO) service.findById(id);
    }
    @PostMapping("create-new")
    public ResponseEntity<ResponseData> insertNew(@RequestBody DTO dto){

        ResponseData data= new ResponseData();
        try{
            DTO insertedDto = service.insertNew(dto);

            data.status="success";
            data.data=insertedDto;
            return ResponseEntity.status(HttpStatus.OK)
                    .body(data);
        }catch (Exception e){
            data.status="failed";
            data.exception=e.toString();
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(data);
        }
    }
    @DeleteMapping(":{id}")
    public ResponseEntity<ResponseData> deleteById(@PathVariable("id") Long id){
        ResponseData data= new ResponseData();
        try{
            service.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(data);
        }catch (Exception e){
            data.status="failed";
            data.exception=e.toString();
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(data);
        }
    }
}
