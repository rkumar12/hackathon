package com.support.pivotal.hackathon.cloud.foundry.analyzer.dao;

import com.support.pivotal.hackathon.cloud.foundry.analyzer.domain.FileDetails;

public interface FileDao {
	public void saveFile(FileDetails details);
}
