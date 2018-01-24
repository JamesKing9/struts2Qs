/*
 * Copyright 2018 ShCheng.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cheng.struts2qs.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author james
 */
public class LoginAction extends ActionSupport {
    
    // 定义封装请求参数的username和password成员变量
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 定义处理用户请求的execute方法
    @Override
    public String execute() throws Exception {
        
        /** username */
        String user_name; 
        user_name = getUsername();
        /** password */
        String pwd;
        pwd = getPassword();
        
        // 当username为 cheng，password为123时即登录成功
        if (user_name.equals("cheng") && pwd.equals("123")) {
            
            // 将 user_name 放到 session 中，以便 welcome.jsp 中的使用，使用‘user’作为存取的key
            ActionContext.getContext().getSession().put("user", user_name);
            return SUCCESS;
        }
        return ERROR;
    }
}
