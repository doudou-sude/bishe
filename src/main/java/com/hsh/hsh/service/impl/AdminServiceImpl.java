package com.hsh.hsh.service.impl;

import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.hsh.hsh.entity.Admin;
import com.hsh.hsh.mapper.AdminMapper;
import com.hsh.hsh.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
