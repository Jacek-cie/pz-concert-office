package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService <DTO extends AbstractDto,ENTITY extends AbstractBaseEntity> {
    @Autowired
    protected JpaRepository<ENTITY,Long> repository;
    public List<DTO> getAll(){
        List<ENTITY> entityList =repository.findAll();
        List<DTO> dtoList = new ArrayList<>();
        for(ENTITY entity:entityList){
            dtoList.add(toDto(entity));
        }
        return dtoList;
    }
    public DTO insertNew(DTO dto){
        if(dto.id == null) {
            dto.version=  1;
            ENTITY existingEntity = toEntity(dto);
            ENTITY saved=repository.save(existingEntity);
            return toDto(saved);
        }else{
            ENTITY newEntity = toEntity(dto);
            ENTITY saved =repository.save(newEntity);
            return toDto(saved);
        }
    }
    public DTO findById(Long id){
        Optional<ENTITY> foundDto =repository.findById(id);
        ENTITY entity = foundDto.get();
        return toDto(entity);
    }
    public ENTITY findEntityById(Long id){
        Optional<ENTITY> foundDto =repository.findById(id);
        ENTITY entity = foundDto.get();
        return entity;
    }
    public void deleteById(Long id){
        repository.deleteById(id);
    }
    public abstract DTO toDto(ENTITY entity);
    public abstract ENTITY toEntity(DTO dto);
}
