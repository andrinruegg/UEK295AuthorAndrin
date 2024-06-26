package ch.noseryoung.AuthorAndrin296Uek.domain.authority;

import ch.noseryoung.AuthorAndrin296Uek.domain.role.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "authority")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authority_id")
    private Integer authorityId;

    @NotBlank
    @Column(name = "authority_name")
    private String authority_name;
/*
    @ManyToMany(mappedBy = "authorities")
    private Set<Role> roles;
*/
    public String getName() {
        return authority_name;
    }
}