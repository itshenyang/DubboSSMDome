package com.keruis.keruis_client.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2017/10/18.
 */
public class BaseController {




    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession httpSession;


    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.httpSession = request.getSession();
    }

}
