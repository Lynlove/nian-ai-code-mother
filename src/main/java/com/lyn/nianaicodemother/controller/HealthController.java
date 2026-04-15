package com.lyn.nianaicodemother.controller;

import com.lyn.nianaicodemother.common.BaseResponse;
import com.lyn.nianaicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/")
    public BaseResponse<String> healthCheck(){
        return ResultUtils.success("ok");
    }
}
