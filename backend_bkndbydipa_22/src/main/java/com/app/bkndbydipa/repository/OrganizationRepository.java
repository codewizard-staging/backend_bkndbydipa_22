package com.app.bkndbydipa.repository;

import com.app.bkndbydipa.model.Organization;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrganizationRepository extends SimpleJpaRepository<Organization, String> {
    private final EntityManager em;
    public OrganizationRepository(EntityManager em) {
        super(Organization.class, em);
        this.em = em;
    }
    @Override
    public List<Organization> findAll() {
        return em.createNativeQuery("Select * from \"bkndbydipa\".\"Organization\"", Organization.class).getResultList();
    }
}