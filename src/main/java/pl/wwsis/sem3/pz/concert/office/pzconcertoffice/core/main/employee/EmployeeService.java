package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.core.main.employee;

import org.springframework.stereotype.Service;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractService;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.dtos.main.EmployeeDto;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.main.Employee;
@Service
public class EmployeeService extends AbstractService<EmployeeDto, Employee> {
    @Override
    public EmployeeDto toDto(Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        dto.id = entity.getId();
        dto.version = entity.getVersion();
        dto.name = entity.getName();
        dto.surname =entity.getSurname();
        //TODO moze lista zespolow
        return dto;
    }

    @Override
    public Employee toEntity(EmployeeDto dto) {
        Employee entity = new Employee();
        entity.setId(dto.id);
        entity.setVersion(dto.version);
        entity.setName(dto.name);
        entity.setSurname(dto.surname);
        return entity;
    }
}
