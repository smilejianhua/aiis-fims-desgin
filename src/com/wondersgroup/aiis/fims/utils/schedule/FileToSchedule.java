package com.wondersgroup.aiis.fims.utils.schedule;

import java.io.File;
import java.util.List;

import com.wondersgroup.aiis.fims.vo.Schedule;

public interface FileToSchedule {

	public List<Schedule> transform(File file);

}