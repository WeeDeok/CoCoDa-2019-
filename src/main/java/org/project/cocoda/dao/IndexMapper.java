package org.project.cocoda.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IndexMapper {

	public List<Map<String, Object>> division_middle(String sales_divison_l_cd);

	public HashMap<String, Object> divisionMap(String sales_division_s_cd);

	public String divisionNm(String sales_division_s_cd);

}
