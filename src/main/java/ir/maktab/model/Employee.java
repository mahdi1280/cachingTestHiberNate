package ir.maktab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Cacheable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Employee extends BaseEntity{
    private String name;
    private float salary;
}
