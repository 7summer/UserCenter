/*
 Navicat Premium Data Transfer

 Source Schema         : usercenter

 Target Server Type    : MySQL

 Date: 28/05/2024 19:46:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL COMMENT '昵称',
  `description` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL COMMENT '用户描述',
  `avatarUrl` varchar(1024) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL COMMENT '头像',
  `email` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `userAccount` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL COMMENT '账号',
  `userPassword` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL COMMENT '密码',
  `userStatus` int(0) NOT NULL DEFAULT 0 COMMENT '用户状态',
  `userRole` tinyint(0) NOT NULL DEFAULT 0 COMMENT '0-普通用户 1-管理员',
  `createTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `isDelete` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否删除（逻辑）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'test', '一个积极上进的男生，正在学spring', 'https://picdl.sunbangyan.cn/2023/11/17/d4feeca68ee1a3e62154d587c1375a7b.jpg', '', 'test', 'e1c0e0463d624e41e3a383b21a2972eb', 0, 0, '2023-09-04 22:01:44', '2023-12-05 09:24:44', 0);


SET FOREIGN_KEY_CHECKS = 1;
