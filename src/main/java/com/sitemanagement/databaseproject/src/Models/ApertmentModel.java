/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitemanagement.databaseproject.src.Models;

import com.sitemanagement.databaseproject.src.Interfaces.*;
import com.sitemanagement.databaseproject.src.Database.*;
import java.sql.*;

import java.util.List;
import java.util.Map;

/**
 *
 * @author tomahawk
 */
public class ApertmentModel  implements ModelInterface{
    private static final String TableName = "Project.Apartment";
    
    @Override
    public ResultSet select(Map<String, Object> whereParameters) throws Exception{
        // construct SQL statement
	StringBuilder sql = new StringBuilder();
	sql.append(" SELECT ");
	sql.append("	* ");
	sql.append(" FROM "+ TableName +" ");
        
        List<Map.Entry<String, Object>> whreParameterList = DatabaseUtilities.createWhereParameterList(whereParameters);
        
        sql.append(DatabaseUtilities.prepareWhereStatement(whreParameterList));
        
        Connection connection = DatabaseUtilities.getConnection();
	PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
	DatabaseUtilities.setWhereStatementParameters(preparedStatement, whreParameterList);
	ResultSet result = preparedStatement.executeQuery();
		
	return result;
    }

    @Override
    public int insert(String fieldNames, List<Object> rows) throws Exception
    {
            StringBuilder sql = new StringBuilder();
            sql.append(" INSERT INTO "+ TableName +" (" + fieldNames + ") " );
            sql.append(" VALUES ");

            String[] fieldList = fieldNames.split(",");

            int rowCount = 0;
            for (int i=0; i<rows.size(); i++) {
		if (rows.get(i) instanceof Managers) {
			rowCount++;
				
			Apartment apt = (Apartment)rows.get(i); 
	
			sql.append("(");
			for (int j=0; j<fieldList.length; j++) {
				String fieldName = fieldList[j].trim();
				sql.append(DatabaseUtilities.formatField(apt.getByName(fieldName)));
				if (j < fieldList.length - 1) {
					sql.append(", ");
				}
			}
			sql.append(")");
				
			if (i < rows.size() - 1) {
				sql.append(", ");
			}				
		}
		}		
		//System.out.println(sql.toString());
		
		
            // execute constructed SQL statement
            if (rowCount > 0) {
		Connection connection = DatabaseUtilities.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
		rowCount = preparedStatement.executeUpdate();
		preparedStatement.close();
            }
		
            return rowCount;
    }
		
    @Override
    public int update(Map<String,Object> updateParameters, Map<String,Object> whereParameters) throws Exception
    {
	// construct SQL statement
	StringBuilder sql = new StringBuilder();
	sql.append(" UPDATE "+ TableName +" SET ");
	int appendCount = 0;
	for (Map.Entry<String, Object> entry : updateParameters.entrySet()) {
		sql.append(entry.getKey() + " = " + DatabaseUtilities.formatField(entry.getValue()));
		if (++appendCount < updateParameters.size()) {
				sql.append(", ");
		}
	}
	List<Map.Entry<String, Object>> whereParameterList = DatabaseUtilities.createWhereParameterList(whereParameters);		
	sql.append(DatabaseUtilities.prepareWhereStatement(whereParameterList));
		
	
	// execute constructed SQL statement
	Connection connection = DatabaseUtilities.getConnection();
	PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
	DatabaseUtilities.setWhereStatementParameters(preparedStatement, whereParameterList);		
	int rowCount = preparedStatement.executeUpdate();
	preparedStatement.close();
		
	return rowCount;
    }

    @Override
    public int delete(Map<String,Object> whereParameters) throws Exception
    {
	// construct SQL statement
	StringBuilder sql = new StringBuilder();
	sql.append(" DELETE FROM "+ TableName +" ");

	List<Map.Entry<String, Object>> whereParameterList = DatabaseUtilities.createWhereParameterList(whereParameters);		
	sql.append(DatabaseUtilities.prepareWhereStatement(whereParameterList));
	//System.out.println(sql.toString());

	
	// execute constructed SQL statement
	Connection connection = DatabaseUtilities.getConnection();
	PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
	DatabaseUtilities.setWhereStatementParameters(preparedStatement, whereParameterList);		
	int rowCount = preparedStatement.executeUpdate();
	preparedStatement.close();
		
	return rowCount;
    }
}
