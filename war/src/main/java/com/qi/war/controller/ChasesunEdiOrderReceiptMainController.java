package com.qi.war.controller;

import com.qi.war.domain.ChasesunEdiOrderReceiptMain;
import com.qi.war.domain.ChasesunEdiOrderReceiptMainExample;
import com.qi.war.service.ChasesunEdiOrderReceiptMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-09-04 13:30
 * @description：Controller
 * @modified By：
 * @version: 1.0$
 */
@Controller
public class ChasesunEdiOrderReceiptMainController {

    @Autowired
    private ChasesunEdiOrderReceiptMainService chasesunEdiOrderReceiptMainService;

    @GetMapping("/all")
    @ResponseBody
    public String findAll() {
        ChasesunEdiOrderReceiptMainExample chasesunEdiOrderReceiptMainExample = new ChasesunEdiOrderReceiptMainExample();
        List<ChasesunEdiOrderReceiptMain> chasesunEdiOrderReceiptMains = chasesunEdiOrderReceiptMainService.selectByExample(chasesunEdiOrderReceiptMainExample);
        return chasesunEdiOrderReceiptMains.toString();
    }
}
