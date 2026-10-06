package com.hsh.hsh.ctrl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.autoconfigure.PageHelperProperties;
import com.hsh.hsh.entity.Admin;
import com.hsh.hsh.respond.Res;
import com.hsh.hsh.service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "管理员信息管理")
@RestController
public class AdminCtrl {
    @Resource
    private AdminService adminService;
    @Autowired
    private PageHelperProperties pageHelperProperties;


    @Operation(summary = "新增管理员")
    @PostMapping("/admin/add")
    public Res add(@RequestBody Admin admin){
        adminService.save(admin);
        return Res.success();
    }
    @Operation(summary = "管理员信息列表")
    @PostMapping("/admin/list")
    public Res<PageInfo<Admin>> list(@RequestBody Admin admin,@RequestParam Integer pagNum,@RequestParam Integer pageSize){
        LambdaQueryWrapper<Admin> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(admin.getName()!=null,Admin::getName,admin.getName());
        lambdaQueryWrapper.like(admin.getTel()!=null,Admin::getTel,admin.getTel());
        lambdaQueryWrapper.like(admin.getUsername()!=null,Admin::getUsername,admin.getUsername());

        PageHelper.startPage(pagNum,pageSize);

        List<Admin> list = adminService.list();
        PageInfo<Admin> pageInfo = new PageInfo<>(list);
        return Res.data(pageInfo);
    }
    @Operation(summary = "修改管理员")
    @PostMapping("/admin/update")
    public  Res update(@RequestBody Admin admin){
        adminService.updateById(admin);
        return Res.success();
    }
    @Operation(summary = "删除管理员")
    @PostMapping("/admin/del")
    public Res del(@RequestParam Long id) {
        adminService.removeById(id);
        return Res.success();
    }
}
