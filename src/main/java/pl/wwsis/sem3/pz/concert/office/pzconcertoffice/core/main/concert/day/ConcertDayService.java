package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.ConcertService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.type.ConcertTypeService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.day.DayService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.ConcertDayDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertDay;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.ConcertType;

@Service
public class ConcertDayService extends AbstractService<ConcertDayDto, ConcertDay>  {
    @Autowired
    private ConcertService concertService;

    @Autowired
    private DayService dayService;

    @Override
    public ConcertDayDto toDto(ConcertDay entity) {
        ConcertDayDto dto = new ConcertDayDto();
        dto.id = entity.getId();

        dto.idConcert = entity.getConcert().getId();
        dto.idDay =entity.getDay().getId();

        return dto;
    }

    @Override
    public ConcertDay toEntity(ConcertDayDto dto) {
        ConcertDay entity = new ConcertDay();
        entity.setId(dto.id);

        entity.setConcert(concertService.findEntityById(dto.idConcert));
        entity.setDay(dayService.findEntityById(dto.idDay));
        return entity;
    }
}
