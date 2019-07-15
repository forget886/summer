package com.xinwu.controller;

import com.xinwu.vo.ResultFactory;
import com.xinwu.vo.Result;
import com.xinwu.vo.VueLoginInfoVo;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

/**
 * @author: 张辉
 * @create: 2019-07-01
 **/
@RestController
@RequestMapping
public class LoginController {

    /**
     * 登录控制器，前后端分离用的不同协议和端口，所以需要加入@CrossOrigin支持跨域。
     * 给VueLoginInfoVo对象加入@Valid注解，并在参数中加入BindingResult来获取错误信息。
     * 在逻辑处理中我们判断BindingResult知否含有错误信息，如果有错误信息，则直接返回错误信息。
     */
    @CrossOrigin
    @PostMapping(value = "/api/login")
    public Result login(@Valid @RequestBody VueLoginInfoVo loginInfoVo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String message = String.format("登陆失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        if (!Objects.equals("admin", loginInfoVo.getUsername()) || !Objects.equals("admin", loginInfoVo.getPassword())) {
            String message = String.format("登陆失败，详细信息[用户名、密码信息不正确]。");
            return ResultFactory.buildFailResult(message);
        }
        return ResultFactory.buildSuccessResult("登陆成功。");
    }
}
