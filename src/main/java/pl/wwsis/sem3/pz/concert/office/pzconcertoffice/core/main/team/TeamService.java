package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.team;

import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.TeamDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Team;
@Service
public class TeamService extends AbstractService<TeamDto, Team> {
    @Override
    public TeamDto toDto(Team entity) {
        TeamDto dto = new TeamDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.name = entity.getName();
       //TODO lista
        return dto;

    }

    @Override
    public Team toEntity(TeamDto dto) {
        Team entity = new Team();
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        entity.setName(dto.name);
        return entity;
    }
}
