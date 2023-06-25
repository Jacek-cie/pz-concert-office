package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.entities.admin;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore.AbstractEntity;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account extends AbstractEntity {

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String name;
    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String password;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "VARCHAR(100)",
            unique = true
    )
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_account_type",referencedColumnName="id",nullable=false)
    private AccountType accountType;


}
