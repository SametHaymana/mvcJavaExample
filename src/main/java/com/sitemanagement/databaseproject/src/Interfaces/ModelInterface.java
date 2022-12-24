/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitemanagement.databaseproject.src.Interfaces;

import java.sql.*;
import java.util.*;

/**
 *
 * @author tomahawk
 */
public interface ModelInterface {

	abstract ResultSet select(Map<String, Object> whereParameters) throws Exception;
	
	abstract int insert(String fieldNames, List<Object> rows) throws Exception;
		
	abstract int update(Map<String,Object> updateParameters, Map<String,Object> whereParameters) throws Exception;

	abstract int delete(Map<String,Object> whereParameters) throws Exception;
	

}
