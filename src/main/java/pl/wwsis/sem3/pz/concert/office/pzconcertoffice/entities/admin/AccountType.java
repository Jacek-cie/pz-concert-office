package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;

import java.util.Collection;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account_type")
public class AccountType extends AbstractEntity {

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)",
            unique = true
    )
    private String name;
    @OneToMany(mappedBy = "accountType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<Account> accounts;


}
