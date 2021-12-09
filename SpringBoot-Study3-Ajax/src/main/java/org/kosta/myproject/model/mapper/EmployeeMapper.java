package org.kosta.myproject.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.model.domain.EmployeeDTO;

@Mapper //어노테이션을 붙여야 프록시 생성됨
public interface EmployeeMapper {
	public List<EmployeeDTO> findEmployeeListByDeptNo(int deptNo);

	public List<EmployeeDTO> findEmployeeListDynamicSQL(EmployeeDTO employeeDTO);

	public List<EmployeeDTO> findEmployeeListByDeptNo(EmployeeDTO employeeDTO); 
}
