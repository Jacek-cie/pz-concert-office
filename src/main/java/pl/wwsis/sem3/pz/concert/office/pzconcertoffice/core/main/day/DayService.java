package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.concert.type.ConcertTypeService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.DayDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Day;

@Service
public class DayService extends AbstractService<DayDto, Day> {
    @Autowired
    private ConcertTypeService concertTypeService;

    @Override
    public DayDto toDto(Day entity) {
        DayDto dto = new DayDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();

        dto.startDate =entity.getStartDate();
        return dto;
    }

    @Override
    public Day toEntity(DayDto dto) {
        Day entity = new Day();
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        entity.setStartDate(dto.startDate);

        return entity;

    }
}
