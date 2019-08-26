package com.qi.properties.controller;

import cn.hutool.core.lang.Dict;
import com.qi.properties.entity.ApplicationProperty;
import com.qi.properties.entity.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-26 15:15
 * @description：PropertyController
 * @modified By：
 * @version: $version$
 */
@RestController
public class PropertyController {
	private final ApplicationProperty applicationProperty;
	private final DeveloperProperty developerProperty;

	@Autowired
	public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
		this.applicationProperty = applicationProperty;
		this.developerProperty = developerProperty;
	}

	@GetMapping("/property")
	public Dict index() {
		return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
	}
}
