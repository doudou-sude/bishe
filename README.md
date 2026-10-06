# 管理员信息管理系统（实习项目）

基于 Spring Boot 3.2.5 + MyBatis-Plus 的后端 API 项目。

## 技术栈
- Spring Boot 3.2.5
- MyBatis-Plus 3.5.17
- MySQL 8.0
- Druid 连接池
- Knife4j (Swagger3)

## 已完成功能
- [x] 管理员信息的增、删、改、查
- [x] 多条件动态分页查询
- [x] 统一响应体封装、全局异常处理
- [x] 接口文档集成

## 如何运行
1. 导入 `shixijiaban` 数据库，执行 SQL 脚本（建表）。
2. 修改 `application.yml` 中的数据库账号密码。
3. 运行 `ShixijiabanApplication` 主类。
4. 访问接口文档：http://localhost:8080/hsh/doc.html
