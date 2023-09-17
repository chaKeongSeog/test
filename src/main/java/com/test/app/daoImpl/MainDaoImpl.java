package com.test.app.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.test.app.dao.MainDao;
import com.test.app.dto.UserDto;

@Repository
@SuppressWarnings("unchecked")   // 부적절한 컴파일러의 경고를 제거
public class MainDaoImpl implements MainDao{

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	

	@Override
	public List<UserDto> getUserInfo() {
		List<UserDto> lists = sqlMapClientTemplate.queryForList("common.getList");
		return lists;
	}

}
