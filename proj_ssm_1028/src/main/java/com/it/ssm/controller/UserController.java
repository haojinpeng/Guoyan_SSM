package com.it.ssm.controller;
import com.alibaba.fastjson.JSONObject;
import com.it.ssm.pojo.User;
import com.it.ssm.services.IUserService;
import com.it.ssm.utils.PageUtil;

import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    //测试
    @RequestMapping("queryAll")
    public String queryAll(User user){
        List<User> users = iUserService.queryAllUser1(user);
        System.out.println(users.size());
        return "success";
    }

    //转发到前端
    @RequestMapping("toIndex")
    public String toIndex(){
        return "queryAll";
    }

    @RequestMapping(value = "queryAllUser",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject queryAllUser(HttpServletRequest request, HttpServletResponse response, String page, String limit, String su_name){

            System.out.println("起始页-->" + page);
            System.out.println("每页大小-->" + limit);
            //处理乱码
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");

            int pageno = 1;
            int pageRow = 10;
            if (!"".equals(page) && page != null) {
                pageno = Integer.parseInt(page);
            }
            if (!"".equals(limit) && limit != null) {
                pageRow = Integer.parseInt(limit);
            }

            //总记录数
            Map<String, Object> paramMap = new HashMap<String, Object>();

        //判断是否有模糊查询
        if(!"".equals(su_name) && su_name!=null){
            System.out.println("su_name--->"+su_name);
            paramMap.put("su_name",su_name);
        }

            int total_rows = iUserService.queryUserCount(paramMap);
            JSONObject jsonObject = new JSONObject();
            if (total_rows == 0) {
                jsonObject.put("code", 0);
                jsonObject.put("msg", "暂无数据");
                jsonObject.put("count", 0);
                jsonObject.put("data", "[]");
                return jsonObject;
            }

            //有值
            paramMap = PageUtil.setPageParam(pageno, pageRow, total_rows, paramMap);
            List<User> userList = iUserService.queryAllUser(paramMap);
            jsonObject.put("code", 0);
            jsonObject.put("msg", "正在加载...");
            jsonObject.put("count", total_rows);
            jsonObject.put("data", JSONArray.fromObject(userList));
            return jsonObject;

    }

    //删除
    /*@RequestMapping(value = "delUser",method = RequestMethod.POST)
    public JSONObject delUser(int id){
        System.out.println("------delUser------------>"+id);
        JSONObject jsonObject = new JSONObject();
        System.out.println(jsonObject.toString());
        System.out.println("2");
        int rs = iUserService.delUser(id);
        System.out.println(rs);
        System.out.println("1");
        if(rs>0){
            jsonObject.put("success", "删除成功！！！");
        }else{
            jsonObject.put("success", false);
            jsonObject.put("errorMsg", "删除失败");
        }
        return jsonObject;
    }*/
    @RequestMapping(value = "delUser",method = RequestMethod.POST)
    public JSONObject delUser(int id){
        System.out.println("------delUser------------>"+id);
        JSONObject jsonObject = new JSONObject();
        int rs = iUserService.delUser(id);
        if(rs>0){
            jsonObject.put("success", "删除成功！！！");

        }else{
            jsonObject.put("success", false);
            jsonObject.put("errorMsg", "删除失败");
        }

        return jsonObject;
    }

    /**
     * 去登录
     */
    @RequestMapping(value = "toLogin")
    public String toLogin(){
        System.out.println("-------toLogin--------");
        return "login";
    }

    /**
     * 去主页
     */
    @RequestMapping(value = "toMain")
    public String toMain(){
        System.out.println("-------toMain---------");
        return "main";
    }

    //login登陆
    @RequestMapping(value = "loginUser")
    @ResponseBody
    public JSONObject loginUser(User user){
        System.out.println("-------loginUser---------------"+user);
        JSONObject jsonObject = new JSONObject();
        try {
            boolean flag = iUserService.login(user);
            System.out.println("flag--"+flag);
            if (flag){
                jsonObject.put("flag","1");
            }else {
                jsonObject.put("flag","0");
            }
            System.out.println(jsonObject.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonObject;
    }
}
