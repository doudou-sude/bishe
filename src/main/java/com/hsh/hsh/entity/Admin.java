package com.hsh.hsh.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@TableName("admin")
@Schema(description = "管理员信息实体类")
public class Admin {
    /* 主键ID */
    @TableId(type = IdType.AUTO)
    private Long id;
    /* 用户名 */
    @Schema(description = "用户名")
    private String username;
    /* 密码 */
    @Schema(description = "密码")
    private String userpwd;
    /* 昵称 */
    @Schema(description = "昵称")
    private String name;
    /* 性别 */
    @Schema(description = "性别")
    private String sex;
    /* 电话 */
    @Schema(description = "电话")
    private String tel;
    /* 头像 */
    @Schema(description = "头像")
    private String headurl;
}
