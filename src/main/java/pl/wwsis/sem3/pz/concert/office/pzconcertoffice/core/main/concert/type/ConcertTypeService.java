package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.ConcertTypeDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.City;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertType;
@Service
public class ConcertTypeService extends AbstractService<ConcertTypeDto, ConcertType> {


    @Override
    public ConcertTypeDto toDto(ConcertType entity) {
        ConcertTypeDto dto = new ConcertTypeDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.name = entity.getName();
        return dto;
    }

    @Override
    public ConcertType toEntity(ConcertTypeDto dto) {
        ConcertType entity = new ConcertType();
        entity.setName(dto.name);
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        return entity;
    }

}
