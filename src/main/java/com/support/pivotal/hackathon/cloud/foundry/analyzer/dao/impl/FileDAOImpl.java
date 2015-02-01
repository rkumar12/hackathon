package com.support.pivotal.hackathon.cloud.foundry.analyzer.dao.impl;

import java.io.InputStream;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.support.pivotal.hackathon.cloud.foundry.analyzer.dao.FileDao;
import com.support.pivotal.hackathon.cloud.foundry.analyzer.domain.FileDetails;

public class FileDAOImpl implements FileDao {
	
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	 public void setDataSource(DataSource dataSource) {
	  this.dataSource = dataSource;
	  this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	 }
	private JdbcTemplate fileJdbcTemplate;

	public void saveFile(FileDetails details) {
		InputStream fileInputStream = details.getFileInputStream();
		LobHandler lobHandler = new DefaultLobHandler();
		jdbcTemplate
				.update("INSERT INTO FILE_DETAILS (ID, NAME, FILE_DATA) VALUES (?, ?, ?)",
						new Object[] {
								details.getId(),
								details.getFileName(),
								new SqlLobValue(fileInputStream, details
										.getFileLength(), lobHandler), },
						new int[] { Types.INTEGER, Types.BIGINT, Types.BLOB });

	}

	public JdbcTemplate getFileJdbcTemplate() {
		return fileJdbcTemplate;
	}

	public void setFileJdbcTemplate(JdbcTemplate fileJdbcTemplate) {
		this.fileJdbcTemplate = fileJdbcTemplate;
	}

}
