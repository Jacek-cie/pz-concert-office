package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService <DTO extends AbstractDto,ENTITY extends AbstractBaseEntity > {
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
    public Long insertNew(DTO dto){
        if(dto.id != null) {
            ENTITY existingEntity = toEntity(dto);
            repository.save(existingEntity);
            return dto.id;
        }else{
            ENTITY newEntity = toEntity(dto);
            repository.save(newEntity);
            return newEntity.getId();
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
