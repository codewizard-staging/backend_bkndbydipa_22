package com.app.bkndbydipa.function;

import com.app.bkndbydipa.model.Organization;
import com.app.bkndbydipa.model.EmployeePersonalInfo;
import com.app.bkndbydipa.model.EmlpoyeeProfile;




import com.app.bkndbydipa.enums.EmploymentType;
import com.app.bkndbydipa.enums.OrgDept;
import com.app.bkndbydipa.enums.OrgBranch;
import com.app.bkndbydipa.converter.OrgBranchConverter;
import com.app.bkndbydipa.converter.EmploymentTypeConverter;
import com.app.bkndbydipa.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  