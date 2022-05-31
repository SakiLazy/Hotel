/*
Navicat MySQL Data Transfer

Source Server         : 123456
Source Server Version : 80028
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 80028
File Encoding         : 65001

Date: 2022-05-28 16:56:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for adminuser
-- ----------------------------
DROP TABLE IF EXISTS `adminuser`;
CREATE TABLE `adminuser` (
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of adminuser
-- ----------------------------
INSERT INTO `adminuser` VALUES ('sakilazy', '123');

-- ----------------------------
-- Table structure for oorder
-- ----------------------------
DROP TABLE IF EXISTS `oorder`;
CREATE TABLE `oorder` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `in_date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `out_date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of oorder
-- ----------------------------
INSERT INTO `oorder` VALUES ('1', '123', '豪华大床房', '388', '2022-5-26', '2022-5-30');
INSERT INTO `oorder` VALUES ('7', '123', '豪华大床房', '388', '2022-5-6', '2022-8-9');
INSERT INTO `oorder` VALUES ('8', '123', '温馨家庭房', '488', '2022-5-6', '2022-8-9');
INSERT INTO `oorder` VALUES ('9', '123', '豪华双人床', '388', '2022-5-6', '2022-8-9');
INSERT INTO `oorder` VALUES ('10', '123', '漫步星空', '688', '2022-5-6', '2022-8-9');
INSERT INTO `oorder` VALUES ('11', '112233', '温馨家庭房', '488', '2022-5-8', '2022-5-10');
INSERT INTO `oorder` VALUES ('12', '123', '漫步星空', '688', '2022-5-6', '2022-8-9');
INSERT INTO `oorder` VALUES ('14', '112233', '温馨家庭房', '488', '2022-5-6', '2022-5-10');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `type` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `stock` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('豪华大床房', '388', '99');
INSERT INTO `room` VALUES ('豪华双人床', '388', '60');
INSERT INTO `room` VALUES ('温馨家庭房', '488', '50');
INSERT INTO `room` VALUES ('星河漫步', '688', '9');
INSERT INTO `room` VALUES ('普通单人床房', '288', '46');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '123123', '13213245678', '123@123.co');
INSERT INTO `user` VALUES ('4', '112233', '112233', '13213245238', '112233@qq.co');
