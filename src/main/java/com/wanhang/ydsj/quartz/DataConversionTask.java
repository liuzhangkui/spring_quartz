package com.wanhang.ydsj.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wanhang.ydsj.service.UserService;

public class DataConversionTask {

	private static final Logger LOG = LoggerFactory.getLogger(DataConversionTask.class);
	@Autowired
	private UserService userService;

	public void run() {

		System.out.println("开始任务调度");
		if (LOG.isInfoEnabled()) {
			LOG.info("数据转换任务线程开始执行");
		}
		System.out.println("添加用户返回的用户Id为:" + userService.addUser());
	}
}
