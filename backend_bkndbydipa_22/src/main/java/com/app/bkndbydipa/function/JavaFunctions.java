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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bkndbydipa.repository.OrganizationRepository;
import com.app.bkndbydipa.repository.EmployeePersonalInfoRepository;
import com.app.bkndbydipa.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
