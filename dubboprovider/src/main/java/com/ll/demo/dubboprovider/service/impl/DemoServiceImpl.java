package com.ll.demo.dubboprovider.service.impl;

import com.alibaba.dubbo.common.Version;

import com.alibaba.dubbo.config.annotation.Service;
import com.ll.demo.dubboInterface.service.DemoService;


@Service(version="1.0.1")
public class DemoServiceImpl implements DemoService {

	@Override
	public int getLength(String words) {
		if (words == null || words.isEmpty()) {
			return -1;
		} else {
			return words.length();
		}
	}
}
