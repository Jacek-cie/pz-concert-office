package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.type.ConcertTypeService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.ConcertDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Concert;

@Service
public class ConcertService extends AbstractService<ConcertDto,Concert> {

    @Autowired
    private ConcertTypeService concertTypeService;
    @Override
    public ConcertDto toDto(Concert entity) {
        ConcertDto dto = new ConcertDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.timeStart = entity.getTimeStart();
        dto.idConcertType = entity.getConcertType().getId();
        dto.timeEnd =entity.getTimeEnd();
        dto.idSchool =entity.getSchool().getId();
        return dto;
    }

    @Override
    public Concert toEntity(ConcertDto dto) {
        Concert entity = new Concert();
        entity.setId(dto.id);
        entity.setVersion(dto.version );
        entity.setTimeStart(dto.timeStart);
        entity.setTimeEnd(dto.timeEnd);
        entity.getSchool().setId(dto.idSchool);
        entity.setConcertType(concertTypeService.findEntityById(dto.idConcertType));
        return entity;
    }
}
