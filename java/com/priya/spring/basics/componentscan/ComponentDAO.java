package com.priya.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.priya.spring.basics.springin5steps.scope.JDBCConnection;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcConnection;
	
	
	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	

}